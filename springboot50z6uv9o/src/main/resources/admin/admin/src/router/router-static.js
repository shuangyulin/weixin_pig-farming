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
	import jiankangjilu from '@/views/modules/jiankangjilu/list'
	import news from '@/views/modules/news/list'
	import nonghu from '@/views/modules/nonghu/list'
	import siliaoxinxi from '@/views/modules/siliaoxinxi/list'
	import fangyijihua from '@/views/modules/fangyijihua/list'
	import siliaozhonglei from '@/views/modules/siliaozhonglei/list'
	import zhudepinzhong from '@/views/modules/zhudepinzhong/list'
	import storeup from '@/views/modules/storeup/list'
	import jibingdengji from '@/views/modules/jibingdengji/list'
	import zhiwu from '@/views/modules/zhiwu/list'
	import chengzhangdengji from '@/views/modules/chengzhangdengji/list'
	import shengzhuxinxi from '@/views/modules/shengzhuxinxi/list'
	import zhushemianji from '@/views/modules/zhushemianji/list'
	import siliaochuku from '@/views/modules/siliaochuku/list'
	import siliaoruku from '@/views/modules/siliaoruku/list'
	import huanjingtiaojian from '@/views/modules/huanjingtiaojian/list'
	import config from '@/views/modules/config/list'
	import dongwujianyi from '@/views/modules/dongwujianyi/list'
	import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
	path: '/',
	name: '系统首页',
	component: Index,
	children: [{
		// 这里不设置值，是把main作为默认页面
		path: '/',
		name: '系统首页',
		component: Home,
		meta: {icon:'', title:'center', affix: true}
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
		path: '/jiankangjilu',
		name: '健康记录',
		component: jiankangjilu
	}
	,{
		path: '/news',
		name: '通知公告',
		component: news
	}
	,{
		path: '/nonghu',
		name: '农户',
		component: nonghu
	}
	,{
		path: '/siliaoxinxi',
		name: '饲料信息',
		component: siliaoxinxi
	}
	,{
		path: '/fangyijihua',
		name: '防疫计划',
		component: fangyijihua
	}
	,{
		path: '/siliaozhonglei',
		name: '饲料种类',
		component: siliaozhonglei
	}
	,{
		path: '/zhudepinzhong',
		name: '猪的品种',
		component: zhudepinzhong
	}
	,{
		path: '/storeup',
		name: '我的收藏',
		component: storeup
	}
	,{
		path: '/jibingdengji',
		name: '疾病登记',
		component: jibingdengji
	}
	,{
		path: '/zhiwu',
		name: '治污',
		component: zhiwu
	}
	,{
		path: '/chengzhangdengji',
		name: '成长登记',
		component: chengzhangdengji
	}
	,{
		path: '/shengzhuxinxi',
		name: '生猪信息',
		component: shengzhuxinxi
	}
	,{
		path: '/zhushemianji',
		name: '猪舍面积',
		component: zhushemianji
	}
	,{
		path: '/siliaochuku',
		name: '饲料出库',
		component: siliaochuku
	}
	,{
		path: '/siliaoruku',
		name: '饲料入库',
		component: siliaoruku
	}
	,{
		path: '/huanjingtiaojian',
		name: '环境条件',
		component: huanjingtiaojian
	}
	,{
		path: '/config',
		name: '轮播图管理',
		component: config
	}
	,{
		path: '/dongwujianyi',
		name: '动物检疫',
		component: dongwujianyi
	}
	,{
		path: '/newstype',
		name: '通知公告分类',
		component: newstype
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
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}
export default router;
