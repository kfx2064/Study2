import { createRouter, createWebHistory, isNavigationFailure } from 'vue-router'

import Home from '@/pages/Home.vue'
import About from '@/pages/About.vue'
import Members from '@/pages/Members.vue'
import MemberInfo from '@/pages/MemberInfo.vue'
import Videos from '@/pages/Videos.vue'
import VideoPlayer from '@/pages/VideoPlayer.vue'
import NotFound from '@/pages/NotFound.vue'

const membersIdGuard = (to, from) => {
    if (from.name !== "members" && from.name !== "members/id") {
        return false;
    }
}

const Home = () => import(/* webpackChunkName: "home" */ '@/pages/Home.vue');
const About = () => import(/* webpackChunkName: "home" */ '@/pages/About.vue');
const Members = () => import(/* webpackChunkName: "members" */ '@/pages/Members.vue');
const MemberInfo = () => import(/* webpackChunkName: "members" */ '@/pages/MemberInfo.vue');
const Videos = () => import(/* webpackChunkName: "videos" */ '@/pages/Videos.vue');
const VideoPlayer = () => import(/* webpackChunkName: "home" */ '@/pages/VideoPlayer.vue');
const NotFound = () => import(/* webpackChunkName: "home" */ '@/pages/VideoPlayer.vue');

const router = createRouter({
    history: createWebHistory(),
    routes : [
        { path: '/', name:'home', component: Home },
        { path: '/about', name:'about', component: About },
        { path: '/members', name:'members', component: Members },
        { 
            path: '/members/:id', name:'members/id', component: MemberInfo,
            beforeEnter:membersIdGuard, props:true
        },
        {
            path: '/videos', name:'videos', component: Videos,
            children : [
                { path : ':id', name:'videos/id', component: VideoPlayer }
            ]
        },
        { path: '/:paths(.*)*', name: "NotFound", component: NotFound },
    ]
})

router.beforeEach((to) => {
    if (to.query && Object.keys(to.query).length > 0) {
        return { path:to.path, query:{}, params: to.params };
    }
})

router.afterEach((to, from, failure) => {
    if (isNavigationFailure(failure)) {
        console.log("@@ 내비게이션 중단 : ", failure)
    }
})

export default router;