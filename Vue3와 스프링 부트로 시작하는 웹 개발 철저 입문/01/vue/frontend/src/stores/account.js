import { defineStore } from 'pinia'
import {check} from "@/services/accountService.js";

export const useAccountStore = defineStore("account", {
    state: () => ({
        checked: false,
        loggedIn: false,
    }),
    actions: {
        setChecked(val) {
            this.checked = val;
        },
        setLoggedIn(val) {
            this.loggedIn = val;
        },
    },
});
