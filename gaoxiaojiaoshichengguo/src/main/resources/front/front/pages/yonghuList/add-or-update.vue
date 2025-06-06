<template>
	<view class="content">
		<form class="app-update-pv">
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#47EDB5","textAlign":"left"}' class="title">
					标题</view>
				<input readonly="readonly"
					:style='{"boxShadow":"0 0 16rpx #07A771 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#47EDB5","borderRadius":"20rpx","color":"#47EDB5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
					:disabled="ro.chengguoName" type="text" v-model="ruleForm.chengguoName" placeholder="标题"></input>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#47EDB5","textAlign":"left"}' class="title">
					学生姓名</view>
				<input readonly="readonly"
					:style='{"boxShadow":"0 0 16rpx #07A771 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#47EDB5","borderRadius":"20rpx","color":"#47EDB5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
					:disabled="ro.yonghuName" type="text" v-model="ruleForm.yonghuName" placeholder="学生姓名"></input>
			</view>
			<view
				:style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
				class="cu-form-group" @tap="yonghuPhotoTap">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#47EDB5","textAlign":"left"}' class="title">
					成果图片</view>
				<view class="right-input" style="padding:0;textAlign:left">
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-if="ruleForm.yonghuPhoto" :src="ruleForm.yonghuPhoto" mode="aspectFill">
					</image>
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#47EDB5","textAlign":"left"}' class="title">
					手机号</view>
				<input readonly="readonly"
					:style='{"boxShadow":"0 0 16rpx #07A771 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#47EDB5","borderRadius":"20rpx","color":"#47EDB5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
					:disabled="ro.yonghuPhone" type="text" v-model="ruleForm.yonghuPhone" placeholder="手机号"></input>
			</view>
			<!-- text后缀 -->
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#47EDB5","textAlign":"left"}' class="title">
					详情</view>
				<textarea
					:style='{"boxShadow":"0 0 16rpx #07A771 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#47EDB5","borderRadius":"20rpx","color":"#47EDB5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","height":"200rpx"}'
					:disabled="ro.yonghuContent" v-model="ruleForm.yonghuContent" placeholder="详情" />
			</view>

			<view class="btn">
				<button
					:style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#47EDB5","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
					@tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
			ref="createTime" themeColor="#333333"></w-picker>


	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross: '',
				ro: {
					chengguoName: false,
					rongyuTypes: false,
					yonghuName: false,
					yonghuPhoto: false,
					yonghuYesnoTypes: false,
					yonghuPhone: false,
					jiaoshiId: false,
					yonghuContent: false,
					yonghuDelete: false,
					createTime: false,
				},
				ruleForm: {
					chengguoName: '',
					rongyuTypes: '', //数字
					rongyuValue: '', //数字对应的值
					yonghuName: '',
					yonghuPhoto: '',
					yonghuYesnoTypes: '', //数字
					yonghuYesnoValue: '', //数字对应的值
					yonghuPhone: '',
					jiaoshiId: '',
					yonghuContent: '',
					yonghuDelete: '',
					createTime: '',
				},
				// 登陆用户信息
				user: {},
				rongyuTypesOptions: [],
				rongyuTypesIndex: 0,
				yonghuYesnoTypesOptions: [],
				yonghuYesnoTypesIndex: 0,

			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {

			/*下拉框*/
			let yonghuYesnoTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'yonghu_yesno_types',
			}
			let yonghuYesnoTypes = await this.$api.page(`dictionary`, yonghuYesnoTypesParams);
			this.yonghuYesnoTypesOptions = yonghuYesnoTypes.data.list


			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				let res = await this.$api.info(`yonghu`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			if (options.yonghuId) {
				this.ruleForm.yonghuId = options.yonghuId;
			}
			// 跨表
			// this.styleChange()
		},
		methods: {
			// 下拉变化
			rongyuTypesChange(e) {
				this.rongyuTypesIndex = e.target.value
				this.ruleForm.rongyuValue = this.rongyuTypesOptions[this.rongyuTypesIndex].indexName
				this.ruleForm.rongyuTypes = this.rongyuTypesOptions[this.rongyuTypesIndex].codeIndex
			},
			yonghuYesnoTypesChange(e) {
				this.yonghuYesnoTypesIndex = e.target.value
				this.ruleForm.yonghuYesnoValue = this.yonghuYesnoTypesOptions[this.yonghuYesnoTypesIndex].indexName
				this.ruleForm.yonghuYesnoTypes = this.yonghuYesnoTypesOptions[this.yonghuYesnoTypesIndex].codeIndex
			},


			// styleChange() {
			// 	this.$nextTick(() => {
			// 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
			// 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
			// 		// })
			// 	})
			// },


			yonghuPhotoTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.yonghuPhoto = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(() => {
						// _this.styleChange()
					})
				});
			},
			// 日期控件
			createTimeConfirm(val) {
				console.log(val)
				this.ruleForm.createTime = val.result;
				this.$forceUpdate();
			},




			getUUID() {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if ((!this.ruleForm.chengguoName)) {
					this.$utils.msg(`标题不能为空`);
					return
				}
				if ((!this.ruleForm.yonghuName)) {
					this.$utils.msg(`学生姓名不能为空`);
					return
				}
				if ((!this.ruleForm.yonghuPhoto)) {
					this.$utils.msg(`成果图片不能为空`);
					return
				}
				if ((!this.ruleForm.yonghuPhone) && (!this.$validate.isMobile(this.ruleForm.yonghuPhone))) {
					this.$utils.msg(`手机号不能为空并且需要输入正确格式`);
					return
				}
				if (this.ruleForm.id) {
					await this.$api.update(`yonghu`, this.ruleForm);
				} else {
					await this.$api.save(`yonghu`, this.ruleForm);
				}
				uni.setStorageSync('pingluenStateState', true);
				this.$utils.msgBack('提交成功');
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}

	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}

	.cu-form-group.active {
		justify-content: space-between;
	}

	.btn {
		display: flex;
		align-items: center;
		justify-content: center;
		flex-wrap: wrap;
		padding: 20upx 0;
	}

	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}

	.cu-form-group+.cu-form-group {
		border: 0;
	}

	.cu-form-group uni-input {
		padding: 0 30upx;
	}

	.uni-input {
		padding: 0 30upx;
	}

	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}

	.cu-form-group uni-picker::after {
		line-height: 68rpx;
	}

	.select .uni-input {
		line-height: 68rpx;
	}

	.input .right-input {
		line-height: 68rpx;
	}
</style>
