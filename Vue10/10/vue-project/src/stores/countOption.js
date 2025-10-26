import { defineStore } from 'pinia';
import { computed, ref } from 'vue';
export const useCountOptionStore = defineStore('countSetup', () => {
    const num = ref(10);
    const doubleNum = computed(() => num.value * 2);
    const doubleNumPlusOne = computed(() => doubleNum.value + 1);

    return {
        num,
        doubleNum,
        doubleNumPlusOne,
    };
});