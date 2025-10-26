import { createRouter, createWebHistory } from 'vue-router';
import UserView from '../views/UserView.vue'
import AboutView from '@/views/AboutView.vue';

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: '/user/mike',
            name: 'userMike',
            component: UserView
        },
        {
            path: '/user/john',
            name: 'userJohn',
            component: UserView,
        },
        {
            path: '/user/info',
            name: 'user',
            component: UserView,
        },
        {
            path: '/:user/:id',
            name: 'user',
            component: UserView,
        },
        {
            path: '/aboutView',
            name: 'abView',
            component: AboutView,
        }
    ],
});

export default router
