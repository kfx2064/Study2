import { defineStore } from 'pinia';
import { computed, ref } from 'vue';
export const useCountSetupStore = defineStore('countSetup', () => {
    const json = ref(null);

    const num = ref(10);
    const doubleNum = computed(() => num.value * 2);
    const doubleNumPlusOne = computed(() => doubleNum.value + 1);

    const increment = () => {
        num.value++;
    };

    const getJSON = (url) => {
        increment();
        fetch(url)
            .then((response) => response.json())
            .then((json) => {
                json.value = json;
            });
    };

    return {
        num,
        doubleNum,
        doubleNumPlusOne,
        json,
        increment,
        getJSON,
    };
});