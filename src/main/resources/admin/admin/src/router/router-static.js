import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yuangong from '@/views/modules/yuangong/list'
    import zhengjianxinxi from '@/views/modules/zhengjianxinxi/list'
    import shigudengji from '@/views/modules/shigudengji/list'
    import yewudanju from '@/views/modules/yewudanju/list'
    import baoyangdengji from '@/views/modules/baoyangdengji/list'
    import weizhangxinxi from '@/views/modules/weizhangxinxi/list'
    import cheliangxinxi from '@/views/modules/cheliangxinxi/list'
    import jiayoudengji from '@/views/modules/jiayoudengji/list'
    import weixiudengji from '@/views/modules/weixiudengji/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/zhengjianxinxi',
        name: '证件信息',
        component: zhengjianxinxi
      }
      ,{
	path: '/shigudengji',
        name: '事故登记',
        component: shigudengji
      }
      ,{
	path: '/yewudanju',
        name: '业务单据',
        component: yewudanju
      }
      ,{
	path: '/baoyangdengji',
        name: '保养登记',
        component: baoyangdengji
      }
      ,{
	path: '/weizhangxinxi',
        name: '违章信息',
        component: weizhangxinxi
      }
      ,{
	path: '/cheliangxinxi',
        name: '车辆信息',
        component: cheliangxinxi
      }
      ,{
	path: '/jiayoudengji',
        name: '加油登记',
        component: jiayoudengji
      }
      ,{
	path: '/weixiudengji',
        name: '维修登记',
        component: weixiudengji
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
