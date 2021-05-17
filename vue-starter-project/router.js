import { createWebHistory, createRouter } from "vue-router";
import Test from './src/components/Test.vue';
import NotStartedPage from "./src/components/NotStartedPage.vue";
import InProgressPage from "./src/components/InProgressPage.vue";
import CompletedPage from "./src/components/CompletedPage.vue";

const routes = [
  {
    path: "/",
    component: NotStartedPage,
  },

  {
    path: "/not-started",
    component: NotStartedPage
  },

  {
    path: "/in-progress",
    component: InProgressPage
  },

  {
    path: "/complete",
    component: CompletedPage
  },
  {
    path: "/Test",
    name: "Test",
    component: Test,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes: routes,
});

export default router;