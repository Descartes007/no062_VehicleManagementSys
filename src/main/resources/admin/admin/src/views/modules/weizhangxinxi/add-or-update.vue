<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="名称" prop="mingcheng">
          <el-input v-model="ruleForm.mingcheng" 
              placeholder="名称" clearable  :readonly="ro.mingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="名称" prop="mingcheng">
              <el-input v-model="ruleForm.mingcheng" 
                placeholder="名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'" label="车辆名称" prop="cheliangmingcheng">
          <el-select  @change="cheliangmingchengChange" v-model="ruleForm.cheliangmingcheng" placeholder="请选择车辆名称">
            <el-option
                v-for="(item,index) in cheliangmingchengOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input"v-if="ruleForm.cheliangmingcheng" label="车辆名称" prop="cheliangmingcheng">
              <el-input v-model="ruleForm.cheliangmingcheng" 
                placeholder="车辆名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="车辆类型" prop="cheliangleixing">
          <el-input v-model="ruleForm.cheliangleixing" 
              placeholder="车辆类型" clearable  :readonly="ro.cheliangleixing"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="车辆类型" prop="cheliangleixing">
              <el-input v-model="ruleForm.cheliangleixing" 
                placeholder="车辆类型" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="品牌" prop="pinpai">
          <el-input v-model="ruleForm.pinpai" 
              placeholder="品牌" clearable  :readonly="ro.pinpai"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="品牌" prop="pinpai">
              <el-input v-model="ruleForm.pinpai" 
                placeholder="品牌" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="车牌号" prop="chepaihao">
          <el-input v-model="ruleForm.chepaihao" 
              placeholder="车牌号" clearable  :readonly="ro.chepaihao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="车牌号" prop="chepaihao">
              <el-input v-model="ruleForm.chepaihao" 
                placeholder="车牌号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="违章名称" prop="weizhangmingcheng">
          <el-input v-model="ruleForm.weizhangmingcheng" 
              placeholder="违章名称" clearable  :readonly="ro.weizhangmingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="违章名称" prop="weizhangmingcheng">
              <el-input v-model="ruleForm.weizhangmingcheng" 
                placeholder="违章名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="违章人" prop="weizhangren">
          <el-input v-model="ruleForm.weizhangren" 
              placeholder="违章人" clearable  :readonly="ro.weizhangren"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="违章人" prop="weizhangren">
              <el-input v-model="ruleForm.weizhangren" 
                placeholder="违章人" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="是否处理" prop="shifouchuli">
          <el-select v-model="ruleForm.shifouchuli" placeholder="请选择是否处理">
            <el-option
                v-for="(item,index) in shifouchuliOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="是否处理" prop="shifouchuli">
	      <el-input v-model="ruleForm.shifouchuli"
                placeholder="是否处理" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="处理时间" prop="chulishijian">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.chulishijian" 
                type="date"
                placeholder="处理时间">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.chulishijian" label="处理时间" prop="chulishijian">
              <el-input v-model="ruleForm.chulishijian" 
                placeholder="处理时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="工号" prop="gonghao">
          <el-input v-model="ruleForm.gonghao" 
              placeholder="工号" clearable  :readonly="ro.gonghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="工号" prop="gonghao">
              <el-input v-model="ruleForm.gonghao" 
                placeholder="工号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming" 
              placeholder="姓名" clearable  :readonly="ro.xingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="姓名" prop="xingming">
              <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item v-if="type!='info'"  label="处理结果" prop="chulijieguo">
                <editor 
                    style="min-width: 200px; max-width: 600px;"
                    v-model="ruleForm.chulijieguo" 
                    class="editor" 
                    action="file/upload">
                </editor>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.chulijieguo" label="处理结果" prop="chulijieguo">
                    <span v-html="ruleForm.chulijieguo"></span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
      <el-form-item class="btn">
        <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"rgba(255, 255, 102, 1)","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"rgba(255, 255, 255, 0.25)","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"4px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"rgba(25, 169, 123, 1)","addEditBoxColor":"rgba(25, 169, 123, 0.11)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(25, 169, 123, 1)","uploadIconFontColor":"rgba(25, 169, 123, 1)","textareaBorderColor":"rgba(25, 169, 123, 1)","btnCancelBgColor":"rgba(255, 255, 102, 1)","selectLableColor":"rgba(25, 169, 123, 1)","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"rgba(0, 0, 0, 1)","dateBorderColor":"rgba(25, 169, 123, 1)","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"rgba(25, 169, 123, 1)","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"rgba(25, 169, 123, 1)","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"4px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"rgba(25, 169, 123, 1)","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"rgba(25, 169, 123, 1)","inputBorderColor":"rgba(25, 169, 123, 1)","uploadBorderColor":"rgba(25, 169, 123, 1)","textareaFontColor":"rgba(0, 0, 0, 1)","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"rgba(25, 169, 123, 1)","btnSaveBorderColor":"rgba(25, 169, 123, 1)","btnSaveBorderWidth":"1px"},
      id: '',
      type: '',
      ro:{
	mingcheng : false,
	cheliangmingcheng : false,
	cheliangleixing : false,
	pinpai : false,
	chepaihao : false,
	weizhangmingcheng : false,
	weizhangren : false,
	shifouchuli : false,
	chulijieguo : false,
	chulishijian : false,
	gonghao : false,
	xingming : false,
      },
      ruleForm: {
        mingcheng: '',
        cheliangmingcheng: '',
        cheliangleixing: '',
        pinpai: '',
        chepaihao: '',
        weizhangmingcheng: '',
        weizhangren: '',
        shifouchuli: '',
        chulijieguo: '',
        chulishijian: '',
        gonghao: '',
        xingming: '',
      },
          cheliangmingchengOptions: [],
          shifouchuliOptions: [],
      rules: {
          mingcheng: [
                { required: true, message: '名称不能为空', trigger: 'blur' },
          ],
          cheliangmingcheng: [
          ],
          cheliangleixing: [
          ],
          pinpai: [
          ],
          chepaihao: [
          ],
          weizhangmingcheng: [
          ],
          weizhangren: [
          ],
          shifouchuli: [
          ],
          chulijieguo: [
          ],
          chulishijian: [
          ],
          gonghao: [
          ],
          xingming: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {
  },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
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
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='mingcheng'){
            this.ruleForm.mingcheng = obj[o];
	    this.ro.mingcheng = true;
            continue;
          }
          if(o=='cheliangmingcheng'){
            this.ruleForm.cheliangmingcheng = obj[o];
	    this.ro.cheliangmingcheng = true;
            continue;
          }
          if(o=='cheliangleixing'){
            this.ruleForm.cheliangleixing = obj[o];
	    this.ro.cheliangleixing = true;
            continue;
          }
          if(o=='pinpai'){
            this.ruleForm.pinpai = obj[o];
	    this.ro.pinpai = true;
            continue;
          }
          if(o=='chepaihao'){
            this.ruleForm.chepaihao = obj[o];
	    this.ro.chepaihao = true;
            continue;
          }
          if(o=='weizhangmingcheng'){
            this.ruleForm.weizhangmingcheng = obj[o];
	    this.ro.weizhangmingcheng = true;
            continue;
          }
          if(o=='weizhangren'){
            this.ruleForm.weizhangren = obj[o];
	    this.ro.weizhangren = true;
            continue;
          }
          if(o=='shifouchuli'){
            this.ruleForm.shifouchuli = obj[o];
	    this.ro.shifouchuli = true;
            continue;
          }
          if(o=='chulijieguo'){
            this.ruleForm.chulijieguo = obj[o];
	    this.ro.chulijieguo = true;
            continue;
          }
          if(o=='chulishijian'){
            this.ruleForm.chulishijian = obj[o];
	    this.ro.chulishijian = true;
            continue;
          }
          if(o=='gonghao'){
            this.ruleForm.gonghao = obj[o];
	    this.ro.gonghao = true;
            continue;
          }
          if(o=='xingming'){
            this.ruleForm.xingming = obj[o];
	    this.ro.xingming = true;
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
		if(json.gonghao!=''&&json.gonghao){
              		this.ruleForm.gonghao = json.gonghao
		}
		if(json.xingming!=''&&json.xingming){
              		this.ruleForm.xingming = json.xingming
		}
        } else {
          this.$message.error(data.msg);
        }
      });
            this.$http({
              url: `option/cheliangxinxi/cheliangmingcheng`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.cheliangmingchengOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
            this.shifouchuliOptions = "是,否".split(',')
    },
    // 下二随
    cheliangmingchengChange () {
      this.$http({
        url: `follow/cheliangxinxi/cheliangmingcheng?columnValue=`+ this.ruleForm.cheliangmingcheng,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
              if(data.data.cheliangleixing){
                this.ruleForm.cheliangleixing = data.data.cheliangleixing
              }
              if(data.data.pinpai){
                this.ruleForm.pinpai = data.data.pinpai
              }
              if(data.data.chepaihao){
                this.ruleForm.chepaihao = data.data.chepaihao
              }
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `weizhangxinxi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
	this.ruleForm.chulijieguo = this.ruleForm.chulijieguo.replace(reg,'../../../springbootg2g8t/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 提交
    onSubmit() {
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}












      this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `weizhangxinxi/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.weizhangxinxiCrossAddOrUpdateFlag = false;
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
      this.parent.weizhangxinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>
