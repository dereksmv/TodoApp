import { createWebHistory, createRouter } from "vue-router";
import HelloWorld from './src/components/HelloWorld.vue';
import Test from './src/components/Test.vue';

const routes = [
  {
    path: "/",
    name: "Home",
    component: HelloWorld,
  },
  {
    path: "/Test",
    name: "Test",
    component: Test,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;