<template>
	<div class="addEdit-block">
		<el-form
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="180px"
		>
			<template >
				<el-form-item class="input" v-if="type!='info'"  label="生猪编号" prop="shengzhubianhao" >
					<el-input v-model="ruleForm.shengzhubianhao" placeholder="生猪编号" clearable  :readonly="ro.shengzhubianhao"></el-input>
				</el-form-item>
				<el-form-item v-else class="input" label="生猪编号" prop="shengzhubianhao" >
					<el-input v-model="ruleForm.shengzhubianhao" placeholder="生猪编号" readonly></el-input>
				</el-form-item>
				<el-form-item class="select" v-if="type!='info'"  label="猪的品种" prop="zhudepinzhong" >
					<el-select :disabled="ro.zhudepinzhong" v-model="ruleForm.zhudepinzhong" placeholder="请选择猪的品种" >
						<el-option
							v-for="(item,index) in zhudepinzhongOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item v-else class="input" label="猪的品种" prop="zhudepinzhong" >
					<el-input v-model="ruleForm.zhudepinzhong"
						placeholder="猪的品种" readonly></el-input>
				</el-form-item>
				<el-form-item class="date" v-if="type!='info'" label="出生日期" prop="chushengriqi" >
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.chushengriqi" 
						type="date"
						:readonly="ro.chushengriqi"
						placeholder="出生日期"
					></el-date-picker> 
				</el-form-item>
				<el-form-item class="input" v-else-if="ruleForm.chushengriqi" label="出生日期" prop="chushengriqi" >
					<el-input v-model="ruleForm.chushengriqi" placeholder="出生日期" readonly></el-input>
				</el-form-item>
				<el-form-item class="select" v-if="type!='info'"  label="性别" prop="xingbie" >
					<el-select :disabled="ro.xingbie" v-model="ruleForm.xingbie" placeholder="请选择性别" >
						<el-option
							v-for="(item,index) in xingbieOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item v-else class="input" label="性别" prop="xingbie" >
					<el-input v-model="ruleForm.xingbie"
						placeholder="性别" readonly></el-input>
				</el-form-item>
				<el-form-item class="input" v-if="type!='info'"  label="体重" prop="tizhong" >
					<el-input v-model="ruleForm.tizhong" placeholder="体重" clearable  :readonly="ro.tizhong"></el-input>
				</el-form-item>
				<el-form-item v-else class="input" label="体重" prop="tizhong" >
					<el-input v-model="ruleForm.tizhong" placeholder="体重" readonly></el-input>
				</el-form-item>
				<el-form-item class="input" v-if="type!='info'"  label="产仔情况" prop="chanziqingkuang" >
					<el-input v-model="ruleForm.chanziqingkuang" placeholder="产仔情况" clearable  :readonly="ro.chanziqingkuang"></el-input>
				</el-form-item>
				<el-form-item v-else class="input" label="产仔情况" prop="chanziqingkuang" >
					<el-input v-model="ruleForm.chanziqingkuang" placeholder="产仔情况" readonly></el-input>
				</el-form-item>
				<el-form-item class="upload" v-if="type!='info' && !ro.jianyizhengming" label="检疫证明" prop="jianyizhengming" >
					<file-upload
						tip="点击上传检疫证明"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.jianyizhengming?ruleForm.jianyizhengming:''"
						@change="jianyizhengmingUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item class="upload" v-else-if="ruleForm.jianyizhengming" label="检疫证明" prop="jianyizhengming" >
					<img v-if="ruleForm.jianyizhengming.substring(0,4)=='http'&&ruleForm.jianyizhengming.split(',w').length>1" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.jianyizhengming" width="100" height="100">
					<img v-else-if="ruleForm.jianyizhengming.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.jianyizhengming.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.jianyizhengming.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item class="select" v-if="type!='info'"  label="母猪品种" prop="muzhupinzhong" >
					<el-select :disabled="ro.muzhupinzhong" v-model="ruleForm.muzhupinzhong" placeholder="请选择母猪品种" >
						<el-option
							v-for="(item,index) in muzhupinzhongOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item v-else class="input" label="母猪品种" prop="muzhupinzhong" >
					<el-input v-model="ruleForm.muzhupinzhong"
						placeholder="母猪品种" readonly></el-input>
				</el-form-item>
				<el-form-item class="select" v-if="type!='info'"  label="猪仔来源" prop="zhuzilaiyuan" >
					<el-select :disabled="ro.zhuzilaiyuan" v-model="ruleForm.zhuzilaiyuan" placeholder="请选择猪仔来源" >
						<el-option
							v-for="(item,index) in zhuzilaiyuanOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item v-else class="input" label="猪仔来源" prop="zhuzilaiyuan" >
					<el-input v-model="ruleForm.zhuzilaiyuan"
						placeholder="猪仔来源" readonly></el-input>
				</el-form-item>
			</template>
			<el-form-item class="btn">
				<el-button class="btn3"  v-if="type!='info'" type="success" @click="onSubmit">
					<span class="icon iconfont icon-xihuan"></span>
					提交
				</el-button>
				<el-button class="btn4" v-if="type!='info'" type="success" @click="back()">
					<span class="icon iconfont icon-xihuan"></span>
					取消
				</el-button>
				<el-button class="btn5" v-if="type=='info'" type="success" @click="back()">
					<span class="icon iconfont icon-xihuan"></span>
					返回
				</el-button>
			</el-form-item>
		</el-form>
    

	</div>
</template>
<script>
	export default {
		data() {
			return {
				id: '',
				type: '',
			
			
				ro:{
					shengzhubianhao : false,
					zhudepinzhong : false,
					chushengriqi : false,
					xingbie : false,
					tizhong : false,
					chanziqingkuang : false,
					jianyizhengming : false,
					muzhupinzhong : false,
					zhuzilaiyuan : false,
				},
			
				ruleForm: {
					shengzhubianhao: '',
					zhudepinzhong: '',
					chushengriqi: '',
					xingbie: '',
					tizhong: '',
					chanziqingkuang: '',
					jianyizhengming: '',
					muzhupinzhong: '',
					zhuzilaiyuan: '',
				},
				zhudepinzhongOptions: [],
				xingbieOptions: [],
				muzhupinzhongOptions: [],
				zhuzilaiyuanOptions: [],

				rules: {
					shengzhubianhao: [
					],
					zhudepinzhong: [
					],
					chushengriqi: [
					],
					xingbie: [
					],
					tizhong: [
					],
					chanziqingkuang: [
					],
					jianyizhengming: [
					],
					muzhupinzhong: [
					],
					zhuzilaiyuan: [
					],
				},
			};
		},
		props: ["parent"],
		computed: {



		},
		components: {
		},
		created() {
		},
		methods: {
			// 下载
			download(file){
				window.open(`${file}`)
			},
			// 初始化
			init(id,type) {
				if (id) {
					this.id = id;
					this.type = type;
				}
				if(this.type=='info'||this.type=='else'||this.type=='msg'){
					this.info(id);
				}else if(this.type=='logistics'){
					for(let x in this.ro) {
						this.ro[x] = true
					}
					this.logistics=false;
					this.info(id);
				}else if(this.type=='cross'){
					var obj = this.$storage.getObj('crossObj');
					for (var o in obj){
						if(o=='shengzhubianhao'){
							this.ruleForm.shengzhubianhao = obj[o];
							this.ro.shengzhubianhao = true;
							continue;
						}
						if(o=='zhudepinzhong'){
							this.ruleForm.zhudepinzhong = obj[o];
							this.ro.zhudepinzhong = true;
							continue;
						}
						if(o=='chushengriqi'){
							this.ruleForm.chushengriqi = obj[o];
							this.ro.chushengriqi = true;
							continue;
						}
						if(o=='xingbie'){
							this.ruleForm.xingbie = obj[o];
							this.ro.xingbie = true;
							continue;
						}
						if(o=='tizhong'){
							this.ruleForm.tizhong = obj[o];
							this.ro.tizhong = true;
							continue;
						}
						if(o=='chanziqingkuang'){
							this.ruleForm.chanziqingkuang = obj[o];
							this.ro.chanziqingkuang = true;
							continue;
						}
						if(o=='jianyizhengming'){
							this.ruleForm.jianyizhengming = obj[o];
							this.ro.jianyizhengming = true;
							continue;
						}
						if(o=='muzhupinzhong'){
							this.ruleForm.muzhupinzhong = obj[o];
							this.ro.muzhupinzhong = true;
							continue;
						}
						if(o=='zhuzilaiyuan'){
							this.ruleForm.zhuzilaiyuan = obj[o];
							this.ro.zhuzilaiyuan = true;
							continue;
						}
					}
				}
				// 获取用户信息
				this.$http({
					url: `${this.$storage.get('sessionTable')}/session`,
					method: "get"
				}).then(({ data }) => {
					if (data && data.code === 0) {
						var json = data.data;
					} else {
						this.$message.error(data.msg);
					}
				});
				this.$http({
					url: `option/zhudepinzhong/zhudepinzhong`,
					method: "get"
				}).then(({ data }) => {
					if (data && data.code === 0) {
						this.zhudepinzhongOptions = data.data;
					} else {
						this.$message.error(data.msg);
					}
				});
				this.xingbieOptions = "公,母".split(',')
				this.$http({
					url: `option/zhudepinzhong/zhudepinzhong`,
					method: "get"
				}).then(({ data }) => {
					if (data && data.code === 0) {
						this.muzhupinzhongOptions = data.data;
					} else {
						this.$message.error(data.msg);
					}
				});
				this.zhuzilaiyuanOptions = "自繁自育,外部引进".split(',')
			
			},
			// 多级联动参数

			info(id) {
				this.$http({
					url: `shengzhuxinxi/info/${id}`,
					method: "get"
				}).then(({ data }) => {
					if (data && data.code === 0) {
						this.ruleForm = data.data;
						//解决前台上传图片后台不显示的问题
						let reg=new RegExp('../../../upload','g')//g代表全部
					} else {
						this.$message.error(data.msg);
					}
				});
			},

			// 提交
			async onSubmit() {
					if(this.ruleForm.jianyizhengming!=null) {
						this.ruleForm.jianyizhengming = this.ruleForm.jianyizhengming.replace(new RegExp(this.$base.url,"g"),"");
					}
					var objcross = this.$storage.getObj('crossObj');
					await this.$refs["ruleForm"].validate(async valid => {
						if (valid) {
							if(this.type=='cross'){
								var statusColumnName = this.$storage.get('statusColumnName');
								var statusColumnValue = this.$storage.get('statusColumnValue');
								if(statusColumnName!='') {
									var obj = this.$storage.getObj('crossObj');
									if(statusColumnName && !statusColumnName.startsWith("[")) {
										for (var o in obj){
											if(o==statusColumnName){
												obj[o] = statusColumnValue;
											}
										}
										var table = this.$storage.get('crossTable');
										await this.$http({
											url: `${table}/update`,
											method: "post",
											data: obj
										}).then(({ data }) => {});
									}
								}
							}
							
							await this.$http({
								url: `shengzhuxinxi/${!this.ruleForm.id ? "save" : "update"}`,
								method: "post",
								data: this.ruleForm
							}).then(async ({ data }) => {
								if (data && data.code === 0) {
									this.$message({
										message: "操作成功",
										type: "success",
										duration: 1500,
										onClose: () => {
											this.parent.showFlag = true;
											this.parent.addOrUpdateFlag = false;
											this.parent.shengzhuxinxiCrossAddOrUpdateFlag = false;
											this.parent.search();
											this.parent.contentStyleChange();
										}
									});
								} else {
									this.$message.error(data.msg);
								}
							});
						}
					});
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 返回
			back() {
				this.parent.showFlag = true;
				this.parent.addOrUpdateFlag = false;
				this.parent.shengzhuxinxiCrossAddOrUpdateFlag = false;
				this.parent.contentStyleChange();
			},
			jianyizhengmingUploadChange(fileUrls) {
				this.ruleForm.jianyizhengming = fileUrls;
			},
		}
	};
</script>
<style lang="scss" scoped>
	.addEdit-block {
		padding: 30px;
	}
	.add-update-preview {
		padding: 40px 80px 80px 0;
		margin: 0 0 0 10px;
		background: #FFFFFF;
		display: flex;
		border-color: #eee;
		border-width: 0px 0 0;
		border-style: solid;
		flex-wrap: wrap;
	}
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	.add-update-preview /deep/ .el-form-item {
		border: 0px solid #eee;
		padding: 0;
		margin: 0 0 26px 0;
		display: inline-block;
		width: 100%;
	}
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
		padding: 0 10px 0 0;
		color: #9E9E9E;
		font-weight: 400;
		width: 180px;
		font-size: 14px;
		line-height: 40px;
		text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
		margin-left: 180px;
	}
	.add-update-preview .el-form-item span.text {
		border: 1px solid #E8E8E8;
		padding: 0 10px;
		color: #333;
		background: none;
		font-weight: 500;
		display: inline-block;
		font-size: 16px;
		min-height: 200px;
		line-height: 40px;
		min-width: 100%;
	}
	
	.add-update-preview .el-input {
		width: 100%;
	}
	.add-update-preview .el-input /deep/ .el-input__inner {
		border: 1px solid #ccc;
		border-radius: 0px;
		padding: 0 12px;
		color: #666;
		width: 100%;
		font-size: 16px;
		min-width: 50%;
		height: 40px;
	}
	.add-update-preview .el-input /deep/ .el-input__inner[readonly="readonly"] {
		border: 1px solid #ccc;
		border-radius: 0px;
		padding: 0 12px;
		color: #666;
		width: 100%;
		font-size: 16px;
		min-width: 50%;
		height: 40px;
	}
	.add-update-preview .el-input-number {
		text-align: left;
		width: 100%;
	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
		border: 1px solid #ccc;
		border-radius: 0px;
		padding: 0 12px;
		color: #666;
		width: 100%;
		font-size: 16px;
		min-width: 50%;
		height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .is-disabled .el-input__inner {
		text-align: left;
		border: 1px solid #ccc;
		border-radius: 0px;
		padding: 0 12px;
		color: #666;
		width: 100%;
		font-size: 16px;
		min-width: 50%;
		height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	.add-update-preview .el-select {
		width: 100%;
	}
	.add-update-preview .el-select /deep/ .el-input__inner {
		border: 1px solid #ccc;
		border-radius: 0px;
		padding: 0 12px;
		color: #666;
		width: 100%;
		font-size: 16px;
		min-width: 50%;
		height: 40px;
	}
	.add-update-preview .el-select /deep/ .is-disabled .el-input__inner {
		border: 1px solid #ccc;
		border-radius: 0px;
		padding: 0 12px;
		color: #666;
		width: 100%;
		font-size: 16px;
		min-width: 50%;
		height: 40px;
	}
	.add-update-preview .el-date-editor {
		width: 100%;
	}
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
		border: 1px solid #ccc;
		border-radius: 0px;
		padding: 0 30px;
		color: #666;
		width: 100%;
		font-size: 16px;
		min-width: 50%;
		height: 40px;
	}
	.add-update-preview .el-date-editor /deep/ .el-input__inner[readonly="readonly"] {
		border: 1px solid #ccc;
		border-radius: 0px;
		padding: 0 30px;
		color: #666;
		width: 100%;
		font-size: 16px;
		min-width: 50%;
		height: 40px;
	}
	.add-update-preview .viewBtn {
		border: 0px solid #ccc;
		cursor: pointer;
		border-radius: 0px;
		padding: 0 15px;
		margin: 0 20px 0 0;
		color: #666;
		background: #fff;
		width: auto;
		font-size: 15px;
		line-height: 34px;
		height: 34px;
		.iconfont {
			margin: 0 2px;
			color: #666;
			font-size: 16px;
			height: 34px;
		}
	}
	.add-update-preview .viewBtn:hover {
		opacity: 0.8;
	}
	.add-update-preview .downBtn {
		border: 0px solid #ccc;
		cursor: pointer;
		border-radius: 0px;
		padding: 0 15px;
		margin: 0 20px 0 0;
		color: #666;
		background: #fff;
		width: auto;
		font-size: 15px;
		line-height: 34px;
		height: 34px;
		.iconfont {
			margin: 0 2px;
			color: #666;
			font-size: 16px;
			height: 34px;
		}
	}
	.add-update-preview .downBtn:hover {
		opacity: 0.8;
	}
	.add-update-preview .unBtn {
		border: 0;
		cursor: not-allowed;
		border-radius: 4px;
		padding: 0 0px;
		margin: 0 20px 0 0;
		outline: none;
		color: #999;
		background: none;
		width: auto;
		font-size: 16px;
		line-height: 40px;
		height: 40px;
		.iconfont {
			margin: 0 2px;
			color: #fff;
			display: none;
			font-size: 14px;
			height: 34px;
		}
	}
	.add-update-preview .unBtn:hover {
		opacity: 0.8;
	}
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
		border: 1px solid #ccc;
		cursor: pointer;
		border-radius: 0px;
		color: #666;
		background: #fff;
		width: 90px;
		font-size: 24px;
		line-height: 60px;
		text-align: center;
		height: 60px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
		border: 1px solid #ccc;
		cursor: pointer;
		border-radius: 0px;
		color: #666;
		background: #fff;
		width: 90px;
		font-size: 24px;
		line-height: 60px;
		text-align: center;
		height: 60px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
		border: 1px solid #ccc;
		cursor: pointer;
		border-radius: 0px;
		color: #666;
		background: #fff;
		width: 90px;
		font-size: 24px;
		line-height: 60px;
		text-align: center;
		height: 60px;
	}
	.add-update-preview /deep/ .el-upload__tip {
		color: #666;
		font-size: 15px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
		border: 1px solid #ccc;
		border-radius: 0px;
		padding: 0 12px;
		color: #666;
		width: 100%;
		font-size: 16px;
		min-height: 200px;
		line-height: 24px;
		min-width: 100%;
		height: auto;
	}
	.add-update-preview .el-textarea /deep/ .el-textarea__inner[readonly="readonly"] {
				border: 1px solid #ccc;
				border-radius: 0px;
				padding: 0 12px;
				color: #666;
				width: 100%;
				font-size: 16px;
				min-height: 200px;
				line-height: 24px;
				min-width: 100%;
				height: auto;
			}
	.add-update-preview .el-form-item.btn {
		padding: 0;
		margin: 20px 0 0;
		.btn1 {
			border: 0px solid #ccc;
			cursor: pointer;
			border-radius: 4px;
			padding: 0 10px;
			margin: 0 10px 0 0;
			color: #fff;
			background: #5BAAFF;
			width: auto;
			font-size: 16px;
			min-width: 110px;
			height: 40px;
			.iconfont {
				margin: 0 2px;
				color: #fff;
				display: none;
				font-size: 14px;
				height: 40px;
			}
		}
		.btn1:hover {
			opacity: 0.8;
		}
		.btn2 {
			border: 0px solid #ccc;
			cursor: pointer;
			border-radius: 4px;
			padding: 0 10px;
			margin: 0 10px 0 0;
			color: #fff;
			background: #60DFE4;
			width: auto;
			font-size: 16px;
			min-width: 110px;
			height: 40px;
			.iconfont {
				margin: 0 2px;
				color: #fff;
				display: none;
				font-size: 14px;
				height: 34px;
			}
		}
		.btn2:hover {
			opacity: 0.8;
		}
		.btn3 {
			border: 0px solid #ccc;
			cursor: pointer;
			border-radius: 4px;
			padding: 0 10px;
			margin: 0 10px 0 0;
			color: #fff;
			background: #60E495;
			width: auto;
			font-size: 16px;
			min-width: 110px;
			height: 40px;
			.iconfont {
				margin: 0 2px;
				color: #fff;
				display: none;
				font-size: 14px;
				height: 40px;
			}
		}
		.btn3:hover {
			opacity: 0.8;
		}
		.btn4 {
			border: 0px solid #ccc;
			cursor: pointer;
			border-radius: 4px;
			padding: 0 10px;
			margin: 0 10px 0 0;
			color: #fff;
			background: #C3E460;
			width: auto;
			font-size: 16px;
			min-width: 110px;
			height: 40px;
			.iconfont {
				margin: 0 2px;
				color: #fff;
				display: none;
				font-size: 14px;
				height: 40px;
			}
		}
		.btn4:hover {
			opacity: 0.8;
		}
		.btn5 {
			border: 0px solid #ccc;
			cursor: pointer;
			border-radius: 4px;
			padding: 0 10px;
			margin: 0 10px 0 0;
			color: #fff;
			background: #E4B860;
			width: auto;
			font-size: 16px;
			min-width: 110px;
			height: 40px;
			.iconfont {
				margin: 0 2px;
				color: #fff;
				display: none;
				font-size: 14px;
				height: 40px;
			}
		}
		.btn5:hover {
			opacity: 0.8;
		}
	}
</style>
