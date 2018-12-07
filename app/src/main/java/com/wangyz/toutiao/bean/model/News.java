package com.wangyz.toutiao.bean.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangyz
 * News
 */
public class News implements Serializable {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"50db2b4dd091323ea5909dd475e79553","title":"乌克兰总统：一旦开战将从俄罗斯入侵之日起给军人涨工资","date":"2018-11-30 12:39","category":"头条","author_name":"新华视频","url":"http://mini.eastday.com/mobile/181130123956757.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181130/20181130123956_de90e397c5adac3d09174806edbf9668_1_mwpm_03200403.jpg"},{"uniquekey":"5a6e71618ba42cffb05b8aaf049ea35f","title":"深圳南山半马258人违规，外媒报道称\u201c极度羞耻\u201d","date":"2018-11-30 12:37","category":"头条","author_name":"新京报","url":"http://mini.eastday.com/mobile/181130123720612.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181130/20181130123720_71b3a21d5f3f7fe76913d53750ed80c8_1_mwpm_03200403.jpg"},{"uniquekey":"785d4569da2d9afc0a6018ed2ba8b0ec","title":"【从新的历史方位出发】这首有故事的老厂歌，你可有听过吗？","date":"2018-11-30 12:34","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/181130123457408.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181130/20181130123457_4f4f3252aeab1677f89d279716afeab6_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20181130/20181130123457_4f4f3252aeab1677f89d279716afeab6_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20181130/20181130123457_4f4f3252aeab1677f89d279716afeab6_2_mwpm_03200403.jpg"},{"uniquekey":"a44a90fc2893d1bfd4bc4ae75b4bfd23","title":"体育总局人力中心羽毛球社会体育指导员国家职业资格考评员培训班在合肥举办","date":"2018-11-30 12:30","category":"头条","author_name":"国家体育总局","url":"http://mini.eastday.com/mobile/181130123034161.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181130/20181130123034_0d5f037be84d5ec76ab3e447aaec12ab_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181130/20181130123034_0d5f037be84d5ec76ab3e447aaec12ab_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181130/20181130123034_0d5f037be84d5ec76ab3e447aaec12ab_5_mwpm_03200403.jpg"},{"uniquekey":"066fdfcd2fe22c5c08ff957070394e85","title":"如果人类发现一个文明程度低于地球的文明，会怎么对待？","date":"2018-11-30 12:29","category":"头条","author_name":"科幻Monsters","url":"http://mini.eastday.com/mobile/181130122948503.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181130/20181130122948_218d394c9fce0deef3920c52f6139f97_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181130/20181130122948_218d394c9fce0deef3920c52f6139f97_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181130/20181130122948_218d394c9fce0deef3920c52f6139f97_4_mwpm_03200403.jpg"},{"uniquekey":"4191d3feb2273b20ec000d6cf6cc7f6e","title":"震惊！你的门禁、车钥匙、银行卡都会被黑客轻松攻破","date":"2018-11-30 12:24","category":"头条","author_name":"中国信息产业网　","url":"http://mini.eastday.com/mobile/181130122421197.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181130/20181130122421_bd54ad72e8ddf2fca5a5e5fa2129f218_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181130/20181130122421_bd54ad72e8ddf2fca5a5e5fa2129f218_1_mwpm_03200403.jpg"},{"uniquekey":"b8464cbd9e9275fda9754441c6f51b5f","title":"11.30强势美元难持续，黄金多头势将大放异彩","date":"2018-11-30 12:22","category":"头条","author_name":"金都财神A","url":"http://mini.eastday.com/mobile/181130122253337.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181130/20181130_8cf6ac4dc5bdec519a3bf39bf2cf2fa1_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181130/20181130_76417f08032947cfc7296975bd02c4ec_cover_mwpm_03200403.jpg"},{"uniquekey":"3d9cd76dff41bd1e26479db76c244893","title":"剑桥分析黑料：将Facebook用户时尚偏好数据用于定向广告","date":"2018-11-30 12:22","category":"头条","author_name":"36氪","url":"http://mini.eastday.com/mobile/181130122251628.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181130/20181130122251_6e26e49c972e68a4dbffa30ec6e678a3_1_mwpm_03200403.jpg"},{"uniquekey":"daceb5a21187d39546389ca7224d8856","title":"冬天就养这3种\u201c植物\u201d，味道清新还好养，活着的\u201c空气清新剂\u201d","date":"2018-11-30 12:20","category":"头条","author_name":"养花大全","url":"http://mini.eastday.com/mobile/181130122021795.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181130/20181130_7d26e8e0c8c22ffdb5e9f0eda0430e78_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181130/20181130_d7227e6bb4cf8742a9c06e8b0c089132_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181130/20181130_9e148436c24f2056132654879a6a6c1e_cover_mwpm_03200403.jpg"},{"uniquekey":"76d954a7b4acafaebe61fb1b287f8006","title":"塞尔比英锦赛首轮出局要丢世界第一：我整场比赛都打得很烂","date":"2018-11-30 12:20","category":"头条","author_name":"大猫体育","url":"http://mini.eastday.com/mobile/181130122016119.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181130/20181130122016_a5bdec95075e258156d881babb568733_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181130/20181130122016_a5bdec95075e258156d881babb568733_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181130/20181130122016_a5bdec95075e258156d881babb568733_1_mwpm_03200403.jpg"},{"uniquekey":"2382c0c867f6013c4e750dfee6c702e8","title":"盘点影视剧中尴尬穿帮镜头，一个比一个搞笑，吃饭勿入避免喷饭！","date":"2018-11-30 12:19","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/181130121934698.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181130/20181130121934_79022c7d5d48b964b6f2781332e84e46_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181130/20181130121934_79022c7d5d48b964b6f2781332e84e46_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181130/20181130121934_79022c7d5d48b964b6f2781332e84e46_6_mwpm_03200403.jpg"},{"uniquekey":"4009d88dc45b8f908c4341f61b667ceb","title":"英国王室的蜜月被诅咒，所有的婚姻都以离婚告终","date":"2018-11-30 12:19","category":"头条","author_name":"松柏威课","url":"http://mini.eastday.com/mobile/181130121927935.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181130/20181130_fdbe8c637b0a2bd8c1fae9d677e6b27a_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181130/20181130_21eeee569c9f950fcff240e776a0772a_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181130/20181130_77e939574e763fd7e769bbf80c1862eb_cover_mwpm_03200403.jpg"},{"uniquekey":"711ab33b5c153479b4101e049539ae1a","title":"王者荣耀：排位快速上分技巧，掌握这些段位提升犹如坐火箭","date":"2018-11-30 12:19","category":"头条","author_name":"游拼拼","url":"http://mini.eastday.com/mobile/181130121911700.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181130/20181130121911_cfec18406331ca546dc419782761b7a7_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181130/20181130121911_cfec18406331ca546dc419782761b7a7_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181130/20181130121911_cfec18406331ca546dc419782761b7a7_1_mwpm_03200403.jpg"},{"uniquekey":"696bbe91c17d6e03b78e9e43f77414e4","title":"阿根廷首都迎接G20将放假1天 政府鼓励民众出城度假","date":"2018-11-30 12:12","category":"头条","author_name":"多彩贵州网","url":"http://mini.eastday.com/mobile/181130121247941.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181130/20181130121247_89a0504331939a31b525000ab90dba71_1_mwpm_03200403.jpg"},{"uniquekey":"300da527a16580261c2cfa2104019b0a","title":"4岁上小学，16岁上大学，19岁西大本科女生直博复旦","date":"2018-11-30 12:12","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/181130121213799.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181130/20181130121213_052e0a096abe92afd72a4f6457ea7cc1_1_mwpm_03200403.jpg"},{"uniquekey":"91746ca1599aeed4f769b47940e4f016","title":"中国男篮世预赛轻松取胜, 但本场比赛最累的人, 却是场边看","date":"2018-11-30 12:09","category":"头条","author_name":"让足球飞","url":"http://mini.eastday.com/mobile/181130120919400.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181130/20181130_dd88b72d9c3aaffd744c44a53d5df0f9_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181130/20181130_2ae5f90cbc0d039b4db4e3235c7dc879_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20181130/20181130_8613a83f8b800feef8207453c9dbf048_cover_mwpm_03200403.jpg"},{"uniquekey":"6a1583ceded518ecf6f8bd46bf595526","title":"希丁克国奥新名单曝光，两留洋新星落选，此队连续2期无球员入选","date":"2018-11-30 12:08","category":"头条","author_name":"体育报道员","url":"http://mini.eastday.com/mobile/181130120855395.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181130/20181130_fde4f1db5513bea55251975b4b8faa8c_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181130/20181130_ab82bd6eae329f3a2ccdbcc140562fd6_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181130/20181130_a86851c588ecda8977b4cb4a05117678_cover_mwpm_03200403.jpg"},{"uniquekey":"1dade66a87b27045d12fc4d77fa5edb5","title":"创驰蓝天再次进化，全新马自达3亮相洛杉矶车展","date":"2018-11-30 12:07","category":"头条","author_name":"不如将久","url":"http://mini.eastday.com/mobile/181130120701916.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181130/20181130120701_750328f24325051f7cb92bc45de2c659_14_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181130/20181130120701_750328f24325051f7cb92bc45de2c659_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181130/20181130120701_750328f24325051f7cb92bc45de2c659_5_mwpm_03200403.jpg"},{"uniquekey":"ef24269a518ec42dc7cf466af7727195","title":"西安科技大市场提升科技成果转化效益 树立\u201c西安品牌\u201d","date":"2018-11-30 12:06","category":"头条","author_name":"36氪陕西","url":"http://mini.eastday.com/mobile/181130120603161.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181130/20181130120603_4ed8621f80f27d6035f9fc86b8741076_1_mwpm_03200403.jpg"},{"uniquekey":"d81b451b8f2e84a4e302e3ec99f09608","title":"东方观察：世界聚焦G20\u201c特普会\u201d为何突然取消？","date":"2018-11-30 12:05","category":"头条","author_name":"东方网","url":"http://mini.eastday.com/mobile/181130120541960.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181130/20181130120541_81aafc5dbfc7c8aa117aac4588bc8390_1_mwpm_03200403.jpg"},{"uniquekey":"2380b549c09414de6a12a83a8c591693","title":"山东民企的时代担当","date":"2018-11-30 12:05","category":"头条","author_name":"山东商报","url":"http://mini.eastday.com/mobile/181130120540185.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181130/20181130120540_4c712e1897fdd60309771a72a404faff_1_mwpm_03200403.jpg"},{"uniquekey":"004328e4afaa1f0acf87dfcc439c3748","title":"沪指早盘震荡涨0.23% 酿酒板块领涨两市","date":"2018-11-30 12:05","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/181130120505485.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181130/20181130120505_e70bfd731126e108da79c3f4245c17ee_1_mwpm_03200403.jpg"},{"uniquekey":"a702e5ed9eeee09b735af1c9e15465d8","title":"潜水员与3米长鳄鱼近距离接触 每一秒都是惊心动魄","date":"2018-11-30 12:04","category":"头条","author_name":"酒桶说三观","url":"http://mini.eastday.com/mobile/181130120408869.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181130/20181130_8900206678a5a4a069d1847e76195c74_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20181130/20181130_6ee23b93d7504bdda4d37a24bfbf695f_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20181130/20181130_6d331052d9ba790030168a47ba22c82e_cover_mwpm_03200403.jpg"},{"uniquekey":"a1600913b4ca622eebb84be856f328d0","title":"6脚传球天秀破门！纳尼1V4手起刀落 空翻庆祝廉颇未老","date":"2018-11-30 12:02","category":"头条","author_name":"代古龙","url":"http://mini.eastday.com/mobile/181130120241311.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181130/20181130_4bf2714f51d8a732289a230148af8b2e_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181130/20181130_68676f81a1590e9f180d0fa1365b97c4_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181130/20181130_ebebf6e3ee6f840fdf0253d8822fe71e_cover_mwpm_03200403.jpg"},{"uniquekey":"b0c1b8854da9dfca3f813c0546382e3a","title":"点外卖给差评后遭店员死亡威胁：知道你家地址，撞死你，我车全险","date":"2018-11-30 11:58","category":"头条","author_name":"东方头条","url":"http://mini.eastday.com/mobile/181130115859704.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181130/20181130_e3ebd520a54e274cdb0e4e7747710133_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181130/20181130_842d419c4563409066ba208a7f5a1ec3_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20181130/20181130_6a60f13fd0e6336dbdb8d29b2784c4ba_cover_mwpm_03200403.jpg"},{"uniquekey":"46d8762ce89f85fc6a00ba0170ccd4de","title":"大战一触即发！乌克兰孤注一掷，最新3个动作释放强烈冒险信号","date":"2018-11-30 11:57","category":"头条","author_name":"东方头条 大国军情","url":"http://mini.eastday.com/mobile/181130115738323.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181130/20181130_40023e9a82b44c7c7d53dab06c8cd9a9_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181130/20181130_f93ffed9ba03e161fab5df60152ce29a_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181130/20181130_0e4931a0073290054e8c697b1a14699f_mwpm_03200403.jpg"},{"uniquekey":"7aee8a17c6d8893e0d5e0b7414263363","title":"拨云见青天，3属相喜事登门，财运大好，从今日起能赚金银无数","date":"2018-11-30 11:57","category":"头条","author_name":"月亮弯之上","url":"http://mini.eastday.com/mobile/181130115723528.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181130/20181130_fce1aee01e658b66835e953aac4e83d6_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181130/20181130_2fdbf3cee6ffb8d12a89b6935649646b_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20181130/20181130_f20600c2e0d8ce720143454e85347aac_cover_mwpm_03200403.jpg"},{"uniquekey":"842d030bbde7e7ebee10b27fbb1840ea","title":"幽默笑话：妈妈说我还小不能早恋","date":"2018-11-30 11:56","category":"头条","author_name":"爱笑的傻猫","url":"http://mini.eastday.com/mobile/181130115650227.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181130/20181130_58436c8611ae7a5a81770099c1d6c9fc_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181130/20181130_b8494fd65e772bd3e650fd339ce0c3cc_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181130/20181130_e561abbfae80ea317110924e60a571d2_cover_mwpm_03200403.jpg"},{"uniquekey":"115519540509f82cb6b14245e46edf2f","title":"冬天健身，一定要管住自己的嘴，不然只会适得其反","date":"2018-11-30 11:56","category":"头条","author_name":"超燃健身派","url":"http://mini.eastday.com/mobile/181130115604517.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181130/20181130_bec936e9fe5c19e521940b9de79a2cac_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20181130/20181130_9054652af93d1e543459ec20d3939aa4_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20181130/20181130_c874b4d992d6e8e3a2e5e40e824d1d5e_cover_mwpm_03200403.jpg"},{"uniquekey":"6ac4d67494c49f4d111ebbfabec0c8e8","title":"横扫晋级，张择进澳网外卡赛四强！距离澳网正赛只差2场胜利！","date":"2018-11-30 11:55","category":"头条","author_name":"全景体育","url":"http://mini.eastday.com/mobile/181130115548275.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181130/20181130115548_a6fbcbe86a00fc74543f65cc0e858feb_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181130/20181130115548_a6fbcbe86a00fc74543f65cc0e858feb_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181130/20181130115548_a6fbcbe86a00fc74543f65cc0e858feb_1_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean implements Serializable {
        /**
         * stat : 1
         * data : [{"uniquekey":"50db2b4dd091323ea5909dd475e79553","title":"乌克兰总统：一旦开战将从俄罗斯入侵之日起给军人涨工资","date":"2018-11-30 12:39","category":"头条","author_name":"新华视频","url":"http://mini.eastday.com/mobile/181130123956757.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181130/20181130123956_de90e397c5adac3d09174806edbf9668_1_mwpm_03200403.jpg"},{"uniquekey":"5a6e71618ba42cffb05b8aaf049ea35f","title":"深圳南山半马258人违规，外媒报道称\u201c极度羞耻\u201d","date":"2018-11-30 12:37","category":"头条","author_name":"新京报","url":"http://mini.eastday.com/mobile/181130123720612.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181130/20181130123720_71b3a21d5f3f7fe76913d53750ed80c8_1_mwpm_03200403.jpg"},{"uniquekey":"785d4569da2d9afc0a6018ed2ba8b0ec","title":"【从新的历史方位出发】这首有故事的老厂歌，你可有听过吗？","date":"2018-11-30 12:34","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/181130123457408.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181130/20181130123457_4f4f3252aeab1677f89d279716afeab6_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20181130/20181130123457_4f4f3252aeab1677f89d279716afeab6_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20181130/20181130123457_4f4f3252aeab1677f89d279716afeab6_2_mwpm_03200403.jpg"},{"uniquekey":"a44a90fc2893d1bfd4bc4ae75b4bfd23","title":"体育总局人力中心羽毛球社会体育指导员国家职业资格考评员培训班在合肥举办","date":"2018-11-30 12:30","category":"头条","author_name":"国家体育总局","url":"http://mini.eastday.com/mobile/181130123034161.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181130/20181130123034_0d5f037be84d5ec76ab3e447aaec12ab_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181130/20181130123034_0d5f037be84d5ec76ab3e447aaec12ab_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181130/20181130123034_0d5f037be84d5ec76ab3e447aaec12ab_5_mwpm_03200403.jpg"},{"uniquekey":"066fdfcd2fe22c5c08ff957070394e85","title":"如果人类发现一个文明程度低于地球的文明，会怎么对待？","date":"2018-11-30 12:29","category":"头条","author_name":"科幻Monsters","url":"http://mini.eastday.com/mobile/181130122948503.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181130/20181130122948_218d394c9fce0deef3920c52f6139f97_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181130/20181130122948_218d394c9fce0deef3920c52f6139f97_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181130/20181130122948_218d394c9fce0deef3920c52f6139f97_4_mwpm_03200403.jpg"},{"uniquekey":"4191d3feb2273b20ec000d6cf6cc7f6e","title":"震惊！你的门禁、车钥匙、银行卡都会被黑客轻松攻破","date":"2018-11-30 12:24","category":"头条","author_name":"中国信息产业网　","url":"http://mini.eastday.com/mobile/181130122421197.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181130/20181130122421_bd54ad72e8ddf2fca5a5e5fa2129f218_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181130/20181130122421_bd54ad72e8ddf2fca5a5e5fa2129f218_1_mwpm_03200403.jpg"},{"uniquekey":"b8464cbd9e9275fda9754441c6f51b5f","title":"11.30强势美元难持续，黄金多头势将大放异彩","date":"2018-11-30 12:22","category":"头条","author_name":"金都财神A","url":"http://mini.eastday.com/mobile/181130122253337.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181130/20181130_8cf6ac4dc5bdec519a3bf39bf2cf2fa1_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181130/20181130_76417f08032947cfc7296975bd02c4ec_cover_mwpm_03200403.jpg"},{"uniquekey":"3d9cd76dff41bd1e26479db76c244893","title":"剑桥分析黑料：将Facebook用户时尚偏好数据用于定向广告","date":"2018-11-30 12:22","category":"头条","author_name":"36氪","url":"http://mini.eastday.com/mobile/181130122251628.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181130/20181130122251_6e26e49c972e68a4dbffa30ec6e678a3_1_mwpm_03200403.jpg"},{"uniquekey":"daceb5a21187d39546389ca7224d8856","title":"冬天就养这3种\u201c植物\u201d，味道清新还好养，活着的\u201c空气清新剂\u201d","date":"2018-11-30 12:20","category":"头条","author_name":"养花大全","url":"http://mini.eastday.com/mobile/181130122021795.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181130/20181130_7d26e8e0c8c22ffdb5e9f0eda0430e78_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181130/20181130_d7227e6bb4cf8742a9c06e8b0c089132_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181130/20181130_9e148436c24f2056132654879a6a6c1e_cover_mwpm_03200403.jpg"},{"uniquekey":"76d954a7b4acafaebe61fb1b287f8006","title":"塞尔比英锦赛首轮出局要丢世界第一：我整场比赛都打得很烂","date":"2018-11-30 12:20","category":"头条","author_name":"大猫体育","url":"http://mini.eastday.com/mobile/181130122016119.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181130/20181130122016_a5bdec95075e258156d881babb568733_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181130/20181130122016_a5bdec95075e258156d881babb568733_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181130/20181130122016_a5bdec95075e258156d881babb568733_1_mwpm_03200403.jpg"},{"uniquekey":"2382c0c867f6013c4e750dfee6c702e8","title":"盘点影视剧中尴尬穿帮镜头，一个比一个搞笑，吃饭勿入避免喷饭！","date":"2018-11-30 12:19","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/181130121934698.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181130/20181130121934_79022c7d5d48b964b6f2781332e84e46_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181130/20181130121934_79022c7d5d48b964b6f2781332e84e46_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181130/20181130121934_79022c7d5d48b964b6f2781332e84e46_6_mwpm_03200403.jpg"},{"uniquekey":"4009d88dc45b8f908c4341f61b667ceb","title":"英国王室的蜜月被诅咒，所有的婚姻都以离婚告终","date":"2018-11-30 12:19","category":"头条","author_name":"松柏威课","url":"http://mini.eastday.com/mobile/181130121927935.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181130/20181130_fdbe8c637b0a2bd8c1fae9d677e6b27a_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181130/20181130_21eeee569c9f950fcff240e776a0772a_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181130/20181130_77e939574e763fd7e769bbf80c1862eb_cover_mwpm_03200403.jpg"},{"uniquekey":"711ab33b5c153479b4101e049539ae1a","title":"王者荣耀：排位快速上分技巧，掌握这些段位提升犹如坐火箭","date":"2018-11-30 12:19","category":"头条","author_name":"游拼拼","url":"http://mini.eastday.com/mobile/181130121911700.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181130/20181130121911_cfec18406331ca546dc419782761b7a7_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181130/20181130121911_cfec18406331ca546dc419782761b7a7_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181130/20181130121911_cfec18406331ca546dc419782761b7a7_1_mwpm_03200403.jpg"},{"uniquekey":"696bbe91c17d6e03b78e9e43f77414e4","title":"阿根廷首都迎接G20将放假1天 政府鼓励民众出城度假","date":"2018-11-30 12:12","category":"头条","author_name":"多彩贵州网","url":"http://mini.eastday.com/mobile/181130121247941.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181130/20181130121247_89a0504331939a31b525000ab90dba71_1_mwpm_03200403.jpg"},{"uniquekey":"300da527a16580261c2cfa2104019b0a","title":"4岁上小学，16岁上大学，19岁西大本科女生直博复旦","date":"2018-11-30 12:12","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/181130121213799.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181130/20181130121213_052e0a096abe92afd72a4f6457ea7cc1_1_mwpm_03200403.jpg"},{"uniquekey":"91746ca1599aeed4f769b47940e4f016","title":"中国男篮世预赛轻松取胜, 但本场比赛最累的人, 却是场边看","date":"2018-11-30 12:09","category":"头条","author_name":"让足球飞","url":"http://mini.eastday.com/mobile/181130120919400.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181130/20181130_dd88b72d9c3aaffd744c44a53d5df0f9_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181130/20181130_2ae5f90cbc0d039b4db4e3235c7dc879_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20181130/20181130_8613a83f8b800feef8207453c9dbf048_cover_mwpm_03200403.jpg"},{"uniquekey":"6a1583ceded518ecf6f8bd46bf595526","title":"希丁克国奥新名单曝光，两留洋新星落选，此队连续2期无球员入选","date":"2018-11-30 12:08","category":"头条","author_name":"体育报道员","url":"http://mini.eastday.com/mobile/181130120855395.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181130/20181130_fde4f1db5513bea55251975b4b8faa8c_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181130/20181130_ab82bd6eae329f3a2ccdbcc140562fd6_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181130/20181130_a86851c588ecda8977b4cb4a05117678_cover_mwpm_03200403.jpg"},{"uniquekey":"1dade66a87b27045d12fc4d77fa5edb5","title":"创驰蓝天再次进化，全新马自达3亮相洛杉矶车展","date":"2018-11-30 12:07","category":"头条","author_name":"不如将久","url":"http://mini.eastday.com/mobile/181130120701916.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181130/20181130120701_750328f24325051f7cb92bc45de2c659_14_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181130/20181130120701_750328f24325051f7cb92bc45de2c659_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181130/20181130120701_750328f24325051f7cb92bc45de2c659_5_mwpm_03200403.jpg"},{"uniquekey":"ef24269a518ec42dc7cf466af7727195","title":"西安科技大市场提升科技成果转化效益 树立\u201c西安品牌\u201d","date":"2018-11-30 12:06","category":"头条","author_name":"36氪陕西","url":"http://mini.eastday.com/mobile/181130120603161.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181130/20181130120603_4ed8621f80f27d6035f9fc86b8741076_1_mwpm_03200403.jpg"},{"uniquekey":"d81b451b8f2e84a4e302e3ec99f09608","title":"东方观察：世界聚焦G20\u201c特普会\u201d为何突然取消？","date":"2018-11-30 12:05","category":"头条","author_name":"东方网","url":"http://mini.eastday.com/mobile/181130120541960.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181130/20181130120541_81aafc5dbfc7c8aa117aac4588bc8390_1_mwpm_03200403.jpg"},{"uniquekey":"2380b549c09414de6a12a83a8c591693","title":"山东民企的时代担当","date":"2018-11-30 12:05","category":"头条","author_name":"山东商报","url":"http://mini.eastday.com/mobile/181130120540185.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181130/20181130120540_4c712e1897fdd60309771a72a404faff_1_mwpm_03200403.jpg"},{"uniquekey":"004328e4afaa1f0acf87dfcc439c3748","title":"沪指早盘震荡涨0.23% 酿酒板块领涨两市","date":"2018-11-30 12:05","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/181130120505485.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181130/20181130120505_e70bfd731126e108da79c3f4245c17ee_1_mwpm_03200403.jpg"},{"uniquekey":"a702e5ed9eeee09b735af1c9e15465d8","title":"潜水员与3米长鳄鱼近距离接触 每一秒都是惊心动魄","date":"2018-11-30 12:04","category":"头条","author_name":"酒桶说三观","url":"http://mini.eastday.com/mobile/181130120408869.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181130/20181130_8900206678a5a4a069d1847e76195c74_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20181130/20181130_6ee23b93d7504bdda4d37a24bfbf695f_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20181130/20181130_6d331052d9ba790030168a47ba22c82e_cover_mwpm_03200403.jpg"},{"uniquekey":"a1600913b4ca622eebb84be856f328d0","title":"6脚传球天秀破门！纳尼1V4手起刀落 空翻庆祝廉颇未老","date":"2018-11-30 12:02","category":"头条","author_name":"代古龙","url":"http://mini.eastday.com/mobile/181130120241311.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181130/20181130_4bf2714f51d8a732289a230148af8b2e_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181130/20181130_68676f81a1590e9f180d0fa1365b97c4_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181130/20181130_ebebf6e3ee6f840fdf0253d8822fe71e_cover_mwpm_03200403.jpg"},{"uniquekey":"b0c1b8854da9dfca3f813c0546382e3a","title":"点外卖给差评后遭店员死亡威胁：知道你家地址，撞死你，我车全险","date":"2018-11-30 11:58","category":"头条","author_name":"东方头条","url":"http://mini.eastday.com/mobile/181130115859704.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181130/20181130_e3ebd520a54e274cdb0e4e7747710133_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181130/20181130_842d419c4563409066ba208a7f5a1ec3_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20181130/20181130_6a60f13fd0e6336dbdb8d29b2784c4ba_cover_mwpm_03200403.jpg"},{"uniquekey":"46d8762ce89f85fc6a00ba0170ccd4de","title":"大战一触即发！乌克兰孤注一掷，最新3个动作释放强烈冒险信号","date":"2018-11-30 11:57","category":"头条","author_name":"东方头条 大国军情","url":"http://mini.eastday.com/mobile/181130115738323.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181130/20181130_40023e9a82b44c7c7d53dab06c8cd9a9_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181130/20181130_f93ffed9ba03e161fab5df60152ce29a_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181130/20181130_0e4931a0073290054e8c697b1a14699f_mwpm_03200403.jpg"},{"uniquekey":"7aee8a17c6d8893e0d5e0b7414263363","title":"拨云见青天，3属相喜事登门，财运大好，从今日起能赚金银无数","date":"2018-11-30 11:57","category":"头条","author_name":"月亮弯之上","url":"http://mini.eastday.com/mobile/181130115723528.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181130/20181130_fce1aee01e658b66835e953aac4e83d6_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181130/20181130_2fdbf3cee6ffb8d12a89b6935649646b_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20181130/20181130_f20600c2e0d8ce720143454e85347aac_cover_mwpm_03200403.jpg"},{"uniquekey":"842d030bbde7e7ebee10b27fbb1840ea","title":"幽默笑话：妈妈说我还小不能早恋","date":"2018-11-30 11:56","category":"头条","author_name":"爱笑的傻猫","url":"http://mini.eastday.com/mobile/181130115650227.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181130/20181130_58436c8611ae7a5a81770099c1d6c9fc_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181130/20181130_b8494fd65e772bd3e650fd339ce0c3cc_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181130/20181130_e561abbfae80ea317110924e60a571d2_cover_mwpm_03200403.jpg"},{"uniquekey":"115519540509f82cb6b14245e46edf2f","title":"冬天健身，一定要管住自己的嘴，不然只会适得其反","date":"2018-11-30 11:56","category":"头条","author_name":"超燃健身派","url":"http://mini.eastday.com/mobile/181130115604517.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181130/20181130_bec936e9fe5c19e521940b9de79a2cac_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20181130/20181130_9054652af93d1e543459ec20d3939aa4_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20181130/20181130_c874b4d992d6e8e3a2e5e40e824d1d5e_cover_mwpm_03200403.jpg"},{"uniquekey":"6ac4d67494c49f4d111ebbfabec0c8e8","title":"横扫晋级，张择进澳网外卡赛四强！距离澳网正赛只差2场胜利！","date":"2018-11-30 11:55","category":"头条","author_name":"全景体育","url":"http://mini.eastday.com/mobile/181130115548275.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181130/20181130115548_a6fbcbe86a00fc74543f65cc0e858feb_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181130/20181130115548_a6fbcbe86a00fc74543f65cc0e858feb_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181130/20181130115548_a6fbcbe86a00fc74543f65cc0e858feb_1_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean implements Serializable {
            /**
             * uniquekey : 50db2b4dd091323ea5909dd475e79553
             * title : 乌克兰总统：一旦开战将从俄罗斯入侵之日起给军人涨工资
             * date : 2018-11-30 12:39
             * category : 头条
             * author_name : 新华视频
             * url : http://mini.eastday.com/mobile/181130123956757.html
             * thumbnail_pic_s : http://02imgmini.eastday.com/mobile/20181130/20181130123956_de90e397c5adac3d09174806edbf9668_1_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://03imgmini.eastday.com/mobile/20181130/20181130123457_4f4f3252aeab1677f89d279716afeab6_3_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://03imgmini.eastday.com/mobile/20181130/20181130123457_4f4f3252aeab1677f89d279716afeab6_2_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "News{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }
}
