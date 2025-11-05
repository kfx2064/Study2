import { defineStore } from 'pinia';
import axios from 'axios';
import { computed, ref } from 'vue';
import dayjs from 'dayjs';

const axiosInstance = axios.create({
    baseURL: 'https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline',
    params: {
        lang: 'ko',
        key: 'FHRL5DXW7WELFAWSVADAWSMRZ',
        unitGroup: 'metric',
    },
});

export const useWeahterStore = defineStore('weather', () => {
    const address = ref('seoul');
    const currentConditions = ref(null);
    const days = ref(null);
    const searchData = ref([]);
    
    const hours = computed(() => {
        return days.value
            ?.find((v) => v.datetime === dayjs().format('YYYY-MM-DD'))
            ?.hours.filter((v) => v.datetime > dayjs().format('HH:mm:ss'));
    });

    const getCurrentWeatherInfo = async () => {
        try {
            const res = await axiosInstance.get('/' + address.value);
            currentConditions.value = res.data.currentConditions;
            days.value = res.data.days;
        } catch (e) {
            alert(e.response?.data ? e.response?.data : e.message);
        }
    };

    const forecast = computed(() => {
        return days.value?.filter((v) => v.datetime > dayjs().format('YYYY-MM-DD'));
    });

    const getSearchWeatherInfo = async (city) => {
        try {
            const res = await axiosInstance.get('/' + city);
            const printData = {
                address: res.data.address,
                feelslikemax: res.data.days[0].feelslikemax,
                feelslikemin: res.data.days[0].feelslikemin,
                icon: res.data.currentConditions.icon,
                temp: res.data.currentConditions.temp,
            };

            if (
                searchData.value.findIndex((v) => v.address === res.data.address) === -1
            ) {
                searchData.value.push(printData);
            } else {
                alert('이미 조회한 지역입니다.');
            }
        } catch (e) {
            alert(e.response?.data ? e.response?.data : e.message);
        }
    };

    return { currentConditions, hours, forecast, searchData, 
        getCurrentWeatherInfo, getSearchWeatherInfo, };
});