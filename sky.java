package org.autojs.autojspro.gen;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.RegExpProxy;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.optimizer.OptRuntime;
import org.opencv.video.Video;

/* loaded from: C:\Users\admin\Desktop\classes2.dex */
public class _7a9076d6d94e62c13d641aa71f19ae8e extends NativeFunction implements Script {
    private static Object _re58_0;
    private static Object _re62_0;
    private static Object _re62_1;
    private static Object _re6_0;
    private static Object _re76_0;
    private static Object _re76_1;
    private static Object _re86_0;
    private static Object _re9_0;
    private static volatile boolean _reInitDone;
    private int _id;
    private static Integer _k0 = 122;
    private static Integer _k1 = 31232;
    private static Integer _k2 = 9999;
    private static Integer _k3 = 3;
    private static Integer _k4 = 600;
    private static Integer _k5 = 8;
    private static Integer _k6 = 643976;
    private static Integer _k7 = 4;
    private static Integer _k8 = 64;
    private static Integer _k9 = 255;
    private static Integer _k10 = -2;
    private static Integer _k11 = 6;
    private static Integer _k12 = 16;
    private static Integer _k13 = Integer.valueOf(Video.OPTFLOW_FARNEBACK_GAUSSIAN);
    private static Integer _k14 = 2032;
    private static Integer _k15 = 2000;
    private static Integer _k16 = 300;
    private static Integer _k17 = 950;
    private static Integer _k18 = 1000;
    private static Integer _k19 = 40;
    private static Integer _k20 = 60;
    private static Integer _k21 = 2;
    private static Integer _k22 = 100;
    private static Integer _k23 = 10;
    private static Integer _k24 = 5;
    private static Integer _k25 = 36;
    private static Integer _k26 = 66;
    private static Integer _k27 = 7;
    private static Integer _k28 = 6633;
    private static Integer _k29 = 3366;
    private static Integer _k30 = 15000;
    private static Integer _k31 = 2340;
    private static Integer _k32 = 20;
    private static Integer _k33 = 450;
    private static Double _k34 = OptRuntime.wrapDouble(1.2d);
    private static Integer _k35 = 25;
    private static Integer _k36 = 200;
    private static Integer _k37 = 800;
    private static Integer _k38 = 1080;
    private static Integer _k39 = 780;
    private static Integer _k40 = 975;
    private static Integer _k41 = 1170;
    private static Integer _k42 = 1365;
    private static Integer _k43 = 1560;
    private static Integer _k44 = 215;
    private static Integer _k45 = 410;
    private static Integer _k46 = 605;
    private static Double _k47 = OptRuntime.wrapDouble(0.1d);
    private static Integer _k48 = 880;
    private static Integer _k49 = 9;
    private static Integer _k50 = 18;
    private static Integer _k51 = 500;
    private static Integer _k52 = 99999999;
    private static Integer _k53 = 5000;
    private static Integer _k54 = 9000;

    public _7a9076d6d94e62c13d641aa71f19ae8e() {
        this._id = 0;
    }

    public _7a9076d6d94e62c13d641aa71f19ae8e(Scriptable scriptable, Context context, int i) {
        this._id = i;
        switch (i) {
            case 2:
                _i2(context, scriptable);
                break;
            case 3:
                _i3(context, scriptable);
                break;
            case 4:
                _i4(context, scriptable);
                break;
            case 5:
                _i5(context, scriptable);
                break;
            case 6:
                _i6(context, scriptable);
                break;
            case 7:
                _i7(context, scriptable);
                break;
            case 8:
                _i8(context, scriptable);
                break;
            case 9:
                _i9(context, scriptable);
                break;
            case 10:
                _i10(context, scriptable);
                break;
            case 11:
                _i11(context, scriptable);
                break;
            case 12:
                _i12(context, scriptable);
                break;
            case 13:
                _i13(context, scriptable);
                break;
            case 14:
                _i14(context, scriptable);
                break;
            case 15:
                _i15(context, scriptable);
                break;
            case 16:
                _i16(context, scriptable);
                break;
            case 17:
                _i17(context, scriptable);
                break;
            case 18:
                _i18(context, scriptable);
                break;
            case 19:
                _i19(context, scriptable);
                break;
            case 20:
                _i20(context, scriptable);
                break;
            case 21:
                _i21(context, scriptable);
                break;
            case 22:
                _i22(context, scriptable);
                break;
            case 23:
                _i23(context, scriptable);
                break;
            case 24:
                _i24(context, scriptable);
                break;
            case 25:
                _i25(context, scriptable);
                break;
            case 26:
                _i26(context, scriptable);
                break;
            case 27:
                _i27(context, scriptable);
                break;
            case 28:
                _i28(context, scriptable);
                break;
            case 29:
                _i29(context, scriptable);
                break;
            case 30:
                _i30(context, scriptable);
                break;
            case 31:
                _i31(context, scriptable);
                break;
            case 32:
                _i32(context, scriptable);
                break;
            case 33:
                _i33(context, scriptable);
                break;
            case 34:
                _i34(context, scriptable);
                break;
            case 35:
                _i35(context, scriptable);
                break;
            case 36:
                _i36(context, scriptable);
                break;
            case 37:
                _i37(context, scriptable);
                break;
            case 38:
                _i38(context, scriptable);
                break;
            case 39:
                _i39(context, scriptable);
                break;
            case 40:
                _i40(context, scriptable);
                break;
            case 41:
                _i41(context, scriptable);
                break;
            case 42:
                _i42(context, scriptable);
                break;
            case 43:
                _i43(context, scriptable);
                break;
            case 44:
                _i44(context, scriptable);
                break;
            case 45:
                _i45(context, scriptable);
                break;
            case 46:
                _i46(context, scriptable);
                break;
            case 47:
                _i47(context, scriptable);
                break;
            case 48:
                _i48(context, scriptable);
                break;
            case 49:
                _i49(context, scriptable);
                break;
            case 50:
                _i50(context, scriptable);
                break;
            case 51:
                _i51(context, scriptable);
                break;
            case 52:
                _i52(context, scriptable);
                break;
            case 53:
                _i53(context, scriptable);
                break;
            case 54:
                _i54(context, scriptable);
                break;
            case 55:
                _i55(context, scriptable);
                break;
            case 56:
                _i56(context, scriptable);
                break;
            case 57:
                _i57(context, scriptable);
                break;
            case 58:
                _i58(context, scriptable);
                break;
            case 59:
                _i59(context, scriptable);
                break;
            case 60:
                _i60(context, scriptable);
                break;
            case 61:
                _i61(context, scriptable);
                break;
            case 62:
                _i62(context, scriptable);
                break;
            case 63:
                _i63(context, scriptable);
                break;
            case 64:
                _i64(context, scriptable);
                break;
            case 65:
                _i65(context, scriptable);
                break;
            case 66:
                _i66(context, scriptable);
                break;
            case 67:
                _i67(context, scriptable);
                break;
            case 68:
                _i68(context, scriptable);
                break;
            case 69:
                _i69(context, scriptable);
                break;
            case 70:
                _i70(context, scriptable);
                break;
            case 71:
                _i71(context, scriptable);
                break;
            case 72:
                _i72(context, scriptable);
                break;
            case 73:
                _i73(context, scriptable);
                break;
            case 74:
                _i74(context, scriptable);
                break;
            case 75:
                _i75(context, scriptable);
                break;
            case 76:
                _i76(context, scriptable);
                break;
            case 77:
                _i77(context, scriptable);
                break;
            case 78:
                _i78(context, scriptable);
                break;
            case 79:
                _i79(context, scriptable);
                break;
            case 80:
                _i80(context, scriptable);
                break;
            case 81:
                _i81(context, scriptable);
                break;
            case 82:
                _i82(context, scriptable);
                break;
            case 83:
                _i83(context, scriptable);
                break;
            case 84:
                _i84(context, scriptable);
                break;
            case 85:
                _i85(context, scriptable);
                break;
            case 86:
                _i86(context, scriptable);
                break;
            case 87:
                _i87(context, scriptable);
                break;
            case 88:
                _i88(context, scriptable);
                break;
            case 89:
                _i89(context, scriptable);
                break;
            case 90:
                _i90(context, scriptable);
                break;
            case 91:
                _i91(context, scriptable);
                break;
            case 92:
                _i92(context, scriptable);
                break;
            case 93:
                _i93(context, scriptable);
                break;
            case 94:
                _i94(context, scriptable);
                break;
            case 95:
                _i95(context, scriptable);
                break;
            case 96:
                _i96(context, scriptable);
                break;
            case 97:
                _i97(context, scriptable);
                break;
            case 98:
                _i98(context, scriptable);
                break;
            case 99:
                _i99(context, scriptable);
                break;
            case 100:
                _i100(context, scriptable);
                break;
            case 101:
                _i101(context, scriptable);
                break;
            case 102:
                _i102(context, scriptable);
                break;
            case 103:
                _i103(context, scriptable);
                break;
            case 104:
                _i104(context, scriptable);
                break;
            case 105:
                _i105(context, scriptable);
                break;
            case 106:
                _i106(context, scriptable);
                break;
            case 107:
                _i107(context, scriptable);
                break;
            case 108:
                _i108(context, scriptable);
                break;
            case 109:
                _i109(context, scriptable);
                break;
            case 110:
                _i110(context, scriptable);
                break;
            case 111:
                _i111(context, scriptable);
                break;
            case 112:
                _i112(context, scriptable);
                break;
            case 113:
                _i113(context, scriptable);
                break;
            case 114:
                _i114(context, scriptable);
                break;
            case 115:
                _i115(context, scriptable);
                break;
            case 116:
                _i116(context, scriptable);
                break;
            case 117:
                _i117(context, scriptable);
                break;
            case 118:
                _i118(context, scriptable);
                break;
            case 119:
                _i119(context, scriptable);
                break;
            case 120:
                _i120(context, scriptable);
                break;
            case 121:
                _i121(context, scriptable);
                break;
            case 122:
                _i122(context, scriptable);
                break;
            case 123:
                _i123(context, scriptable);
                break;
            case 124:
                _i124(context, scriptable);
                break;
            case 125:
                _i125(context, scriptable);
                break;
            case 126:
                _i126(context, scriptable);
                break;
            case 127:
                _i127(context, scriptable);
                break;
            case 128:
                _i128(context, scriptable);
                break;
            case 129:
                _i129(context, scriptable);
                break;
            case 130:
                _i130(context, scriptable);
                break;
            case 131:
                _i131(context, scriptable);
                break;
            case 132:
                _i132(context, scriptable);
                break;
            case 133:
                _i133(context, scriptable);
                break;
            case 134:
                _i134(context, scriptable);
                break;
            case 135:
                _i135(context, scriptable);
                break;
            case 136:
                _i136(context, scriptable);
                break;
            case 137:
                _i137(context, scriptable);
                break;
            case 138:
                _i138(context, scriptable);
                break;
            case 139:
                _i139(context, scriptable);
                break;
            case 140:
                _i140(context, scriptable);
                break;
            case 141:
                _i141(context, scriptable);
                break;
            case 142:
                _i142(context, scriptable);
                break;
            case 143:
                _i143(context, scriptable);
                break;
            case 144:
                _i144(context, scriptable);
                break;
            case 145:
                _i145(context, scriptable);
                break;
            case 146:
                _i146(context, scriptable);
                break;
            case 147:
                _i147(context, scriptable);
                break;
            case 148:
                _i148(context, scriptable);
                break;
            case 149:
                _i149(context, scriptable);
                break;
            case 150:
                _i150(context, scriptable);
                break;
            case 151:
                _i151(context, scriptable);
                break;
            case 152:
                _i152(context, scriptable);
                break;
            case 153:
                _i153(context, scriptable);
                break;
            case 154:
                _i154(context, scriptable);
                break;
            case 155:
                _i155(context, scriptable);
                break;
            case 156:
                _i156(context, scriptable);
                break;
            case 157:
                _i157(context, scriptable);
                break;
            case 158:
                _i158(context, scriptable);
                break;
            case 159:
                _i159(context, scriptable);
                break;
            case 160:
                _i160(context, scriptable);
                break;
            case 161:
                _i161(context, scriptable);
                break;
            case 162:
                _i162(context, scriptable);
                break;
            case 163:
                _i163(context, scriptable);
                break;
            case 164:
                _i164(context, scriptable);
                break;
            case 165:
                _i165(context, scriptable);
                break;
            case 166:
                _i166(context, scriptable);
                break;
            case 167:
                _i167(context, scriptable);
                break;
            case 168:
                _i168(context, scriptable);
                break;
            case 169:
                _i169(context, scriptable);
                break;
            case 170:
                _i170(context, scriptable);
                break;
            case 171:
                _i171(context, scriptable);
                break;
            case 172:
                _i172(context, scriptable);
                break;
            case 173:
                _i173(context, scriptable);
                break;
            case 174:
                _i174(context, scriptable);
                break;
            case 175:
                _i175(context, scriptable);
                break;
            case 176:
                _i176(context, scriptable);
                break;
            case 177:
                _i177(context, scriptable);
                break;
            case 178:
                _i178(context, scriptable);
                break;
            case 179:
                _i179(context, scriptable);
                break;
            case 180:
                _i180(context, scriptable);
                break;
            case 181:
                _i181(context, scriptable);
                break;
            case 182:
                _i182(context, scriptable);
                break;
            case 183:
                _i183(context, scriptable);
                break;
            case 184:
                _i184(context, scriptable);
                break;
            case 185:
                _i185(context, scriptable);
                break;
            case 186:
                _i186(context, scriptable);
                break;
            case 187:
                _i187(context, scriptable);
                break;
            case 188:
                _i188(context, scriptable);
                break;
            case 189:
                _i189(context, scriptable);
                break;
            case 190:
                _i190(context, scriptable);
                break;
            case 191:
                _i191(context, scriptable);
                break;
            default:
                _i1(context, scriptable);
                break;
        }
    }

    /* renamed from: _c_别他妈瞎点_61_literal1, reason: contains not printable characters */
    private Scriptable m5_c__61_literal1(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return OptRuntime.newArrayLiteral(new Object[]{"柯南-平台", "核爆神曲aLIEz-B站2", "核爆简易版-B站2", "桃花朵朵开-B站2", "梁祝", "梁祝-笛子", "梦与叶樱(片段)-平台", "梦中的婚礼-B站", "梦回还-平台", "梦灯笼-B站2", "梦的光点-神兵小将-平台", "梦路らびりんす[梦路迷宫]-B站", "棉花糖-片段", "棠梨煎雪-B站", "森林狂想曲-B站2", "植物大战僵尸2-B站", "植物大战僵尸4-B站2", "標準結局BGM(2)", "樱花-平台", "樱花樱花想见你-B站", "欢-抖音片段", "欢乐斗地主1", "欢乐斗地主2", "歌曲串烧-B站", "此生不换-B站2", "殉情的抹香鲸-抖音片段", "残酷な天使のテーゼ-B站", "水星记-B站2", "永远的七日之都-平台", "江南-", "没什么大不了-你的名字", "泡沫-平台", "泰罗奥特曼-平台", "泸沽寻梦-古风", "洋娃娃和小熊跳舞-B站2", "流浪连 长版-平台", "流浪连-抖音小段", "浪人琵琶", "浮生未-平台", "海の幽灵-B站", "海の幽灵-片段", "海底(1)-B站2", "海底-B站2", "海底123-B站", "海底完整版-B站", "海底潭-B站2", "海海海-片段", "深海少女-B站2", "清明雨上-平台", "清空-抖音热歌", "渐冷-抖音热歌", "游京-片段", "游山恋-B站", "溯Reverse-B站2", "满目心河-B站", "演员-B站2", "潮汐-抖音小段", "潮鸣り-Clannad-B站", "火影bgm-笛子", "火柴天堂-B站", "火花-B站", "火花大会-B站", "炎炎消防队op-B站", "炭治郎之歌-抖音片段改", "烟火-副歌", "烟火里的尘埃-平台", "烟花易冷 杏子(1)-B站", "烦恼歌-B站", "焱-鬼灭之刃-平台", "燕无歇", "爱人错过-平台", "爱人错过2-平台", "爱存在", "爱殇-B站", "爱河-平台", "爱的供养-平台", "爱的奉献", "爱的罗曼史", "爱能做到的还有什么-简版", "爱若琉璃", "爱要怎么说出口-B站", "爸爸妈妈-李荣浩", "牛仔很忙-B站2", "牵丝戏-阎魅鬼-B站", "狂妄之人-B站2", "狂妄之徒凹凸世界-B站", "独家记忆-B站2", "独角戏-B站", "猪猪侠-片段", "猫耳开关-B站2", "玫瑰-伍佰-B站2", "玫瑰少年-抖音片段", "玫瑰花的葬礼-平台", "环太平洋-片段", "珊瑚海", "珠玉调-B站2", "理想三旬-B站", "琴之翼-B站2", "琴师", "琵琶行-无和弦-B站", "甜甜咸咸-", "生命之名-千与千寻-B站", "生命流-平台", "生意気ハニー-B站2", "生日快乐", "生日快乐2-B站2", "生生世世爱-B站2", "用尽我的一切奔向你-B站2", "甩葱歌-", "男人哭吧不是罪-B站", "画-邓紫棋-", "画心-平台", "疯鸟-B站", "病变-B站2", "白月光与朱砂痣-B站", "白月光与朱砂痣-抖音片段", "白桦林-", "白羊-平台", "百战成诗-改-", "盗将行-副歌-", "盲（原曲《诺》）-B站2", "直到世界的尽头-B站", "真的爱你-", "真的爱你-B站", "知足-平台", "知足-改", "石纪元ED-B站", "破茧 斗罗大陆-B站2", "破茧-B站", "神のまにまに(神的随波逐流)-B站2", "神圣夜晚 o holy night-B站", "私、アイドル宣言-B站", "秋姉妹のなく顷に-东方", "秋日私语-B站2", "穷开心-B站", "穿越时空の思念-平台", "穿越时空的思念-B站2", "突然的自我-平台", "童话-B站2", "笑纳-抖音热歌", "第一支圣诞歌The first noel-B站", "第五人格", "等你下课-平台", "粉刷匠-儿歌", "素颜-平台", "紫罗兰永恒花园-Sincerely-B站2", "紫罗兰永恒花园ED-B站2", "红尘客栈-B站2", "红色高跟鞋", "红艳-平台", "红莲华-B站2", "红莲华x千本樱-平台", "红魔乡 - 鬼畜妹 UN-B站2", "绅士-B站2", "给我一首歌的时间-B站", "给某某-平台", "绿色-B站2", "缘之空记忆-B站2", "罗密欧与灰姑娘-B站", "罗滨汉主题-B站", "罪恶王冠OP2", "美丽搭档(枯燥の曲)-平台", "美丽的神话-B站", "美人画卷-抖音热歌", "老男孩-B站", "肖邦夜曲Noctune-B站2", "背对背拥抱-副歌", "胡广生-B站2", "胧月-B站", "致爱丽丝-B站2", "致青春-B站", "艾斯奥特曼-平台", "芒种-快到碗里来。-B站2", "花之舞-平台", "花京院处刑曲-平台", "花海-B站", "花海-前奏片段", "若能绽放光芒-B站", "茫-平台", "茫-抖音片段", "莲花 李玉刚-B站", "菊次郎的夏天Summer-B站2", "萃梦想 - 砕月-B站2", "萤之光-疾风传", "萤火之森ed遇见夏天-B站2", "落-B站", "落-艾辰-平台", "落霜-B站", "葫芦娃-", "葬花吟-平台", "蒲公英的约定", "蔷薇列车-B站", "虹の彼方に-B站", "蜂鸟-B站2", "蜘蛛糸モノポリー完整版-B站", "蜘蛛系disco-片段", "蝴蝶少女-B站", "蝴蝶少女-抖音片段", "行尸走肉片头曲-B站", "被生命厌恶-B站", "託された想い (被寄托的思念)-B站", "让一切随风-B站", "该死的温柔-B站", "说好的幸福呢-", "说散就散-片段-", "说爱你-平台", "说谎-副歌-", "谪仙小段-B站2", "负重一万斤长大-B站2", "负重一万斤长大-平台", "赛文奥特曼-平台", "走马-B站2", "起风了-B站2", "超时空要塞-B站2", "超电磁炮X红莲华-平台", "超级玛丽-B站2", "跳舞的线-B站", "踏山河(1)-B站", "踏山河2-平台", "身后的故乡-B站", "轻音少女-B站", "轻飘飘时间(轻音少女)-平台", "辉夜+妹红-东方-平台", "辉夜大小姐-B站2", "辞九门回忆-四季刻歌制谱-B站2", "达拉崩吧-B站2", "达拉崩巴C调-B站", "过活-", "运动员进行曲", "还是分开-平台", "这一生关于你的风景-", "进击的巨人-B站2", "进击的巨人-简易版-B站2", "连备胎都不是-B站", "迪迦奥特曼-平台", "迷失幻境-", "追梦人-B站2", "追梦赤子心-B站", "逆风-B站2", "逍遥叹-B站", "逍遥叹-平台", "遇见-平台", "那个男孩-副歌", "那些你很冒险的梦-平台", "那些年-B站", "那些花儿", "邮递马车-B站", "酒醉的蝴蝶-B站2", "酒醉的蝴蝶2-B站2", "醉赤壁-平台", "醒不来的梦-抖音片段-", "采茶纪-", "重生路-B站", "野蜂飞舞适配完美版—沫忆-B站2", "金蛇狂舞-平台", "钢之炼金术师-B站2", "钢铁洪流进行曲-B站", "铃儿响叮当(沫忆)-炫技吉他", "铃儿响叮当", "错位时空-平台", "错季-平台", "锦鲤抄", "闪亮的圣诞节Deck The Halls-B站", "阿拉斯加海湾", "降临-B站2", "隔岸", "难忘今宵", "难生恨-完整", "难生恨-抖音片段", "雅俗共赏-平台", "雨的印记-平台", "雪月花-B站2", "雪绒花-B站2", "青柠", "青石巷-B站2", "青空pure sky-B站2", "青花瓷-平台", "青藏高原", "青鸟-重制版", "風見鶏-B站", "风之甬道-B站2", "风向仪(风见鸡)-B站", "风居住的街道-B站2", "风波恶-B站", "飞鸟和蝉-平台(1)", "飞鸟和蝉-平台", "马步谣-平台", "高洁的教皇-B站2", "鬼怪-B站2", "魔女之旅op-リテラチュア-B站", "魔法城堡-", "鸟之诗(完整)-平台", "鸟之诗-B站", "麻雀-B站", "黄昏与你-抖音片段", "黄金处刑曲-B站", "黑人抬棺-B站2", "龙卷风-B站2", "龙珠1-平台", "龙珠2-平台", "Faded", "Love Is Gone", "My sunset", "Wonderful U -片段", "The way i still love you", "The right path", "Let Me Down Slowly-稿", "凤舞-稿", "幻昼", "幻昼-全谱4乐器", "红色高跟鞋", "还是分开", "光年之外", "可惜没如果-未完成", "芒种", "偏爱", "美人鱼", "破茧", "失眠飞行", "爱丫爱丫", "潮汐", "侧脸", "手掌心", "甜甜的", "晚夜微雨问海棠-片段 ", "无羁", "无人之岛", "五月雨-片段", "星星失眠", "学校2015-Reset", "一个人的浪漫", "遇见", "悦神", "钟La Campanella(1)", "asphyxia", "BTS 春日 spring day", "Can Can 康康舞 (Alas)", "Canon.C", "Counting Star", "Creeper", "Example_Canon.C", "Faded", "Falling Flower 舞い落ちる花びら", "Faye's Theme 喵桑", "Flower Dance", "Fly me to the moon", "Foe River 完整版 喵桑", "G大调莫扎特奏鸣曲K283 Mozart Sonata", "Happy Birthday (to lord zhou) 边晴画 ", "jojo bloody stream", "jojoジョジョ～その血の运命", "Let It Go 冰雪奇缘", "loser", "Love yourself - Justin Bieber (guitar E)", "Merry Christmas Mr Lawrence", "Merry Christmas Mr Lawrence", "mojito", "monster(爱你三千遍)", "Nevada", "pray 杀戮的天使", "one more time,one more change秒速五厘米（完整版）边晴画", "refrain(完整版) 边晴画 ", "one more time,one more change（修改版）边晴画", "next to you.", "Remember me", "kiss the rain", "Start Over", "stay with me", "the show", "Take Me Higher-迪迦奥特曼", "The Truth that You Leave", "Untitle伴奏", "Viva La Vida", "We wish you a merry Christmas", "xxxtentacion - sad", "Shout", "Yellow", "You－Higurashi no Naku ni Kai OST", "young and beautiful", "巴托克evening in transylvania", "彩虹猫 Nyan Cat", "波西米亚狂想曲 Bohemian Rhapsody", "百战成诗-王者荣耀", "白月光与朱砂痣", "超电磁炮+红莲华Dcedillbey", "超越时空的思念", "城南花已开", "春娇与志明", "错位时空——惊鸿游雪", "打上花火 fireworks", "大鱼 独奏-星铭(8)", "yuri on ice(1)", "yuri on ice", "岸上的金鱼姬（maintheme）", "大鱼", "对面的女孩看过来—任贤齐", "豆豆", "德彪西 月光 debussy clair de lune", "稻香完整版Mkf", "盗将行1", "对面的女孩看过来—重制版（沫忆）", "飞鸟与蝉", "分裂—周杰伦", "干物女", "蜂鸟", "风之甬道（雪烛之城）", "大鱼(1)", "怪可爱的", "海底", "哈尔的移动城堡 howl's moving castle", "鬼怪round and round", "光遇 雨林", "海阔天空", "好想爱这个世界啊", "何以歌", "核爆神曲aLiez", "核爆神曲aLiez简易版", "钢之炼金术师again", "高洁的教皇 kakyoin theme", "坏苹果Bad Apple 简单easy", "坏苹果Bad Apple", "极乐净土(暴躁)", "家有女友op 声嘶力竭 crying for rain", "回家的诱惑 不可原谅", "辉夜大小姐op love is war", "降临", "进击的巨人Guren no Yumiya 简易版easy", "进击的巨人Guren no Yumiya", "酒醉的蝴蝶", "黑人抬棺", "红莲华 Gurenge", "花海周杰伦", "可乐", "菊次郎的夏天", "菊次郎的夏天349722e", "卡农 canon", "卡农—超酷炫技版", "克罗地亚狂想曲", "柯南", "狂妄之人 megalovania 简易easy", "狂妄之人 megalovania", "恋爱循环Renai Circulation 简易版 easy", "朗朗晴天ハレハレヤ", "铃儿响叮当2", "糸 aimer ito", "盲（原曲诺）", "蜜雪", "六兆年と一夜物語简谱1", "六兆年と一夜物語简谱", "魔法少女小圆 sis puella magica", "那个夏天(1)", "铃儿响叮当", "恋爱循环Renai Circulation", "那年我们变成了光", "你从未离去（简易版） 边晴画.LTPC", "扭腰歌 carameldansen", "你的名字 前前前世 简单版zen zen zense easy", "偏爱(1)", "你的名字 前前前世 zen zen zense", "你从未离去（完整版） 边晴画.LTPC", "平行线前奏", "起风了 ヤキモチ", "你从未离去（独奏版HARD） 边晴画.LTPC", "你从未离去（独奏版EASY） 边晴画.LTPC", "千本樱 Senbonzakura", "千本樱 Senbonzakura 简易版easy", "千灯愿", "千鸟城『 初版』AnAn作", "琴之翼 wings of piano", "青花瓷", "青石巷 Bluestone Alley", "情书 luv letter 简单easy", "情书 luv letter", "晴天2", "让风告诉你 原神拜年纪", "让我们荡起双桨", "撒野", "三叶的主题曲", "圣诞结—陈奕迅（沫忆）", "失眠飞行 insomnia flight", "时间飞行 镇魂", "水边的阿狄丽娜 Ballade pour Adeline", "斯卡布罗集市 scarborough fair", "死寂(暴躁)", "四季予你", "溯1", "溯reverse", "碎月", "所念皆星河", "天空之城 伴随着你", "天使的领刚", "天使的心跳", "跳舞的线 钢琴THE PAINO", "团子大家族", "最炫民族风", "晚夜微雨问海棠", "我在东北玩泥巴", "威风堂堂", "微信来电铃声", "未命名", "未闻花名 anohana 简易easy", "未闻花名 anohana", "我不配—周杰伦", "我还有点小糊涂", "呜咽（papiyon）", "无羁", "无论你多怪异我还是会喜欢你—刺客伍六七", "雾里 原著忆·思 边晴画改编(1)", "囍 chinese wedding", "下雨天", "夏天的风 summer breeze", "像我这样的人—毛不易（沫忆）", "小鸠 即将到来的明天 演奏版 Kobato", "小星星变奏曲", "肖邦 离别 chopin etude 3", "烟花易冷 ", "烟雨行舟", "妖精的尾巴", "野蜂飞舞适配完美版—沫忆", "一步之遥 Por una Cabeza", "一剪梅", "一吻天荒[By北北]", "有何不可", "致青春", "坠落星空 falling stars", "紫罗兰永恒花园ed 路标 Michishirube", "自制歌曲", "原神庆云顶音乐", "原神主题曲", "真新镇简易版"}, (String) null, 0, context, scriptable);
    }

    /* renamed from: _c_别他妈瞎点_65_literal1, reason: contains not printable characters */
    private Scriptable m8_c__65_literal1(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return OptRuntime.newArrayLiteral(new Object[]{"柯南-平台", "核爆神曲aLIEz-B站2", "核爆简易版-B站2", "桃花朵朵开-B站2", "梁祝", "梁祝-笛子", "梦与叶樱(片段)-平台", "梦中的婚礼-B站", "梦回还-平台", "梦灯笼-B站2", "梦的光点-神兵小将-平台", "梦路らびりんす[梦路迷宫]-B站", "棉花糖-片段", "棠梨煎雪-B站", "森林狂想曲-B站2", "植物大战僵尸2-B站", "植物大战僵尸4-B站2", "標準結局BGM(2)", "樱花-平台", "樱花樱花想见你-B站", "欢-抖音片段", "欢乐斗地主1", "欢乐斗地主2", "歌曲串烧-B站", "此生不换-B站2", "殉情的抹香鲸-抖音片段", "残酷な天使のテーゼ-B站", "水星记-B站2", "永远的七日之都-平台", "江南-", "没什么大不了-你的名字", "泡沫-平台", "泰罗奥特曼-平台", "泸沽寻梦-古风", "洋娃娃和小熊跳舞-B站2", "流浪连 长版-平台", "流浪连-抖音小段", "浪人琵琶", "浮生未-平台", "海の幽灵-B站", "海の幽灵-片段", "海底(1)-B站2", "海底-B站2", "海底123-B站", "海底完整版-B站", "海底潭-B站2", "海海海-片段", "深海少女-B站2", "清明雨上-平台", "清空-抖音热歌", "渐冷-抖音热歌", "游京-片段", "游山恋-B站", "溯Reverse-B站2", "满目心河-B站", "演员-B站2", "潮汐-抖音小段", "潮鸣り-Clannad-B站", "火影bgm-笛子", "火柴天堂-B站", "火花-B站", "火花大会-B站", "炎炎消防队op-B站", "炭治郎之歌-抖音片段改", "烟火-副歌", "烟火里的尘埃-平台", "烟花易冷 杏子(1)-B站", "烦恼歌-B站", "焱-鬼灭之刃-平台", "燕无歇", "爱人错过-平台", "爱人错过2-平台", "爱存在", "爱殇-B站", "爱河-平台", "爱的供养-平台", "爱的奉献", "爱的罗曼史", "爱能做到的还有什么-简版", "爱若琉璃", "爱要怎么说出口-B站", "爸爸妈妈-李荣浩", "牛仔很忙-B站2", "牵丝戏-阎魅鬼-B站", "狂妄之人-B站2", "狂妄之徒凹凸世界-B站", "独家记忆-B站2", "独角戏-B站", "猪猪侠-片段", "猫耳开关-B站2", "玫瑰-伍佰-B站2", "玫瑰少年-抖音片段", "玫瑰花的葬礼-平台", "环太平洋-片段", "珊瑚海", "珠玉调-B站2", "理想三旬-B站", "琴之翼-B站2", "琴师", "琵琶行-无和弦-B站", "甜甜咸咸-", "生命之名-千与千寻-B站", "生命流-平台", "生意気ハニー-B站2", "生日快乐", "生日快乐2-B站2", "生生世世爱-B站2", "用尽我的一切奔向你-B站2", "甩葱歌-", "男人哭吧不是罪-B站", "画-邓紫棋-", "画心-平台", "疯鸟-B站", "病变-B站2", "白月光与朱砂痣-B站", "白月光与朱砂痣-抖音片段", "白桦林-", "白羊-平台", "百战成诗-改-", "盗将行-副歌-", "盲（原曲《诺》）-B站2", "直到世界的尽头-B站", "真的爱你-", "真的爱你-B站", "知足-平台", "知足-改", "石纪元ED-B站", "破茧 斗罗大陆-B站2", "破茧-B站", "神のまにまに(神的随波逐流)-B站2", "神圣夜晚 o holy night-B站", "私、アイドル宣言-B站", "秋姉妹のなく顷に-东方", "秋日私语-B站2", "穷开心-B站", "穿越时空の思念-平台", "穿越时空的思念-B站2", "突然的自我-平台", "童话-B站2", "笑纳-抖音热歌", "第一支圣诞歌The first noel-B站", "第五人格", "等你下课-平台", "粉刷匠-儿歌", "素颜-平台", "紫罗兰永恒花园-Sincerely-B站2", "紫罗兰永恒花园ED-B站2", "红尘客栈-B站2", "红色高跟鞋", "红艳-平台", "红莲华-B站2", "红莲华x千本樱-平台", "红魔乡 - 鬼畜妹 UN-B站2", "绅士-B站2", "给我一首歌的时间-B站", "给某某-平台", "绿色-B站2", "缘之空记忆-B站2", "罗密欧与灰姑娘-B站", "罗滨汉主题-B站", "罪恶王冠OP2", "美丽搭档(枯燥の曲)-平台", "美丽的神话-B站", "美人画卷-抖音热歌", "老男孩-B站", "肖邦夜曲Noctune-B站2", "背对背拥抱-副歌", "胡广生-B站2", "胧月-B站", "致爱丽丝-B站2", "致青春-B站", "艾斯奥特曼-平台", "芒种-快到碗里来。-B站2", "花之舞-平台", "花京院处刑曲-平台", "花海-B站", "花海-前奏片段", "若能绽放光芒-B站", "茫-平台", "茫-抖音片段", "莲花 李玉刚-B站", "菊次郎的夏天Summer-B站2", "萃梦想 - 砕月-B站2", "萤之光-疾风传", "萤火之森ed遇见夏天-B站2", "落-B站", "落-艾辰-平台", "落霜-B站", "葫芦娃-", "葬花吟-平台", "蒲公英的约定", "蔷薇列车-B站", "虹の彼方に-B站", "蜂鸟-B站2", "蜘蛛糸モノポリー完整版-B站", "蜘蛛系disco-片段", "蝴蝶少女-B站", "蝴蝶少女-抖音片段", "行尸走肉片头曲-B站", "被生命厌恶-B站", "託された想い (被寄托的思念)-B站", "让一切随风-B站", "该死的温柔-B站", "说好的幸福呢-", "说散就散-片段-", "说爱你-平台", "说谎-副歌-", "谪仙小段-B站2", "负重一万斤长大-B站2", "负重一万斤长大-平台", "赛文奥特曼-平台", "走马-B站2", "起风了-B站2", "超时空要塞-B站2", "超电磁炮X红莲华-平台", "超级玛丽-B站2", "跳舞的线-B站", "踏山河(1)-B站", "踏山河2-平台", "身后的故乡-B站", "轻音少女-B站", "轻飘飘时间(轻音少女)-平台", "辉夜+妹红-东方-平台", "辉夜大小姐-B站2", "辞九门回忆-四季刻歌制谱-B站2", "达拉崩吧-B站2", "达拉崩巴C调-B站", "过活-", "运动员进行曲", "还是分开-平台", "这一生关于你的风景-", "进击的巨人-B站2", "进击的巨人-简易版-B站2", "连备胎都不是-B站", "迪迦奥特曼-平台", "迷失幻境-", "追梦人-B站2", "追梦赤子心-B站", "逆风-B站2", "逍遥叹-B站", "逍遥叹-平台", "遇见-平台", "那个男孩-副歌", "那些你很冒险的梦-平台", "那些年-B站", "那些花儿", "邮递马车-B站", "酒醉的蝴蝶-B站2", "酒醉的蝴蝶2-B站2", "醉赤壁-平台", "醒不来的梦-抖音片段-", "采茶纪-", "重生路-B站", "野蜂飞舞适配完美版—沫忆-B站2", "金蛇狂舞-平台", "钢之炼金术师-B站2", "钢铁洪流进行曲-B站", "铃儿响叮当(沫忆)-炫技吉他", "铃儿响叮当", "错位时空-平台", "错季-平台", "锦鲤抄", "闪亮的圣诞节Deck The Halls-B站", "阿拉斯加海湾", "降临-B站2", "隔岸", "难忘今宵", "难生恨-完整", "难生恨-抖音片段", "雅俗共赏-平台", "雨的印记-平台", "雪月花-B站2", "雪绒花-B站2", "青柠", "青石巷-B站2", "青空pure sky-B站2", "青花瓷-平台", "青藏高原", "青鸟-重制版", "風見鶏-B站", "风之甬道-B站2", "风向仪(风见鸡)-B站", "风居住的街道-B站2", "风波恶-B站", "飞鸟和蝉-平台(1)", "飞鸟和蝉-平台", "马步谣-平台", "高洁的教皇-B站2", "鬼怪-B站2", "魔女之旅op-リテラチュア-B站", "魔法城堡-", "鸟之诗(完整)-平台", "鸟之诗-B站", "麻雀-B站", "黄昏与你-抖音片段", "黄金处刑曲-B站", "黑人抬棺-B站2", "龙卷风-B站2", "龙珠1-平台", "龙珠2-平台", "Faded", "Love Is Gone", "My sunset", "Wonderful U -片段", "The way i still love you", "The right path", "Let Me Down Slowly-稿", "凤舞-稿", "幻昼", "幻昼-全谱4乐器", "红色高跟鞋", "还是分开", "光年之外", "可惜没如果-未完成", "芒种", "偏爱", "美人鱼", "破茧", "失眠飞行", "爱丫爱丫", "潮汐", "侧脸", "手掌心", "甜甜的", "晚夜微雨问海棠-片段 ", "无羁", "无人之岛", "五月雨-片段", "星星失眠", "学校2015-Reset", "一个人的浪漫", "遇见", "悦神", "钟La Campanella(1)", "asphyxia", "BTS 春日 spring day", "Can Can 康康舞 (Alas)", "Canon.C", "Counting Star", "Creeper", "Example_Canon.C", "Faded", "Falling Flower 舞い落ちる花びら", "Faye's Theme 喵桑", "Flower Dance", "Fly me to the moon", "Foe River 完整版 喵桑", "G大调莫扎特奏鸣曲K283 Mozart Sonata", "Happy Birthday (to lord zhou) 边晴画 ", "jojo bloody stream", "jojoジョジョ～その血の运命", "Let It Go 冰雪奇缘", "loser", "Love yourself - Justin Bieber (guitar E)", "Merry Christmas Mr Lawrence", "Merry Christmas Mr Lawrence", "mojito", "monster(爱你三千遍)", "Nevada", "pray 杀戮的天使", "one more time,one more change秒速五厘米（完整版）边晴画", "refrain(完整版) 边晴画 ", "one more time,one more change（修改版）边晴画", "next to you.", "Remember me", "kiss the rain", "Start Over", "stay with me", "the show", "Take Me Higher-迪迦奥特曼", "The Truth that You Leave", "Untitle伴奏", "Viva La Vida", "We wish you a merry Christmas", "xxxtentacion - sad", "Shout", "Yellow", "You－Higurashi no Naku ni Kai OST", "young and beautiful", "巴托克evening in transylvania", "彩虹猫 Nyan Cat", "波西米亚狂想曲 Bohemian Rhapsody", "百战成诗-王者荣耀", "白月光与朱砂痣", "超电磁炮+红莲华Dcedillbey", "超越时空的思念", "城南花已开", "春娇与志明", "错位时空——惊鸿游雪", "打上花火 fireworks", "大鱼 独奏-星铭(8)", "yuri on ice(1)", "yuri on ice", "岸上的金鱼姬（maintheme）", "大鱼", "对面的女孩看过来—任贤齐", "豆豆", "德彪西 月光 debussy clair de lune", "稻香完整版Mkf", "盗将行1", "对面的女孩看过来—重制版（沫忆）", "飞鸟与蝉", "分裂—周杰伦", "干物女", "蜂鸟", "风之甬道（雪烛之城）", "大鱼(1)", "怪可爱的", "海底", "哈尔的移动城堡 howl's moving castle", "鬼怪round and round", "光遇 雨林", "海阔天空", "好想爱这个世界啊", "何以歌", "核爆神曲aLiez", "核爆神曲aLiez简易版", "钢之炼金术师again", "高洁的教皇 kakyoin theme", "坏苹果Bad Apple 简单easy", "坏苹果Bad Apple", "极乐净土(暴躁)", "家有女友op 声嘶力竭 crying for rain", "回家的诱惑 不可原谅", "辉夜大小姐op love is war", "降临", "进击的巨人Guren no Yumiya 简易版easy", "进击的巨人Guren no Yumiya", "酒醉的蝴蝶", "黑人抬棺", "红莲华 Gurenge", "花海周杰伦", "可乐", "菊次郎的夏天", "菊次郎的夏天349722e", "卡农 canon", "卡农—超酷炫技版", "克罗地亚狂想曲", "柯南", "狂妄之人 megalovania 简易easy", "狂妄之人 megalovania", "恋爱循环Renai Circulation 简易版 easy", "朗朗晴天ハレハレヤ", "铃儿响叮当2", "糸 aimer ito", "盲（原曲诺）", "蜜雪", "六兆年と一夜物語简谱1", "六兆年と一夜物語简谱", "魔法少女小圆 sis puella magica", "那个夏天(1)", "铃儿响叮当", "恋爱循环Renai Circulation", "那年我们变成了光", "你从未离去（简易版） 边晴画.LTPC", "扭腰歌 carameldansen", "你的名字 前前前世 简单版zen zen zense easy", "偏爱(1)", "你的名字 前前前世 zen zen zense", "你从未离去（完整版） 边晴画.LTPC", "平行线前奏", "起风了 ヤキモチ", "你从未离去（独奏版HARD） 边晴画.LTPC", "你从未离去（独奏版EASY） 边晴画.LTPC", "千本樱 Senbonzakura", "千本樱 Senbonzakura 简易版easy", "千灯愿", "千鸟城『 初版』AnAn作", "琴之翼 wings of piano", "青花瓷", "青石巷 Bluestone Alley", "情书 luv letter 简单easy", "情书 luv letter", "晴天2", "让风告诉你 原神拜年纪", "让我们荡起双桨", "撒野", "三叶的主题曲", "圣诞结—陈奕迅（沫忆）", "失眠飞行 insomnia flight", "时间飞行 镇魂", "水边的阿狄丽娜 Ballade pour Adeline", "斯卡布罗集市 scarborough fair", "死寂(暴躁)", "四季予你", "溯1", "溯reverse", "碎月", "所念皆星河", "天空之城 伴随着你", "天使的领刚", "天使的心跳", "跳舞的线 钢琴THE PAINO", "团子大家族", "最炫民族风", "晚夜微雨问海棠", "我在东北玩泥巴", "威风堂堂", "微信来电铃声", "未命名", "未闻花名 anohana 简易easy", "未闻花名 anohana", "我不配—周杰伦", "我还有点小糊涂", "呜咽（papiyon）", "无羁", "无论你多怪异我还是会喜欢你—刺客伍六七", "雾里 原著忆·思 边晴画改编(1)", "囍 chinese wedding", "下雨天", "夏天的风 summer breeze", "像我这样的人—毛不易（沫忆）", "小鸠 即将到来的明天 演奏版 Kobato", "小星星变奏曲", "肖邦 离别 chopin etude 3", "烟花易冷 ", "烟雨行舟", "妖精的尾巴", "野蜂飞舞适配完美版—沫忆", "一步之遥 Por una Cabeza", "一剪梅", "一吻天荒[By北北]", "有何不可", "致青春", "坠落星空 falling stars", "紫罗兰永恒花园ed 路标 Michishirube", "自制歌曲", "原神庆云顶音乐", "原神主题曲", "真新镇简易版"}, (String) null, 0, context, scriptable);
    }

    private final void _i1(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i10(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i100(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i101(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i102(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i103(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i104(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i105(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i106(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i107(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i108(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i109(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i11(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i110(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i111(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i112(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i113(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i114(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i115(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i116(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i117(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i118(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i119(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i12(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i120(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i121(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i122(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i123(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i124(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i125(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i126(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i127(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i128(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i129(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i13(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i130(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i131(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i132(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i133(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i134(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i135(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i136(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i137(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i138(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i139(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i14(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i140(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i141(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i142(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i143(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i144(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i145(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i146(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i147(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i148(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i149(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i15(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i150(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i151(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i152(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i153(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i154(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i155(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i156(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i157(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i158(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i159(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i16(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i160(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i161(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i162(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i163(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i164(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i165(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i166(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i167(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i168(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i169(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i17(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i170(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i171(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i172(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i173(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i174(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i175(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i176(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i177(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i178(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i179(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i18(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i180(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i181(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i182(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i183(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i184(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i185(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i186(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i187(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i188(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i189(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i19(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i190(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i191(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i2(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i20(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i21(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i22(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i23(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i24(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i25(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i26(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i27(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i28(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i29(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i3(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i30(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i31(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i32(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i33(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i34(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i35(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i36(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i37(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i38(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i39(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i4(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i40(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i41(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i42(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i43(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i44(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i45(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i46(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i47(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i48(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i49(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i5(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i50(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i51(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i52(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i53(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i54(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i55(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i56(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i57(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i58(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
        _reInit(context);
    }

    private final void _i59(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i6(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
        _reInit(context);
    }

    private final void _i60(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i61(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i62(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
        _reInit(context);
    }

    private final void _i63(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i64(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i65(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i66(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i67(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i68(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i69(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i7(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i70(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i71(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i72(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i73(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i74(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i75(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i76(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
        _reInit(context);
    }

    private final void _i77(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i78(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i79(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i8(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i80(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i81(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i82(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i83(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i84(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i85(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i86(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
        _reInit(context);
    }

    private final void _i87(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i88(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i89(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i9(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
        _reInit(context);
    }

    private final void _i90(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i91(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i92(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i93(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i94(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i95(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i96(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i97(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i98(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private final void _i99(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable);
    }

    private static Object _n187(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object obj, double d, Object[] objArr) {
        Scriptable createObject = _7a9076d6d94e62c13d641aa71f19ae8eVar.createObject(context, scriptable);
        Object _c_toCode_187 = _c_toCode_187(_7a9076d6d94e62c13d641aa71f19ae8eVar, context, scriptable, createObject, obj, d, objArr);
        return _c_toCode_187 instanceof Scriptable ? (Scriptable) _c_toCode_187 : createObject;
    }

    private static Object _n191(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object obj, double d, Object[] objArr) {
        Scriptable createObject = _7a9076d6d94e62c13d641aa71f19ae8eVar.createObject(context, scriptable);
        Object _c_md5_191 = _c_md5_191(_7a9076d6d94e62c13d641aa71f19ae8eVar, context, scriptable, createObject, obj, d, objArr);
        return _c_md5_191 instanceof Scriptable ? (Scriptable) _c_md5_191 : createObject;
    }

    private static Object _n58(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object obj, double d, Object obj2, double d2, Object[] objArr) {
        Scriptable createObject = _7a9076d6d94e62c13d641aa71f19ae8eVar.createObject(context, scriptable);
        Object m19_c__58 = m19_c__58(_7a9076d6d94e62c13d641aa71f19ae8eVar, context, scriptable, createObject, obj, d, obj2, d2, objArr);
        return m19_c__58 instanceof Scriptable ? (Scriptable) m19_c__58 : createObject;
    }

    private static Object _n81(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object obj, double d, Object[] objArr) {
        Scriptable createObject = _7a9076d6d94e62c13d641aa71f19ae8eVar.createObject(context, scriptable);
        Object m18_c__81 = m18_c__81(_7a9076d6d94e62c13d641aa71f19ae8eVar, context, scriptable, createObject, obj, d, objArr);
        return m18_c__81 instanceof Scriptable ? (Scriptable) m18_c__81 : createObject;
    }

    private static void _reInit(Context context) {
        if (_reInitDone) {
            return;
        }
        RegExpProxy checkRegExpProxy = ScriptRuntime.checkRegExpProxy(context);
        _re6_0 = checkRegExpProxy.compileRegExp(context, "[hFAfplGIHzOKexnfr=]", "g");
        _re9_0 = checkRegExpProxy.compileRegExp(context, "=+$", "");
        _re58_0 = checkRegExpProxy.compileRegExp(context, "[^0-9]", "ig");
        _re62_0 = checkRegExpProxy.compileRegExp(context, "\\s+", "g");
        _re62_1 = checkRegExpProxy.compileRegExp(context, "\\s+", "g");
        _re76_0 = checkRegExpProxy.compileRegExp(context, "\\s+", "g");
        _re76_1 = checkRegExpProxy.compileRegExp(context, "\\s+", "g");
        _re86_0 = checkRegExpProxy.compileRegExp(context, "[^0-9]", "ig");
        _reInitDone = true;
    }

    public static void main(String[] strArr) {
        OptRuntime.main(new _7a9076d6d94e62c13d641aa71f19ae8e(), strArr);
    }

    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!ScriptRuntime.hasTopCall(context)) {
            return ScriptRuntime.doTopCall(this, context, scriptable, scriptable2, objArr, false);
        }
        switch (this._id) {
            case 1:
                return _c_toCode_1(this, context, scriptable, scriptable2, objArr);
            case 2:
                return _c_fromCode_2(this, context, scriptable, scriptable2, objArr);
            case 3:
                return _c_anonymous_3(this, context, scriptable, scriptable2, objArr);
            case 4:
                return _c_anonymous_4(this, context, scriptable, scriptable2, objArr);
            case 5:
                return _c_anonymous_5(this, context, scriptable, scriptable2, objArr);
            case 6:
                return _c_anonymous_6(this, context, scriptable, scriptable2, objArr);
            case 7:
                return _c_anonymous_7(this, context, scriptable, scriptable2, objArr);
            case 8:
                return _c_anonymous_8(this, context, scriptable, scriptable2, objArr);
            case 9:
                return _c_anonymous_9(this, context, scriptable, scriptable2, objArr);
            case 10:
                return _c_anonymous_10(this, context, scriptable, scriptable2, objArr);
            case 11:
                return _c_anonymous_11(this, context, scriptable, scriptable2, objArr);
            case 12:
                return _c_anonymous_12(this, context, scriptable, scriptable2, objArr);
            case 13:
                return _c_anonymous_13(this, context, scriptable, scriptable2, objArr);
            case 14:
                return _c_md5_14(this, context, scriptable, scriptable2, objArr);
            case 15:
                return _c_anonymous_15(this, context, scriptable, scriptable2, objArr);
            case 16:
                return _c_anonymous_16(this, context, scriptable, scriptable2, objArr);
            case 17:
                return _c_anonymous_17(this, context, scriptable, scriptable2, objArr);
            case 18:
                return _c_anonymous_18(this, context, scriptable, scriptable2, objArr);
            case 19:
                return _c_anonymous_19(this, context, scriptable, scriptable2, objArr);
            case 20:
                return _c_anonymous_20(this, context, scriptable, scriptable2, objArr);
            case 21:
                return _c_anonymous_21(this, context, scriptable, scriptable2, objArr);
            case 22:
                return _c_anonymous_22(this, context, scriptable, scriptable2, objArr);
            case 23:
                return _c_anonymous_23(this, context, scriptable, scriptable2, objArr);
            case 24:
                return _c_anonymous_24(this, context, scriptable, scriptable2, objArr);
            case 25:
                return _c_anonymous_25(this, context, scriptable, scriptable2, objArr);
            case 26:
                return _c_anonymous_26(this, context, scriptable, scriptable2, objArr);
            case 27:
                return _c_anonymous_27(this, context, scriptable, scriptable2, objArr);
            case 28:
                return _c_anonymous_28(this, context, scriptable, scriptable2, objArr);
            case 29:
                return _c_initFloatWin_29(this, context, scriptable, scriptable2, objArr);
            case 30:
                return _c_anonymous_30(this, context, scriptable, scriptable2, objArr);
            case 31:
                return _c_anonymous_31(this, context, scriptable, scriptable2, objArr);
            case 32:
                return _c_anonymous_32(this, context, scriptable, scriptable2, objArr);
            case 33:
                return _c_anonymous_33(this, context, scriptable, scriptable2, objArr);
            case 34:
                return _c_anonymous_34(this, context, scriptable, scriptable2, objArr);
            case 35:
                return _c_anonymous_35(this, context, scriptable, scriptable2, objArr);
            case 36:
                return _c_anonymous_36(this, context, scriptable, scriptable2, objArr);
            case 37:
                return _c_anonymous_37(this, context, scriptable, scriptable2, objArr);
            case 38:
                return _c_anonymous_38(this, context, scriptable, scriptable2, objArr);
            case 39:
                return _c_anonymous_39(this, context, scriptable, scriptable2, objArr);
            case 40:
                return _c_anonymous_40(this, context, scriptable, scriptable2, objArr);
            case 41:
                return _c_anonymous_41(this, context, scriptable, scriptable2, objArr);
            case 42:
                return _c_anonymous_42(this, context, scriptable, scriptable2, objArr);
            case 43:
                return _c_anonymous_43(this, context, scriptable, scriptable2, objArr);
            case 44:
                return m9_c__44(this, context, scriptable, scriptable2, objArr);
            case 45:
                return m13_c__45(this, context, scriptable, scriptable2, objArr);
            case 46:
                return _c_anonymous_46(this, context, scriptable, scriptable2, objArr);
            case 47:
                return _c_anonymous_47(this, context, scriptable, scriptable2, objArr);
            case 48:
                return m14_c__48(this, context, scriptable, scriptable2, objArr);
            case 49:
                return _c_anonymous_49(this, context, scriptable, scriptable2, objArr);
            case 50:
                return _c_anonymous_50(this, context, scriptable, scriptable2, objArr);
            case 51:
                return _c_anonymous_51(this, context, scriptable, scriptable2, objArr);
            case 52:
                return m22_c__52(this, context, scriptable, scriptable2, objArr);
            case 53:
                return _c_anonymous_53(this, context, scriptable, scriptable2, objArr);
            case 54:
                return m28_c__54(this, context, scriptable, scriptable2, objArr);
            case 55:
                return _c_anonymous_55(this, context, scriptable, scriptable2, objArr);
            case 56:
                return m2_c__56(this, context, scriptable, scriptable2, objArr);
            case 57:
                return _c_anonymous_57(this, context, scriptable, scriptable2, objArr);
            case 58:
                return m19_c__58(this, context, scriptable, scriptable2, objArr.length > 0 ? objArr[0] : Undefined.instance, 0.0d, objArr.length > 1 ? objArr[1] : Undefined.instance, 0.0d, objArr);
            case 59:
                return m3_c__59(this, context, scriptable, scriptable2, objArr);
            case 60:
                return _c_anonymous_60(this, context, scriptable, scriptable2, objArr);
            case 61:
                return m4_c__61(this, context, scriptable, scriptable2, objArr);
            case 62:
                return _c_anonymous_62(this, context, scriptable, scriptable2, objArr);
            case 63:
                return m6_c__63(this, context, scriptable, scriptable2, objArr);
            case 64:
                return _c_anonymous_64(this, context, scriptable, scriptable2, objArr);
            case 65:
                return m7_c__65(this, context, scriptable, scriptable2, objArr);
            case 66:
                return _c_anonymous_66(this, context, scriptable, scriptable2, objArr);
            case 67:
                return m25_c__67(this, context, scriptable, scriptable2, objArr);
            case 68:
                return _c_anonymous_68(this, context, scriptable, scriptable2, objArr);
            case 69:
                return _c_anonymous_69(this, context, scriptable, scriptable2, objArr);
            case 70:
                return m12_c__70(this, context, scriptable, scriptable2, objArr);
            case 71:
                return _c_anonymous_71(this, context, scriptable, scriptable2, objArr);
            case 72:
                return _c_anonymous_72(this, context, scriptable, scriptable2, objArr);
            case 73:
                return m24_c__73(this, context, scriptable, scriptable2, objArr);
            case 74:
                return _c_anonymous_74(this, context, scriptable, scriptable2, objArr);
            case 75:
                return m1_c__75(this, context, scriptable, scriptable2, objArr);
            case 76:
                return _c_anonymous_76(this, context, scriptable, scriptable2, objArr);
            case 77:
                return m20_c__77(this, context, scriptable, scriptable2, objArr);
            case 78:
                return _c_anonymous_78(this, context, scriptable, scriptable2, objArr);
            case 79:
                return m0_c__79(this, context, scriptable, scriptable2, objArr);
            case 80:
                return _c_anonymous_80(this, context, scriptable, scriptable2, objArr);
            case 81:
                return m18_c__81(this, context, scriptable, scriptable2, objArr.length > 0 ? objArr[0] : Undefined.instance, 0.0d, objArr);
            case 82:
                return m16_c__82(this, context, scriptable, scriptable2, objArr);
            case 83:
                return _c_anonymous_83(this, context, scriptable, scriptable2, objArr);
            case 84:
                return m15_c__84(this, context, scriptable, scriptable2, objArr);
            case 85:
                return _c_anonymous_85(this, context, scriptable, scriptable2, objArr);
            case 86:
                return m17_c__86(this, context, scriptable, scriptable2, objArr);
            case 87:
                return m11_c__87(this, context, scriptable, scriptable2, objArr);
            case 88:
                return _c_anonymous_88(this, context, scriptable, scriptable2, objArr);
            case 89:
                return _c_anonymous_89(this, context, scriptable, scriptable2, objArr);
            case 90:
                return _c_anonymous_90(this, context, scriptable, scriptable2, objArr);
            case 91:
                return _c_anonymous_91(this, context, scriptable, scriptable2, objArr);
            case 92:
                return _c_anonymous_92(this, context, scriptable, scriptable2, objArr);
            case 93:
                return _c_anonymous_93(this, context, scriptable, scriptable2, objArr);
            case 94:
                return _c_anonymous_94(this, context, scriptable, scriptable2, objArr);
            case 95:
                return _c_anonymous_95(this, context, scriptable, scriptable2, objArr);
            case 96:
                return _c_anonymous_96(this, context, scriptable, scriptable2, objArr);
            case 97:
                return _c_anonymous_97(this, context, scriptable, scriptable2, objArr);
            case 98:
                return _c_anonymous_98(this, context, scriptable, scriptable2, objArr);
            case 99:
                return _c_anonymous_99(this, context, scriptable, scriptable2, objArr);
            case 100:
                return _c_anonymous_100(this, context, scriptable, scriptable2, objArr);
            case 101:
                return _c_anonymous_101(this, context, scriptable, scriptable2, objArr);
            case 102:
                return _c_anonymous_102(this, context, scriptable, scriptable2, objArr);
            case 103:
                return _c_anonymous_103(this, context, scriptable, scriptable2, objArr);
            case 104:
                return _c_anonymous_104(this, context, scriptable, scriptable2, objArr);
            case 105:
                return _c_anonymous_105(this, context, scriptable, scriptable2, objArr);
            case 106:
                return _c_anonymous_106(this, context, scriptable, scriptable2, objArr);
            case 107:
                return _c_anonymous_107(this, context, scriptable, scriptable2, objArr);
            case 108:
                return _c_timeSum_108(this, context, scriptable, scriptable2, objArr);
            case 109:
                return _c_anonymous_109(this, context, scriptable, scriptable2, objArr);
            case 110:
                return _c_m1_110(this, context, scriptable, scriptable2, objArr);
            case 111:
                return _c_m2_111(this, context, scriptable, scriptable2, objArr);
            case 112:
                return _c_m3_112(this, context, scriptable, scriptable2, objArr);
            case 113:
                return _c_m4_113(this, context, scriptable, scriptable2, objArr);
            case 114:
                return _c_m5_114(this, context, scriptable, scriptable2, objArr);
            case 115:
                return _c_m6_115(this, context, scriptable, scriptable2, objArr);
            case 116:
                return _c_m7_116(this, context, scriptable, scriptable2, objArr);
            case 117:
                return _c_m8_117(this, context, scriptable, scriptable2, objArr);
            case 118:
                return _c_m9_118(this, context, scriptable, scriptable2, objArr);
            case 119:
                return _c_m10_119(this, context, scriptable, scriptable2, objArr);
            case 120:
                return _c_m11_120(this, context, scriptable, scriptable2, objArr);
            case 121:
                return _c_m12_121(this, context, scriptable, scriptable2, objArr);
            case 122:
                return _c_m13_122(this, context, scriptable, scriptable2, objArr);
            case 123:
                return _c_m14_123(this, context, scriptable, scriptable2, objArr);
            case 124:
                return _c_m15_124(this, context, scriptable, scriptable2, objArr);
            case 125:
                return _c_m16_125(this, context, scriptable, scriptable2, objArr);
            case 126:
                return _c_m17_126(this, context, scriptable, scriptable2, objArr);
            case 127:
                return _c_m18_127(this, context, scriptable, scriptable2, objArr);
            case 128:
                return _c_m19_128(this, context, scriptable, scriptable2, objArr);
            case 129:
                return _c_m20_129(this, context, scriptable, scriptable2, objArr);
            case 130:
                return _c_ran_130(this, context, scriptable, scriptable2, objArr);
            case 131:
                return _c_c4_131(this, context, scriptable, scriptable2, objArr);
            case 132:
                return _c_d4_132(this, context, scriptable, scriptable2, objArr);
            case 133:
                return _c_e4_133(this, context, scriptable, scriptable2, objArr);
            case 134:
                return _c_f4_134(this, context, scriptable, scriptable2, objArr);
            case 135:
                return _c_g4_135(this, context, scriptable, scriptable2, objArr);
            case 136:
                return _c_a4_136(this, context, scriptable, scriptable2, objArr);
            case 137:
                return _c_b4_137(this, context, scriptable, scriptable2, objArr);
            case 138:
                return _c_c5_138(this, context, scriptable, scriptable2, objArr);
            case 139:
                return _c_d5_139(this, context, scriptable, scriptable2, objArr);
            case 140:
                return _c_e5_140(this, context, scriptable, scriptable2, objArr);
            case 141:
                return _c_f5_141(this, context, scriptable, scriptable2, objArr);
            case 142:
                return _c_g5_142(this, context, scriptable, scriptable2, objArr);
            case 143:
                return _c_a5_143(this, context, scriptable, scriptable2, objArr);
            case 144:
                return _c_b5_144(this, context, scriptable, scriptable2, objArr);
            case 145:
                return _c_c6_145(this, context, scriptable, scriptable2, objArr);
            case 146:
                return _c_t1_146(this, context, scriptable, scriptable2, objArr);
            case 147:
                return _c_t2_147(this, context, scriptable, scriptable2, objArr);
            case 148:
                return _c_t3_148(this, context, scriptable, scriptable2, objArr);
            case 149:
                return _c_t4_149(this, context, scriptable, scriptable2, objArr);
            case 150:
                return _c_t5_150(this, context, scriptable, scriptable2, objArr);
            case 151:
                return m21_c__151(this, context, scriptable, scriptable2, objArr);
            case 152:
                return _c_anonymous_152(this, context, scriptable, scriptable2, objArr);
            case 153:
                return _c_anonymous_153(this, context, scriptable, scriptable2, objArr);
            case 154:
                return _c_anonymous_154(this, context, scriptable, scriptable2, objArr);
            case 155:
                return _c_anonymous_155(this, context, scriptable, scriptable2, objArr);
            case 156:
                return _c_anonymous_156(this, context, scriptable, scriptable2, objArr);
            case 157:
                return _c_jiazaitongzhiannouncement_157(this, context, scriptable, scriptable2, objArr);
            case 158:
                return _c_anonymous_158(this, context, scriptable, scriptable2, objArr);
            case 159:
                return _c_anonymous_159(this, context, scriptable, scriptable2, objArr);
            case 160:
                return _c_jiazaitongzhiInstructions_160(this, context, scriptable, scriptable2, objArr);
            case 161:
                return _c_anonymous_161(this, context, scriptable, scriptable2, objArr);
            case 162:
                return _c_anonymous_162(this, context, scriptable, scriptable2, objArr);
            case 163:
                return _c_jiazaitongzhiguangyupeiwan_163(this, context, scriptable, scriptable2, objArr);
            case 164:
                return _c_anonymous_164(this, context, scriptable, scriptable2, objArr);
            case 165:
                return _c_anonymous_165(this, context, scriptable, scriptable2, objArr);
            case 166:
                return _c_jiazaitongzhiguangyufuli_166(this, context, scriptable, scriptable2, objArr);
            case 167:
                return _c_anonymous_167(this, context, scriptable, scriptable2, objArr);
            case 168:
                return _c_anonymous_168(this, context, scriptable, scriptable2, objArr);
            case 169:
                return _c_jiazaijinrishuliang_169(this, context, scriptable, scriptable2, objArr);
            case 170:
                return _c_anonymous_170(this, context, scriptable, scriptable2, objArr);
            case 171:
                return _c_anonymous_171(this, context, scriptable, scriptable2, objArr);
            case 172:
                return _c_jiazaizongshuliang_172(this, context, scriptable, scriptable2, objArr);
            case 173:
                return _c_anonymous_173(this, context, scriptable, scriptable2, objArr);
            case 174:
                return _c_anonymous_174(this, context, scriptable, scriptable2, objArr);
            case 175:
                return _c_jiazaigonggaogengxintankuang_175(this, context, scriptable, scriptable2, objArr);
            case 176:
                return _c_anonymous_176(this, context, scriptable, scriptable2, objArr);
            case 177:
                return _c_anonymous_177(this, context, scriptable, scriptable2, objArr);
            case 178:
                return _c_anonymous_178(this, context, scriptable, scriptable2, objArr);
            case 179:
                return m26_c__179(this, context, scriptable, scriptable2, objArr);
            case 180:
                return _c_anonymous_180(this, context, scriptable, scriptable2, objArr);
            case 181:
                return m27_c__181(this, context, scriptable, scriptable2, objArr);
            case 182:
                return _c_anonymous_182(this, context, scriptable, scriptable2, objArr);
            case 183:
                return m10_c__183(this, context, scriptable, scriptable2, objArr);
            case 184:
                return _c_anonymous_184(this, context, scriptable, scriptable2, objArr);
            case 185:
                return m23_c__185(this, context, scriptable, scriptable2, objArr);
            case 186:
                return _c_anonymous_186(this, context, scriptable, scriptable2, objArr);
            case 187:
                return _c_toCode_187(this, context, scriptable, scriptable2, objArr.length > 0 ? objArr[0] : Undefined.instance, 0.0d, objArr);
            case 188:
                return _c_fromCode_188(this, context, scriptable, scriptable2, objArr);
            case 189:
                return _c_activation_189(this, context, scriptable, scriptable2, objArr);
            case 190:
                return _c_anonymous_190(this, context, scriptable, scriptable2, objArr);
            case 191:
                return _c_md5_191(this, context, scriptable, scriptable2, objArr.length > 0 ? objArr[0] : Undefined.instance, 0.0d, objArr);
            default:
                return _c_script_0(this, context, scriptable, scriptable2, objArr);
        }
    }

    public final Object exec(Context context, Scriptable scriptable) {
        return call(context, scriptable, scriptable, null);
    }

    public String getFunctionName() {
        switch (this._id) {
            case 1:
                return "toCode";
            case 2:
                return "fromCode";
            case 3:
                return "";
            case 4:
                return "";
            case 5:
                return "";
            case 6:
                return "";
            case 7:
                return "";
            case 8:
                return "";
            case 9:
                return "";
            case 10:
                return "";
            case 11:
                return "";
            case 12:
                return "";
            case 13:
                return "";
            case 14:
                return "md5";
            case 15:
                return "";
            case 16:
                return "";
            case 17:
                return "";
            case 18:
                return "";
            case 19:
                return "";
            case 20:
                return "";
            case 21:
                return "";
            case 22:
                return "";
            case 23:
                return "";
            case 24:
                return "";
            case 25:
                return "";
            case 26:
                return "";
            case 27:
                return "";
            case 28:
                return "";
            case 29:
                return "initFloatWin";
            case 30:
                return "";
            case 31:
                return "";
            case 32:
                return "";
            case 33:
                return "";
            case 34:
                return "";
            case 35:
                return "";
            case 36:
                return "";
            case 37:
                return "";
            case 38:
                return "";
            case 39:
                return "";
            case 40:
                return "";
            case 41:
                return "";
            case 42:
                return "";
            case 43:
                return "";
            case 44:
                return "功能列表";
            case 45:
                return "想被圈就点";
            case 46:
                return "";
            case 47:
                return "";
            case 48:
                return "我的收藏";
            case 49:
                return "";
            case 50:
                return "";
            case 51:
                return "";
            case 52:
                return "管理收藏";
            case 53:
                return "";
            case 54:
                return "选择新音乐进行收藏";
            case 55:
                return "";
            case 56:
                return "保存喜欢音乐本地化";
            case 57:
                return "";
            case 58:
                return "执行本地喜欢中转";
            case 59:
                return "别他妈瞎点";
            case 60:
                return "";
            case 61:
                return "别他妈瞎点";
            case 62:
                return "";
            case 63:
                return "别他妈瞎点";
            case 64:
                return "";
            case 65:
                return "播放别他妈瞎点";
            case 66:
                return "";
            case 67:
                return "设置键位";
            case 68:
                return "";
            case 69:
                return "";
            case 70:
                return "录入键位坐标";
            case 71:
                return "";
            case 72:
                return "";
            case 73:
                return "记录坐标";
            case 74:
                return "";
            case 75:
                return "云端音乐搜索";
            case 76:
                return "";
            case 77:
                return "播放云端音乐搜索";
            case 78:
                return "";
            case 79:
                return "云端音乐";
            case 80:
                return "";
            case 81:
                return "执行本地中转";
            case 82:
                return "执行开始中转";
            case 83:
                return "";
            case 84:
                return "执行云端音乐循环中转";
            case 85:
                return "";
            case 86:
                return "执行收藏音乐循环中转";
            case 87:
                return "加载悬浮框";
            case 88:
                return "";
            case 89:
                return "";
            case 90:
                return "";
            case 91:
                return "";
            case 92:
                return "";
            case 93:
                return "";
            case 94:
                return "";
            case 95:
                return "";
            case 96:
                return "";
            case 97:
                return "";
            case 98:
                return "";
            case 99:
                return "";
            case 100:
                return "";
            case 101:
                return "";
            case 102:
                return "";
            case 103:
                return "";
            case 104:
                return "";
            case 105:
                return "";
            case 106:
                return "";
            case 107:
                return "";
            case 108:
                return "timeSum";
            case 109:
                return "";
            case 110:
                return "m1";
            case 111:
                return "m2";
            case 112:
                return "m3";
            case 113:
                return "m4";
            case 114:
                return "m5";
            case 115:
                return "m6";
            case 116:
                return "m7";
            case 117:
                return "m8";
            case 118:
                return "m9";
            case 119:
                return "m10";
            case 120:
                return "m11";
            case 121:
                return "m12";
            case 122:
                return "m13";
            case 123:
                return "m14";
            case 124:
                return "m15";
            case 125:
                return "m16";
            case 126:
                return "m17";
            case 127:
                return "m18";
            case 128:
                return "m19";
            case 129:
                return "m20";
            case 130:
                return "ran";
            case 131:
                return "c4";
            case 132:
                return "d4";
            case 133:
                return "e4";
            case 134:
                return "f4";
            case 135:
                return "g4";
            case 136:
                return "a4";
            case 137:
                return "b4";
            case 138:
                return "c5";
            case 139:
                return "d5";
            case 140:
                return "e5";
            case 141:
                return "f5";
            case 142:
                return "g5";
            case 143:
                return "a5";
            case 144:
                return "b5";
            case 145:
                return "c6";
            case 146:
                return "t1";
            case 147:
                return "t2";
            case 148:
                return "t3";
            case 149:
                return "t4";
            case 150:
                return "t5";
            case 151:
                return "更新控制台信息";
            case 152:
                return "";
            case 153:
                return "";
            case 154:
                return "";
            case 155:
                return "";
            case 156:
                return "";
            case 157:
                return "jiazaitongzhiannouncement";
            case 158:
                return "";
            case 159:
                return "";
            case 160:
                return "jiazaitongzhiInstructions";
            case 161:
                return "";
            case 162:
                return "";
            case 163:
                return "jiazaitongzhiguangyupeiwan";
            case 164:
                return "";
            case 165:
                return "";
            case 166:
                return "jiazaitongzhiguangyufuli";
            case 167:
                return "";
            case 168:
                return "";
            case 169:
                return "jiazaijinrishuliang";
            case 170:
                return "";
            case 171:
                return "";
            case 172:
                return "jiazaizongshuliang";
            case 173:
                return "";
            case 174:
                return "";
            case 175:
                return "jiazaigonggaogengxintankuang";
            case 176:
                return "";
            case 177:
                return "";
            case 178:
                return "";
            case 179:
                return "远程保存音乐列表";
            case 180:
                return "";
            case 181:
                return "远程保存音乐列表名称";
            case 182:
                return "";
            case 183:
                return "加载加群信息";
            case 184:
                return "";
            case 185:
                return "自检";
            case 186:
                return "";
            case 187:
                return "toCode";
            case 188:
                return "fromCode";
            case 189:
                return "activation";
            case 190:
                return "";
            case 191:
                return "md5";
            default:
                return "";
        }
    }

    public int getLanguageVersion() {
        return 200;
    }

    public int getParamAndVarCount() {
        switch (this._id) {
            case 1:
                return 10;
            case 2:
                return 10;
            case 3:
            case 14:
            case 19:
            case 20:
            case 21:
            case 33:
            case 41:
            case 42:
            case 44:
            case 60:
            case 82:
            case 84:
            case 191:
                return 1;
            case 4:
                return 0;
            case 5:
                return 4;
            case 6:
                return 7;
            case 7:
                return 5;
            case 8:
                return 2;
            case 9:
                return 7;
            case 10:
                return 11;
            case 11:
                return 17;
            case 12:
                return 2;
            case 13:
                return 0;
            case 15:
                return 0;
            case 16:
                return 0;
            case 17:
                return 0;
            case 18:
                return 0;
            case 22:
                return 0;
            case 23:
                return 0;
            case 24:
                return 0;
            case 25:
                return 0;
            case 26:
                return 0;
            case 27:
                return 0;
            case 28:
                return 0;
            case 29:
                return 6;
            case 30:
                return 0;
            case 31:
                return 0;
            case 32:
                return 0;
            case 34:
                return 4;
            case 35:
                return 0;
            case 36:
                return 0;
            case 37:
                return 6;
            case 38:
                return 3;
            case 39:
                return 2;
            case 40:
                return 11;
            case 43:
                return 0;
            case 45:
                return 0;
            case 46:
                return 3;
            case 47:
                return 4;
            case 48:
                return 2;
            case 49:
                return 3;
            case 50:
                return 0;
            case 51:
                return 0;
            case 52:
                return 0;
            case 53:
                return 6;
            case 54:
                return 0;
            case 55:
                return 4;
            case 56:
                return 8;
            case 57:
                return 5;
            case 58:
                return 4;
            case 59:
                return 0;
            case 61:
                return 0;
            case 62:
                return 4;
            case 63:
                return 0;
            case 64:
                return 3;
            case 65:
                return 0;
            case 66:
                return 3;
            case 67:
                return 0;
            case 68:
                return 0;
            case 69:
                return 0;
            case 70:
                return 3;
            case 71:
                return 0;
            case 72:
                return 2;
            case 73:
                return 3;
            case 74:
                return 0;
            case 75:
                return 0;
            case 76:
                return 5;
            case 77:
                return 0;
            case 78:
                return 3;
            case 79:
                return 0;
            case 80:
                return 3;
            case 81:
                return 3;
            case 83:
                return 5;
            case 85:
                return 5;
            case 86:
                return 5;
            case 87:
                return 65;
            case 88:
                return 0;
            case 89:
                return 3;
            case 90:
                return 0;
            case 91:
                return 0;
            case 92:
                return 0;
            case 93:
                return 0;
            case 94:
                return 0;
            case 95:
                return 0;
            case 96:
                return 0;
            case 97:
                return 0;
            case 98:
                return 0;
            case 99:
                return 0;
            case 100:
                return 0;
            case 101:
                return 0;
            case 102:
                return 0;
            case 103:
                return 0;
            case 104:
                return 0;
            case 105:
                return 0;
            case 106:
                return 0;
            case 107:
                return 0;
            case 108:
                return 6;
            case 109:
                return 2;
            case 110:
                return 0;
            case 111:
                return 0;
            case 112:
                return 0;
            case 113:
                return 0;
            case 114:
                return 0;
            case 115:
                return 0;
            case 116:
                return 0;
            case 117:
                return 0;
            case 118:
                return 0;
            case 119:
                return 0;
            case 120:
                return 0;
            case 121:
                return 0;
            case 122:
                return 0;
            case 123:
                return 0;
            case 124:
                return 0;
            case 125:
                return 0;
            case 126:
                return 0;
            case 127:
                return 0;
            case 128:
                return 0;
            case 129:
                return 0;
            case 130:
                return 0;
            case 131:
                return 0;
            case 132:
                return 0;
            case 133:
                return 0;
            case 134:
                return 0;
            case 135:
                return 0;
            case 136:
                return 0;
            case 137:
                return 0;
            case 138:
                return 0;
            case 139:
                return 0;
            case 140:
                return 0;
            case 141:
                return 0;
            case 142:
                return 0;
            case 143:
                return 0;
            case 144:
                return 0;
            case 145:
                return 0;
            case 146:
                return 0;
            case 147:
                return 0;
            case 148:
                return 0;
            case 149:
                return 0;
            case 150:
                return 0;
            case 151:
                return 0;
            case 152:
                return 0;
            case 153:
                return 2;
            case 154:
                return 0;
            case 155:
                return 0;
            case 156:
                return 0;
            case 157:
                return 0;
            case 158:
                return 3;
            case 159:
                return 0;
            case 160:
                return 0;
            case 161:
                return 3;
            case 162:
                return 0;
            case 163:
                return 0;
            case 164:
                return 3;
            case 165:
                return 0;
            case 166:
                return 0;
            case 167:
                return 3;
            case 168:
                return 0;
            case 169:
                return 0;
            case 170:
                return 3;
            case 171:
                return 0;
            case 172:
                return 0;
            case 173:
                return 3;
            case 174:
                return 0;
            case 175:
                return 0;
            case 176:
                return 10;
            case 177:
                return 0;
            case 178:
                return 0;
            case 179:
                return 0;
            case 180:
                return 5;
            case 181:
                return 0;
            case 182:
                return 4;
            case 183:
                return 0;
            case 184:
                return 3;
            case 185:
                return 0;
            case 186:
                return 4;
            case 187:
                return 10;
            case 188:
                return 10;
            case 189:
                return 4;
            case 190:
                return 2;
            default:
                return 50;
        }
    }

    public int getParamCount() {
        switch (this._id) {
            case 1:
                return 1;
            case 2:
                return 1;
            case 3:
                return 1;
            case 4:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 35:
            case 36:
            case 39:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 48:
            case 50:
            case 51:
            case 52:
            case 54:
            case 59:
            case 61:
            case 63:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 74:
            case 75:
            case 77:
            case 79:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 154:
            case 155:
            case 156:
            case 157:
            case 159:
            case 160:
            case 162:
            case 163:
            case 165:
            case 166:
            case 168:
            case 169:
            case 171:
            case 172:
            case 174:
            case 175:
            case 177:
            case 178:
            case 179:
            case 181:
            case 183:
            case 185:
            default:
                return 0;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 2;
            case 9:
                return 1;
            case 10:
                return 2;
            case 12:
                return 1;
            case 14:
                return 1;
            case 19:
                return 1;
            case 20:
                return 1;
            case 21:
                return 1;
            case 34:
                return 2;
            case 37:
                return 2;
            case 38:
                return 3;
            case 40:
                return 3;
            case 46:
                return 2;
            case 47:
                return 3;
            case 49:
                return 3;
            case 53:
                return 2;
            case 55:
                return 3;
            case 56:
                return 4;
            case 57:
                return 2;
            case 58:
                return 2;
            case 60:
                return 1;
            case 62:
                return 1;
            case 64:
                return 3;
            case 66:
                return 3;
            case 72:
                return 2;
            case 73:
                return 3;
            case 76:
                return 1;
            case 78:
                return 3;
            case 80:
                return 3;
            case 81:
                return 1;
            case 82:
                return 1;
            case 83:
                return 2;
            case 84:
                return 1;
            case 85:
                return 2;
            case 86:
                return 2;
            case 108:
                return 1;
            case 109:
                return 2;
            case 153:
                return 2;
            case 158:
                return 2;
            case 161:
                return 2;
            case 164:
                return 2;
            case 167:
                return 2;
            case 170:
                return 2;
            case 173:
                return 2;
            case 176:
                return 2;
            case 180:
                return 2;
            case 182:
                return 2;
            case 184:
                return 2;
            case 186:
                return 2;
            case 187:
                return 1;
            case 188:
                return 1;
            case 189:
                return 2;
            case 190:
                return 2;
            case 191:
                return 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        return false;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0022. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0026. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x002a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x002e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0032. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0036. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x003a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x003e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0042. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0046. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x004a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x004e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0052. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0056. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x005a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x005e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0062. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0066. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x006a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x006e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0072. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0076. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x007a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x007e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0082. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0086. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x008a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x008f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x0094. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x0099. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x00a3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00a8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x00ad. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00b2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00b7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x00bc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x00c1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x00c6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x00cb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x00d0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00d5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x00da. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x00df. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x00e4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x00e9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00ee. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x00f3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x00f8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x00fd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x0102. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0107. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x000e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0012. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0016. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean getParamOrVarConst(int r3) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.autojs.autojspro.gen._7a9076d6d94e62c13d641aa71f19ae8e.getParamOrVarConst(int):boolean");
    }

    public String getParamOrVarName(int i) {
        switch (this._id) {
            case 1:
                switch (i) {
                    case 1:
                        return "key";
                    case 2:
                        return "w";
                    case 3:
                        return "a";
                    case 4:
                        return "s";
                    case 5:
                        return "b";
                    case 6:
                        return "b1";
                    case 7:
                        return "b2";
                    case 8:
                        return "b3";
                    case 9:
                        return "i";
                    default:
                        return "str";
                }
            case 2:
                switch (i) {
                    case 1:
                        return "key";
                    case 2:
                        return "w";
                    case 3:
                        return "b";
                    case 4:
                        return "b1";
                    case 5:
                        return "b2";
                    case 6:
                        return "b3";
                    case 7:
                        return "d";
                    case 8:
                        return "s";
                    case 9:
                        return "i";
                    default:
                        return "str";
                }
            case 3:
                return "e";
            case 4:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
            case 31:
            case 32:
            case 35:
            case 36:
            case 43:
            case 45:
            case 50:
            case 51:
            case 52:
            case 54:
            case 59:
            case 61:
            case 63:
            case 65:
            case 67:
            case 68:
            case 69:
            case 71:
            case 74:
            case 75:
            case 77:
            case 79:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 154:
            case 155:
            case 156:
            case 157:
            case 159:
            case 160:
            case 162:
            case 163:
            case 165:
            case 166:
            case 168:
            case 169:
            case 171:
            case 172:
            case 174:
            case 175:
            case 177:
            case 178:
            case 179:
            case 181:
            case 183:
            case 185:
                return null;
            case 5:
                switch (i) {
                    case 1:
                        return "_0x4d2989";
                    case 2:
                        return "_0x1afbf2";
                    case 3:
                        return "_0x4f555f";
                    default:
                        return "_0x138d0d";
                }
            case 6:
                switch (i) {
                    case 1:
                        return "_0x4e0e43";
                    case 2:
                        return "_0x255df0";
                    case 3:
                        return "_0xd04504";
                    case 4:
                        return "_0x10ba18";
                    case 5:
                        return "_0x2729d";
                    case 6:
                        return "_0x2b449e";
                    default:
                        return "_0x419b76";
                }
            case 7:
                switch (i) {
                    case 1:
                        return "_0x1ff45b";
                    case 2:
                        return "_0x28c3f7";
                    case 3:
                        return "_0x3d5182";
                    case 4:
                        return "_0x3fb4d4";
                    default:
                        return "_0x22a3f2";
                }
            case 8:
                switch (i) {
                    case 1:
                        return "_0x5933be";
                    default:
                        return "_0x22fcd1";
                }
            case 9:
                switch (i) {
                    case 1:
                        return "_0x16a7dd";
                    case 2:
                        return "_0x2149f8";
                    case 3:
                        return "_0x2f9690";
                    case 4:
                        return "_0x5ae1e7";
                    case 5:
                        return "_0x5be216";
                    case 6:
                        return "_0x25bed1";
                    default:
                        return "_0x3e27e3";
                }
            case 10:
                switch (i) {
                    case 1:
                        return "_0x1ff45b";
                    case 2:
                        return "_0x3be607";
                    case 3:
                        return "_0x4d9a2e";
                    case 4:
                        return "_0x5d835f";
                    case 5:
                        return "_0x23d13f";
                    case 6:
                        return "_0x4cdb5f";
                    case 7:
                        return "_0x446f79";
                    case 8:
                        return "_0x29d4bd";
                    case 9:
                        return "_0x7e6807";
                    case 10:
                        return "_0x4908f2";
                    default:
                        return "_0xb9c0d7";
                }
            case 11:
                switch (i) {
                    case 1:
                        return "安卓版本";
                    case 2:
                        return "安卓型号";
                    case 3:
                        return "系统版本";
                    case 4:
                        return "设备ID";
                    case 5:
                        return "arr";
                    case 6:
                        return "ooo";
                    case 7:
                        return "aaa";
                    case 8:
                        return "ccc";
                    case 9:
                        return "ddd";
                    case 10:
                        return "Tccfkxcdz";
                    case 11:
                        return "Tccffkkdz";
                    case 12:
                        return "res";
                    case 13:
                        return "neirong";
                    case 14:
                        return "提取时间";
                    case 15:
                        return "text";
                    case 16:
                        return "md5";
                    default:
                        return "安卓ID";
                }
            case 12:
                switch (i) {
                    case 1:
                        return "age";
                    default:
                        return "input";
                }
            case 14:
                return "string";
            case 19:
                return "checked";
            case 20:
                return "ischecked";
            case 21:
                return "ischecked";
            case 29:
                switch (i) {
                    case 1:
                        return "y";
                    case 2:
                        return "ar";
                    case 3:
                        return "downTime";
                    case 4:
                        return "windowWidth";
                    case 5:
                        return "windowHeight";
                    default:
                        return "x";
                }
            case 33:
                return "xy";
            case 34:
                switch (i) {
                    case 1:
                        return "event";
                    case 2:
                        return "sx";
                    case 3:
                        return "sy";
                    default:
                        return "view";
                }
            case 37:
                switch (i) {
                    case 1:
                        return "view";
                    case 2:
                        return "K";
                    case 3:
                        return "H";
                    case 4:
                        return "D";
                    case 5:
                        return "ary";
                    default:
                        return "win";
                }
            case 38:
                switch (i) {
                    case 1:
                        return "y";
                    case 2:
                        return "k";
                    default:
                        return "x";
                }
            case 39:
                switch (i) {
                    case 1:
                        return "i";
                    default:
                        return "num";
                }
            case 40:
                switch (i) {
                    case 1:
                        return "s";
                    case 2:
                        return "w";
                    case 3:
                        return "sx";
                    case 4:
                        return "sy";
                    case 5:
                        return "sd";
                    case 6:
                        return "X";
                    case 7:
                        return "Y";
                    case 8:
                        return "x";
                    case 9:
                        return "y";
                    case 10:
                        return "i";
                    default:
                        return "A";
                }
            case 41:
                return "A";
            case 42:
                return "A";
            case 44:
                return "ppll";
            case 46:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    default:
                        return "res";
                }
            case 47:
                switch (i) {
                    case 1:
                        return "item";
                    case 2:
                        return "dialog";
                    case 3:
                        return "ggg";
                    default:
                        return "index";
                }
            case 48:
                switch (i) {
                    case 1:
                        return "返回喜欢ID";
                    default:
                        return "返回喜欢的内容";
                }
            case 49:
                switch (i) {
                    case 1:
                        return "item";
                    case 2:
                        return "dialog";
                    default:
                        return "index";
                }
            case 53:
                switch (i) {
                    case 1:
                        return "items";
                    case 2:
                        return "i";
                    case 3:
                        return "str";
                    case 4:
                        return "index";
                    case 5:
                        return "关键词";
                    default:
                        return "indices";
                }
            case 55:
                switch (i) {
                    case 1:
                        return "items";
                    case 2:
                        return "dialog";
                    case 3:
                        return "i";
                    default:
                        return "indices";
                }
            case 56:
                switch (i) {
                    case 1:
                        return "是否赠送";
                    case 2:
                        return "音乐内容";
                    case 3:
                        return "音乐名称";
                    case 4:
                        return "nusicname";
                    case 5:
                        return "neirong";
                    case 6:
                        return "返回收藏的ID";
                    case 7:
                        return "返回收藏的列表";
                    default:
                        return "音乐编号";
                }
            case 57:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    case 3:
                        return "返回收藏的ID";
                    case 4:
                        return "返回收藏的列表";
                    default:
                        return "res";
                }
            case 58:
                switch (i) {
                    case 1:
                        return "音乐昵称";
                    case 2:
                        return "位置文件";
                    case 3:
                        return "neirong";
                    default:
                        return "音乐编号";
                }
            case 60:
                return "name";
            case 62:
                switch (i) {
                    case 1:
                        return "index";
                    case 2:
                        return "被搜索词";
                    case 3:
                        return "index";
                    default:
                        return "name";
                }
            case 64:
                switch (i) {
                    case 1:
                        return "item";
                    case 2:
                        return "dialog";
                    default:
                        return "index";
                }
            case 66:
                switch (i) {
                    case 1:
                        return "item";
                    case 2:
                        return "dialog";
                    default:
                        return "index";
                }
            case 70:
                switch (i) {
                    case 1:
                        return "y_start";
                    case 2:
                        return "time";
                    default:
                        return "x_start";
                }
            case 72:
                switch (i) {
                    case 1:
                        return "event";
                    default:
                        return "view";
                }
            case 73:
                switch (i) {
                    case 1:
                        return "downX";
                    case 2:
                        return "downY";
                    default:
                        return "key";
                }
            case 76:
                switch (i) {
                    case 1:
                        return "index";
                    case 2:
                        return "被搜索词";
                    case 3:
                        return "index";
                    case 4:
                        return "编号";
                    default:
                        return "name";
                }
            case 78:
                switch (i) {
                    case 1:
                        return "item";
                    case 2:
                        return "dialog";
                    default:
                        return "index";
                }
            case 80:
                switch (i) {
                    case 1:
                        return "item";
                    case 2:
                        return "dialog";
                    default:
                        return "index";
                }
            case 81:
                switch (i) {
                    case 1:
                        return "位置文件";
                    case 2:
                        return "neirong";
                    default:
                        return "音乐编号";
                }
            case 82:
                return "音乐编号";
            case 83:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    case 3:
                        return "pp";
                    case 4:
                        return "ooo";
                    default:
                        return "res";
                }
            case 84:
                return "音乐编号";
            case 85:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    case 3:
                        return "pp";
                    case 4:
                        return "返回数组";
                    default:
                        return "res";
                }
            case 86:
                switch (i) {
                    case 1:
                        return "音乐昵称";
                    case 2:
                        return "位置文件";
                    case 3:
                        return "neirong";
                    case 4:
                        return "返回数组";
                    default:
                        return "音乐编号";
                }
            case 87:
                switch (i) {
                    case 1:
                        return "window1";
                    case 2:
                        return "x0";
                    case 3:
                        return "y0";
                    case 4:
                        return "bili";
                    case 5:
                        return "timeSum";
                    case 6:
                        return "progressNow";
                    case 7:
                        return "s";
                    case 8:
                        return "speedControl";
                    case 9:
                        return "time";
                    case 10:
                        return "time1";
                    case 11:
                        return "time2";
                    case 12:
                        return "zuobiaoPath";
                    case 13:
                        return "zuobiaoPathX";
                    case 14:
                        return "zuobiaoPathY";
                    case 15:
                        return "x";
                    case 16:
                        return "y";
                    case 17:
                        return "按压时间";
                    case 18:
                        return "m1";
                    case 19:
                        return "m2";
                    case 20:
                        return "m3";
                    case 21:
                        return "m4";
                    case 22:
                        return "m5";
                    case 23:
                        return "m6";
                    case 24:
                        return "m7";
                    case 25:
                        return "m8";
                    case 26:
                        return "m9";
                    case 27:
                        return "m10";
                    case 28:
                        return "m11";
                    case 29:
                        return "m12";
                    case 30:
                        return "m13";
                    case 31:
                        return "m14";
                    case 32:
                        return "m15";
                    case 33:
                        return "m16";
                    case 34:
                        return "m17";
                    case 35:
                        return "m18";
                    case 36:
                        return "m19";
                    case 37:
                        return "m20";
                    case 38:
                        return "ran";
                    case 39:
                        return "c4";
                    case 40:
                        return "d4";
                    case 41:
                        return "e4";
                    case 42:
                        return "f4";
                    case 43:
                        return "g4";
                    case 44:
                        return "a4";
                    case 45:
                        return "b4";
                    case 46:
                        return "c5";
                    case 47:
                        return "d5";
                    case 48:
                        return "e5";
                    case 49:
                        return "f5";
                    case 50:
                        return "g5";
                    case 51:
                        return "a5";
                    case 52:
                        return "b5";
                    case 53:
                        return "c6";
                    case 54:
                        return "t1";
                    case 55:
                        return "t2";
                    case 56:
                        return "t3";
                    case 57:
                        return "t4";
                    case 58:
                        return "t5";
                    case 59:
                        return "更新控制台信息";
                    case 60:
                        return "i";
                    case 61:
                        return "返回收藏的ID";
                    case 62:
                        return "下次的ID";
                    case 63:
                        return "下次编号";
                    case 64:
                        return "本次的ID";
                    default:
                        return "返回数组";
                }
            case 89:
                switch (i) {
                    case 1:
                        return "下次的ID";
                    case 2:
                        return "下次编号";
                    default:
                        return "返回收藏的ID";
                }
            case 108:
                switch (i) {
                    case 1:
                        return "timeTotal";
                    case 2:
                        return "i";
                    case 3:
                        return "minute";
                    case 4:
                        return "second";
                    case 5:
                        return "miaoshu";
                    default:
                        return "p";
                }
            case 109:
                switch (i) {
                    case 1:
                        return "p";
                    default:
                        return "sb";
                }
            case 153:
                switch (i) {
                    case 1:
                        return "p";
                    default:
                        return "sb";
                }
            case 158:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    default:
                        return "res";
                }
            case 161:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    default:
                        return "res";
                }
            case 164:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    default:
                        return "res";
                }
            case 167:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    default:
                        return "res";
                }
            case 170:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    default:
                        return "res";
                }
            case 173:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    default:
                        return "res";
                }
            case 176:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    case 3:
                        return "JSONneirong";
                    case 4:
                        return "Updateversionnumber";
                    case 5:
                        return "Checkforupdates";
                    case 6:
                        return "Updatecontent";
                    case 7:
                        return "Updatelink";
                    case 8:
                        return "Updateannouncement";
                    case 9:
                        return "Updatetheannouncement";
                    default:
                        return "res";
                }
            case 180:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    case 3:
                        return "i";
                    case 4:
                        return "i";
                    default:
                        return "res";
                }
            case 182:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    case 3:
                        return "i";
                    default:
                        return "res";
                }
            case 184:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    default:
                        return "res";
                }
            case 186:
                switch (i) {
                    case 1:
                        return "err";
                    case 2:
                        return "neirong";
                    case 3:
                        return "p";
                    default:
                        return "res";
                }
            case 187:
                switch (i) {
                    case 1:
                        return "key";
                    case 2:
                        return "w";
                    case 3:
                        return "a";
                    case 4:
                        return "s";
                    case 5:
                        return "b";
                    case 6:
                        return "b1";
                    case 7:
                        return "b2";
                    case 8:
                        return "b3";
                    case 9:
                        return "i";
                    default:
                        return "str";
                }
            case 188:
                switch (i) {
                    case 1:
                        return "key";
                    case 2:
                        return "w";
                    case 3:
                        return "b";
                    case 4:
                        return "b1";
                    case 5:
                        return "b2";
                    case 6:
                        return "b3";
                    case 7:
                        return "d";
                    case 8:
                        return "s";
                    case 9:
                        return "i";
                    default:
                        return "str";
                }
            case 189:
                switch (i) {
                    case 1:
                        return "bb";
                    case 2:
                        return "http_";
                    case 3:
                        return "cc";
                    default:
                        return "aa";
                }
            case 190:
                switch (i) {
                    case 1:
                        return "err";
                    default:
                        return "res";
                }
            case 191:
                return "string";
            default:
                switch (i) {
                    case 1:
                        return "fromCode";
                    case 2:
                        return "卡片圆角";
                    case 3:
                        return "卡片小圆角";
                    case 4:
                        return "卡片阴影";
                    case 5:
                        return "卡片大小";
                    case 6:
                        return "卡片内部空隙";
                    case 7:
                        return "卡片一内部空隙";
                    case 8:
                        return "头部颜色";
                    case 9:
                        return "isCanFinish";
                    case 10:
                        return "isCanFinishTimeout";
                    case 11:
                        return "_0xodB";
                    case 12:
                        return "_0x2826";
                    case 13:
                        return "_0x474a";
                    case 14:
                        return "initFloatWin";
                    case 15:
                        return "功能列表";
                    case 16:
                        return "想被圈就点";
                    case 17:
                        return "我的收藏";
                    case 18:
                        return "管理收藏";
                    case 19:
                        return "选择新音乐进行收藏";
                    case 20:
                        return "保存喜欢音乐本地化";
                    case 21:
                        return "执行本地喜欢中转";
                    case 22:
                        return "别他妈瞎点";
                    case 23:
                        return "别他妈瞎点";
                    case 24:
                        return "别他妈瞎点";
                    case 25:
                        return "别他妈瞎点";
                    case 26:
                        return "设置键位";
                    case 27:
                        return "录入键位坐标";
                    case 28:
                        return "记录坐标";
                    case 29:
                        return "云端音乐搜索";
                    case 30:
                        return "播放云端音乐搜索";
                    case 31:
                        return "云端音乐";
                    case 32:
                        return "执行本地中转";
                    case 33:
                        return "执行开始中转";
                    case 34:
                        return "执行云端音乐循环中转";
                    case 35:
                        return "执行收藏音乐循环中转";
                    case 36:
                        return "加载悬浮框";
                    case 37:
                        return "jiazaitongzhiannouncement";
                    case 38:
                        return "jiazaitongzhiInstructions";
                    case 39:
                        return "jiazaitongzhiguangyupeiwan";
                    case 40:
                        return "jiazaitongzhiguangyufuli";
                    case 41:
                        return "jiazaijinrishuliang";
                    case 42:
                        return "jiazaizongshuliang";
                    case 43:
                        return "jiazaigonggaogengxintankuang";
                    case 44:
                        return "远程保存音乐列表";
                    case 45:
                        return "远程保存音乐列表名称";
                    case 46:
                        return "加载加群信息";
                    case 47:
                        return "自检";
                    case 48:
                        return "activation";
                    case 49:
                        return "md5";
                    default:
                        return "toCode";
                }
        }
    }

    private static Object _c_toCode_1(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 1) {
            objArr = ScriptRuntime.padArguments(objArr, 1);
        }
        Object str = objArr[0];
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Object w = ScriptRuntime.getObjectProp("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ", "length", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        Object a = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ", "split", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        Object s = "";
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        double i = 0.0d;
        ScriptRuntime.addInstructionCount(context, 138);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (i < ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(str, "length", context, parentScope))) {
                ScriptRuntime.addInstructionCount(context, 1);
                Object b = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(str, "charCodeAt", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.wrapDouble(i), context, parentScope);
                double b1 = ScriptRuntime.toNumber(b) % ScriptRuntime.toNumber(w);
                Object b2 = OptRuntime.wrapDouble((ScriptRuntime.toNumber(b) - b1) / ScriptRuntime.toNumber(w));
                double b22 = ScriptRuntime.toNumber(b2) % ScriptRuntime.toNumber(w);
                double b3 = ScriptRuntime.toNumber(OptRuntime.wrapDouble((ScriptRuntime.toNumber(b2) - b22) / ScriptRuntime.toNumber(w))) % ScriptRuntime.toNumber(w);
                s = ScriptRuntime.add(s, ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.getObjectIndex(a, b3, context), ScriptRuntime.getObjectIndex(a, b22, context), context), ScriptRuntime.getObjectIndex(a, b1, context), context), context);
                ScriptRuntime.addInstructionCount(context, 148);
                i += 1.0d;
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 13);
            } else {
                ScriptRuntime.addInstructionCount(context, 27);
                ScriptRuntime.addInstructionCount(context, 2);
                return s;
            }
        }
    }

    private static Object _c_fromCode_2(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "key"), "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ", context, createFunctionActivation, "key");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "w"), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "key"), "length", context, createFunctionActivation), context, createFunctionActivation, "w");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "d"), OptRuntime.zeroObj, context, createFunctionActivation, "d");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "s"), ScriptRuntime.newObject(ScriptRuntime.name(context, createFunctionActivation, "Array"), context, createFunctionActivation, new Object[]{OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "Math"), "floor", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "str"), "length", context, createFunctionActivation)) / ScriptRuntime.toNumber(_k3)), context, createFunctionActivation)}), context, createFunctionActivation, "s");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "b"), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "s"), "length", context, createFunctionActivation), context, createFunctionActivation, "b");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "i"), OptRuntime.zeroObj, context, createFunctionActivation, "i");
            ScriptRuntime.addInstructionCount(context, 261);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (ScriptRuntime.cmp_LT(ScriptRuntime.name(context, createFunctionActivation, "i"), ScriptRuntime.name(context, createFunctionActivation, "b"))) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "b1"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "key"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "str"), "charAt", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "d"), context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "b1");
                    ScriptRuntime.nameIncrDecr(createFunctionActivation, "d", context, 2);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "b2"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "key"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "str"), "charAt", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "d"), context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "b2");
                    ScriptRuntime.nameIncrDecr(createFunctionActivation, "d", context, 2);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "b3"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "key"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "str"), "charAt", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "d"), context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "b3");
                    ScriptRuntime.nameIncrDecr(createFunctionActivation, "d", context, 2);
                    ScriptRuntime.setObjectElem(ScriptRuntime.name(context, createFunctionActivation, "s"), ScriptRuntime.name(context, createFunctionActivation, "i"), ScriptRuntime.add(ScriptRuntime.add(OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "b1")) * ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "w")) * ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "w"))), OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "b2")) * ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "w"))), context), ScriptRuntime.name(context, createFunctionActivation, "b3"), context), context, createFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 362);
                    ScriptRuntime.nameIncrDecr(createFunctionActivation, "i", context, 2);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 15);
                } else {
                    ScriptRuntime.addInstructionCount(context, 30);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "b"), OptRuntime.callSpecial(context, ScriptRuntime.getNameFunctionAndThis("eval", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.add(ScriptRuntime.add("String.fromCharCode(", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "s"), "join", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ",", context, createFunctionActivation)), ")")}, createFunctionActivation, scriptable2, 1, "", 46), context, createFunctionActivation, "b");
                    Object name = ScriptRuntime.name(context, createFunctionActivation, "b");
                    ScriptRuntime.addInstructionCount(context, 96);
                    return name;
                }
            }
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_3(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createArrowFunctionActivation = ScriptRuntime.createArrowFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createArrowFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 24);
            if (!ScriptRuntime.toBoolean(ScriptRuntime.name(context, createArrowFunctionActivation, "isCanFinish"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "isCanFinish"), Boolean.TRUE, context, createArrowFunctionActivation, "isCanFinish");
                ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "isCanFinishTimeout"), OptRuntime.callName(new Object[]{OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createArrowFunctionActivation, context, 4), context, createArrowFunctionActivation, scriptable2), _k4}, "setTimeout", context, createArrowFunctionActivation), context, createArrowFunctionActivation, "isCanFinishTimeout");
                ScriptRuntime.setObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "e"), "consumed", Boolean.TRUE, context, createArrowFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 146);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createArrowFunctionActivation, "isCanFinishTimeout")}, "clearTimeout", context, createArrowFunctionActivation);
                ScriptRuntime.setObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "e"), "consumed", Boolean.FALSE, context, createArrowFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 49);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 8);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_4(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{"双击退出"}, "toastLog", context, parentScope);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "isCanFinish"), Boolean.FALSE, context, parentScope, "isCanFinish");
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 47);
        return obj;
    }

    private static Object _c_anonymous_10(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 2) {
            objArr = ScriptRuntime.padArguments(objArr, 2);
        }
        Object _0xb9c0d7 = objArr[0];
        Object _0x1ff45b = objArr[1];
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Object _0x3be607 = OptRuntime.newArrayLiteral(ScriptRuntime.emptyArgs, (String) null, 0, context, parentScope);
        Double _0x4d9a2e = OptRuntime.zeroObj;
        Object _0x23d13f = "";
        Object _0x4cdb5f = "";
        Object _0xb9c0d72 = OptRuntime.callName(new Object[]{_0xb9c0d7}, "atob", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Double _0x446f79 = OptRuntime.zeroObj;
        Object _0x29d4bd = ScriptRuntime.getObjectElem(_0xb9c0d72, "length", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 147);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (!ScriptRuntime.cmp_LT(_0x446f79, _0x29d4bd)) {
                break;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            _0x4cdb5f = ScriptRuntime.add(_0x4cdb5f, ScriptRuntime.add("%", OptRuntime.call1(ScriptRuntime.getElemFunctionAndThis(ScriptRuntime.add("00", OptRuntime.call1(ScriptRuntime.getElemFunctionAndThis(OptRuntime.call1(ScriptRuntime.getElemFunctionAndThis(_0xb9c0d72, "charCodeAt", context, parentScope), ScriptRuntime.lastStoredScriptable(context), _0x446f79, context, parentScope), "toString", context, parentScope), ScriptRuntime.lastStoredScriptable(context), _k12, context, parentScope)), "slice", context, parentScope), ScriptRuntime.lastStoredScriptable(context), _k10, context, parentScope)), context);
            ScriptRuntime.addInstructionCount(context, 86);
            double number = ScriptRuntime.toNumber(_0x446f79);
            _0x446f79 = OptRuntime.wrapDouble(1.0d + number);
            OptRuntime.wrapDouble(number);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 22);
        }
        ScriptRuntime.addInstructionCount(context, 18);
        Object _0xb9c0d73 = OptRuntime.callName(new Object[]{_0x4cdb5f}, "decodeURIComponent", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Double _0x7e6807 = OptRuntime.zeroObj;
        ScriptRuntime.addInstructionCount(context, 34);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (!ScriptRuntime.cmp_LT(_0x7e6807, _k13)) {
                break;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setObjectElem(_0x3be607, _0x7e6807, _0x7e6807, context, parentScope);
            ScriptRuntime.addInstructionCount(context, 17);
            double number2 = ScriptRuntime.toNumber(_0x7e6807);
            _0x7e6807 = OptRuntime.wrapDouble(1.0d + number2);
            OptRuntime.wrapDouble(number2);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 22);
        }
        ScriptRuntime.addInstructionCount(context, 19);
        ScriptRuntime.addInstructionCount(context, 1);
        Double _0x7e68072 = OptRuntime.zeroObj;
        ScriptRuntime.addInstructionCount(context, 10);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (!ScriptRuntime.cmp_LT(_0x7e68072, _k13)) {
                break;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            _0x4d9a2e = OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.add(ScriptRuntime.add(_0x4d9a2e, ScriptRuntime.getObjectElem(_0x3be607, _0x7e68072, context, parentScope), context), OptRuntime.call1(ScriptRuntime.getElemFunctionAndThis(_0x1ff45b, "charCodeAt", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.wrapDouble(ScriptRuntime.toNumber(_0x7e68072) % ScriptRuntime.toNumber(ScriptRuntime.getObjectElem(_0x1ff45b, "length", context, parentScope))), context, parentScope), context)) % ScriptRuntime.toNumber(_k13));
            Object _0x5d835f = ScriptRuntime.getObjectElem(_0x3be607, _0x7e68072, context, parentScope);
            ScriptRuntime.setObjectElem(_0x3be607, _0x7e68072, ScriptRuntime.getObjectElem(_0x3be607, _0x4d9a2e, context, parentScope), context, parentScope);
            ScriptRuntime.setObjectElem(_0x3be607, _0x4d9a2e, _0x5d835f, context, parentScope);
            ScriptRuntime.addInstructionCount(context, 122);
            double number3 = ScriptRuntime.toNumber(_0x7e68072);
            _0x7e68072 = OptRuntime.wrapDouble(1.0d + number3);
            OptRuntime.wrapDouble(number3);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 22);
        }
        ScriptRuntime.addInstructionCount(context, 19);
        Double _0x7e68073 = OptRuntime.zeroObj;
        Double _0x4d9a2e2 = OptRuntime.zeroObj;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Double _0x4908f2 = OptRuntime.zeroObj;
        ScriptRuntime.addInstructionCount(context, 25);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (!ScriptRuntime.cmp_LT(_0x4908f2, ScriptRuntime.getObjectElem(_0xb9c0d73, "length", context, parentScope))) {
                ScriptRuntime.addInstructionCount(context, 26);
                ScriptRuntime.addInstructionCount(context, 2);
                return _0x23d13f;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            _0x7e68073 = OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.add(_0x7e68073, OptRuntime.oneObj, context)) % ScriptRuntime.toNumber(_k13));
            _0x4d9a2e2 = OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.add(_0x4d9a2e2, ScriptRuntime.getObjectElem(_0x3be607, _0x7e68073, context, parentScope), context)) % ScriptRuntime.toNumber(_k13));
            Object _0x5d835f2 = ScriptRuntime.getObjectElem(_0x3be607, _0x7e68073, context, parentScope);
            ScriptRuntime.setObjectElem(_0x3be607, _0x7e68073, ScriptRuntime.getObjectElem(_0x3be607, _0x4d9a2e2, context, parentScope), context, parentScope);
            ScriptRuntime.setObjectElem(_0x3be607, _0x4d9a2e2, _0x5d835f2, context, parentScope);
            _0x23d13f = ScriptRuntime.add(_0x23d13f, OptRuntime.call1(ScriptRuntime.getElemFunctionAndThis(ScriptRuntime.name(context, parentScope, "String"), "fromCharCode", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.wrapDouble(ScriptRuntime.toInt32(OptRuntime.call1(ScriptRuntime.getElemFunctionAndThis(_0xb9c0d73, "charCodeAt", context, parentScope), ScriptRuntime.lastStoredScriptable(context), _0x4908f2, context, parentScope)) ^ ScriptRuntime.toInt32(ScriptRuntime.getObjectElem(_0x3be607, OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.add(ScriptRuntime.getObjectElem(_0x3be607, _0x7e68073, context, parentScope), ScriptRuntime.getObjectElem(_0x3be607, _0x4d9a2e2, context, parentScope), context)) % ScriptRuntime.toNumber(_k13)), context, parentScope))), context, parentScope), context);
            ScriptRuntime.addInstructionCount(context, 208);
            double number4 = ScriptRuntime.toNumber(_0x4908f2);
            _0x4908f2 = OptRuntime.wrapDouble(1.0d + number4);
            OptRuntime.wrapDouble(number4);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 22);
        }
    }

    private static Object _c_anonymous_5(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "_0x4f555f"), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 6), context, createFunctionActivation, "_0x4f555f");
            Double wrapDouble = OptRuntime.wrapDouble(ScriptRuntime.toInt32(ScriptRuntime.name(context, createFunctionActivation, "_0x1afbf2")) ^ ScriptRuntime.toInt32(OptRuntime.wrapDouble(ScriptRuntime.toInt32(OptRuntime.callName(new Object[]{ScriptRuntime.nameIncrDecr(createFunctionActivation, "_0x4d2989", context, 0), ScriptRuntime.name(context, createFunctionActivation, "_0x1afbf2")}, "_0x4f555f", context, createFunctionActivation)) >> ScriptRuntime.toInt32(ScriptRuntime.name(context, createFunctionActivation, "_0x4d2989")))));
            ScriptRuntime.addInstructionCount(context, 125);
            return wrapDouble;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_6(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 5) {
            objArr = ScriptRuntime.padArguments(objArr, 5);
        }
        Object _0x419b76 = objArr[0];
        Object _0x4e0e43 = objArr[1];
        Object _0x255df0 = objArr[2];
        Object obj = objArr[3];
        Object obj2 = objArr[4];
        Object obj3 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        Object _0x4e0e432 = OptRuntime.wrapDouble(ScriptRuntime.toInt32(_0x4e0e43) >> ScriptRuntime.toInt32(_k5));
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 108);
        if (ScriptRuntime.cmp_LT(_0x4e0e432, _0x419b76)) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 137);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                _0x419b76 = OptRuntime.wrapDouble(ScriptRuntime.toNumber(_0x419b76) - 1.0d);
                if (!ScriptRuntime.toBoolean(_0x419b76)) {
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                Object _0xd04504 = OptRuntime.call0(ScriptRuntime.getElemFunctionAndThis(ScriptRuntime.name(context, parentScope, "_0x138d0d"), "shift", context, parentScope), ScriptRuntime.lastStoredScriptable(context), context, parentScope);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 36);
                if (ScriptRuntime.shallowEq(_0x4e0e432, _0x419b76)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    _0x4e0e432 = _0xd04504;
                    _0x255df0 = OptRuntime.call0(ScriptRuntime.getElemFunctionAndThis(ScriptRuntime.name(context, parentScope, "_0x138d0d"), ScriptRuntime.add("po", "p"), context, parentScope), ScriptRuntime.lastStoredScriptable(context), context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 96);
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 5);
                    if (ScriptRuntime.toBoolean(_0x4e0e432) && ScriptRuntime.shallowEq(OptRuntime.call2(ScriptRuntime.getElemFunctionAndThis(_0x255df0, "replace", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.wrapRegExp(context, parentScope, _re6_0), "", context, parentScope), _0x4e0e432)) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call1(ScriptRuntime.getElemFunctionAndThis(ScriptRuntime.name(context, parentScope, "_0x138d0d"), "push", context, parentScope), ScriptRuntime.lastStoredScriptable(context), _0xd04504, context, parentScope);
                        ScriptRuntime.addInstructionCount(context, 94);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
            }
            ScriptRuntime.addInstructionCount(context, 27);
            OptRuntime.call1(ScriptRuntime.getElemFunctionAndThis(ScriptRuntime.name(context, parentScope, "_0x138d0d"), "push", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.call0(ScriptRuntime.getElemFunctionAndThis(ScriptRuntime.name(context, parentScope, "_0x138d0d"), "shift", context, parentScope), ScriptRuntime.lastStoredScriptable(context), context, parentScope), context, parentScope);
            ScriptRuntime.addInstructionCount(context, 49);
        }
        Integer num = _k6;
        ScriptRuntime.addInstructionCount(context, 3);
        return num;
    }

    private static Object _c_anonymous_7(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "_0x22a3f2"), OptRuntime.wrapDouble(ScriptRuntime.toInt32(OptRuntime.wrapDouble(ScriptRuntime.toInt32(OptRuntime.call1(ScriptRuntime.getElemFunctionAndThis("0x", "concat", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "_0x22a3f2"), context, createFunctionActivation)) ^ (-1))) ^ (-1)), context, createFunctionActivation, "_0x22a3f2");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "_0x28c3f7"), ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createFunctionActivation, "_0x2826"), ScriptRuntime.name(context, createFunctionActivation, "_0x22a3f2"), context, createFunctionActivation), context, createFunctionActivation, "_0x28c3f7");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 135);
            if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createFunctionActivation, "_0x474a"), "ypEXZS", context, createFunctionActivation), ScriptRuntime.name(context, createFunctionActivation, "undefined"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.call0(ScriptRuntime.getValueFunctionAndThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 8), context), ScriptRuntime.lastStoredScriptable(context), context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "_0x3d5182"), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 10), context, createFunctionActivation, "_0x3d5182");
                ScriptRuntime.setObjectElem(ScriptRuntime.name(context, createFunctionActivation, "_0x474a"), "KYXEXh", ScriptRuntime.name(context, createFunctionActivation, "_0x3d5182"), context, createFunctionActivation);
                ScriptRuntime.setObjectElem(ScriptRuntime.name(context, createFunctionActivation, "_0x474a"), "ucRkTn", ScriptRuntime.newObjectLiteral(objArr2, objArr2, (int[]) null, context, createFunctionActivation), context, createFunctionActivation);
                ScriptRuntime.setObjectElem(ScriptRuntime.name(context, createFunctionActivation, "_0x474a"), "ypEXZS", !ScriptRuntime.toBoolean(OptRuntime.newArrayLiteral(objArr2, (String) null, 0, context, createFunctionActivation)) ? Boolean.FALSE : Boolean.TRUE, context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 334);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "_0x3fb4d4"), ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createFunctionActivation, "_0x474a"), "ucRkTn", context, createFunctionActivation), ScriptRuntime.name(context, createFunctionActivation, "_0x22a3f2"), context, createFunctionActivation), context, createFunctionActivation, "_0x3fb4d4");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 56);
            if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "_0x3fb4d4"), ScriptRuntime.name(context, createFunctionActivation, "undefined"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 97);
                if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createFunctionActivation, "_0x474a"), "zNYjVf", context, createFunctionActivation), ScriptRuntime.name(context, createFunctionActivation, "undefined"))) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setObjectElem(ScriptRuntime.name(context, createFunctionActivation, "_0x474a"), "zNYjVf", !ScriptRuntime.toBoolean(OptRuntime.newArrayLiteral(objArr2, (String) null, 0, context, createFunctionActivation)) ? Boolean.FALSE : Boolean.TRUE, context, createFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 185);
                }
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "_0x28c3f7"), OptRuntime.call2(ScriptRuntime.getElemFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "_0x474a"), "KYXEXh", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "_0x28c3f7"), ScriptRuntime.name(context, createFunctionActivation, "_0x1ff45b"), context, createFunctionActivation), context, createFunctionActivation, "_0x28c3f7");
                ScriptRuntime.setObjectElem(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createFunctionActivation, "_0x474a"), "ucRkTn", context, createFunctionActivation), ScriptRuntime.name(context, createFunctionActivation, "_0x22a3f2"), ScriptRuntime.name(context, createFunctionActivation, "_0x28c3f7"), context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 96);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "_0x28c3f7"), ScriptRuntime.name(context, createFunctionActivation, "_0x3fb4d4"), context, createFunctionActivation, "_0x28c3f7");
                ScriptRuntime.addInstructionCount(context, 30);
            }
            Object name = ScriptRuntime.name(context, createFunctionActivation, "_0x28c3f7");
            ScriptRuntime.addInstructionCount(context, 8);
            return name;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_8(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            Scriptable bind = ScriptRuntime.bind(context, createFunctionActivation, "_0x22fcd1");
            if (ScriptRuntime.toBoolean(ScriptRuntime.shallowEq(ScriptRuntime.typeofName(createFunctionActivation, "window"), "undefined") ? Boolean.FALSE : Boolean.TRUE)) {
                obj = ScriptRuntime.name(context, createFunctionActivation, "window");
            } else {
                Boolean bool = !ScriptRuntime.shallowEq(ScriptRuntime.typeofName(createFunctionActivation, "process"), "object") ? Boolean.FALSE : Boolean.TRUE;
                if (ScriptRuntime.toBoolean(bool)) {
                    bool = !ScriptRuntime.shallowEq(ScriptRuntime.typeofName(createFunctionActivation, "require"), "function") ? Boolean.FALSE : Boolean.TRUE;
                    if (ScriptRuntime.toBoolean(bool)) {
                        bool = !ScriptRuntime.shallowEq(ScriptRuntime.typeofName(createFunctionActivation, "global"), "object") ? Boolean.FALSE : Boolean.TRUE;
                    }
                }
                obj = scriptable2;
                if (ScriptRuntime.toBoolean(bool)) {
                    obj = ScriptRuntime.name(context, createFunctionActivation, "global");
                }
            }
            ScriptRuntime.setName(bind, obj, context, createFunctionActivation, "_0x22fcd1");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "_0x5933be"), "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=", context, createFunctionActivation, "_0x5933be");
            if (!ScriptRuntime.toBoolean(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createFunctionActivation, "_0x22fcd1"), "atob", context, createFunctionActivation))) {
                ScriptRuntime.setObjectElem(ScriptRuntime.name(context, createFunctionActivation, "_0x22fcd1"), "atob", new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 9), context, createFunctionActivation);
            }
            Object obj2 = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 284);
            return obj2;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_9(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 1) {
            objArr = ScriptRuntime.padArguments(objArr, 1);
        }
        Object _0x3e27e3 = objArr[0];
        Object _0x16a7dd = Undefined.instance;
        Object _0x2f9690 = _0x16a7dd;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Object _0x16a7dd2 = OptRuntime.call2(ScriptRuntime.getElemFunctionAndThis(OptRuntime.callName(new Object[]{_0x3e27e3}, "String", context, parentScope), "replace", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.wrapRegExp(context, parentScope, _re9_0), "", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Double _0x2149f8 = OptRuntime.zeroObj;
        Double _0x5be216 = OptRuntime.zeroObj;
        Object _0x25bed1 = "";
        ScriptRuntime.addInstructionCount(context, 128);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            Callable elemFunctionAndThis = ScriptRuntime.getElemFunctionAndThis(_0x16a7dd2, "charAt", context, parentScope);
            Scriptable lastStoredScriptable = ScriptRuntime.lastStoredScriptable(context);
            double number = ScriptRuntime.toNumber(_0x5be216);
            _0x5be216 = OptRuntime.wrapDouble(1.0d + number);
            Object _0x5ae1e7 = OptRuntime.call1(elemFunctionAndThis, lastStoredScriptable, OptRuntime.wrapDouble(number), context, parentScope);
            if (!ScriptRuntime.toBoolean(_0x5ae1e7)) {
                ScriptRuntime.addInstructionCount(context, 53);
                ScriptRuntime.addInstructionCount(context, 2);
                return _0x25bed1;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            Object _0x5ae1e72 = OptRuntime.call1(ScriptRuntime.getElemFunctionAndThis(ScriptRuntime.name(context, parentScope, "_0x5933be"), "indexOf", context, parentScope), ScriptRuntime.lastStoredScriptable(context), _0x5ae1e7, context, parentScope);
            ScriptRuntime.addInstructionCount(context, 34);
            Double wrapDouble = OptRuntime.wrapDouble(ScriptRuntime.toInt32(_0x5ae1e72) ^ (-1));
            if (ScriptRuntime.toBoolean(wrapDouble)) {
                _0x2f9690 = ScriptRuntime.toBoolean(OptRuntime.wrapDouble(ScriptRuntime.toNumber(_0x2149f8) % ScriptRuntime.toNumber(_k7))) ? ScriptRuntime.add(OptRuntime.wrapDouble(ScriptRuntime.toNumber(_0x2f9690) * ScriptRuntime.toNumber(_k8)), _0x5ae1e72, context) : _0x5ae1e72;
                double number2 = ScriptRuntime.toNumber(_0x2149f8);
                _0x2149f8 = OptRuntime.wrapDouble(1.0d + number2);
                wrapDouble = OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.wrapDouble(number2)) % ScriptRuntime.toNumber(_k7));
            }
            if (ScriptRuntime.toBoolean(wrapDouble)) {
                _0x25bed1 = ScriptRuntime.add(_0x25bed1, OptRuntime.call1(ScriptRuntime.getElemFunctionAndThis(ScriptRuntime.name(context, parentScope, "String"), "fromCharCode", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.wrapDouble(ScriptRuntime.toInt32(_k9) & ScriptRuntime.toInt32(OptRuntime.wrapDouble(ScriptRuntime.toInt32(_0x2f9690) >> ScriptRuntime.toInt32(OptRuntime.wrapDouble(ScriptRuntime.toInt32(OptRuntime.wrapDouble(ScriptRuntime.toNumber(_k10) * ScriptRuntime.toNumber(_0x2149f8))) & ScriptRuntime.toInt32(_k11)))))), context, parentScope), context);
            } else {
                Double d = OptRuntime.zeroObj;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 209);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0489 A[Catch: all -> 0x036f, TryCatch #0 {all -> 0x036f, blocks: (B:3:0x000e, B:5:0x00f6, B:7:0x0191, B:8:0x0195, B:10:0x023f, B:12:0x0247, B:13:0x0256, B:14:0x0292, B:79:0x029e, B:21:0x02a3, B:23:0x02cd, B:25:0x02eb, B:27:0x0315, B:29:0x0333, B:30:0x033c, B:75:0x0348, B:67:0x034d, B:32:0x0509, B:34:0x06ad, B:36:0x06c3, B:37:0x07aa, B:53:0x07bc, B:49:0x07c1, B:51:0x07ca, B:39:0x0993, B:41:0x09ae, B:45:0x09da, B:43:0x09fa, B:48:0x09ef, B:54:0x0935, B:56:0x0943, B:59:0x07d8, B:61:0x086d, B:63:0x08a9, B:65:0x08b1, B:66:0x08d0, B:72:0x0914, B:73:0x08fc, B:76:0x04e5, B:77:0x04bd, B:16:0x0489, B:18:0x04a8, B:20:0x04b2, B:80:0x0477, B:82:0x0375, B:84:0x03be, B:86:0x03d2, B:88:0x03ea, B:90:0x03fe, B:91:0x0404, B:93:0x0358), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0509 A[Catch: all -> 0x036f, TryCatch #0 {all -> 0x036f, blocks: (B:3:0x000e, B:5:0x00f6, B:7:0x0191, B:8:0x0195, B:10:0x023f, B:12:0x0247, B:13:0x0256, B:14:0x0292, B:79:0x029e, B:21:0x02a3, B:23:0x02cd, B:25:0x02eb, B:27:0x0315, B:29:0x0333, B:30:0x033c, B:75:0x0348, B:67:0x034d, B:32:0x0509, B:34:0x06ad, B:36:0x06c3, B:37:0x07aa, B:53:0x07bc, B:49:0x07c1, B:51:0x07ca, B:39:0x0993, B:41:0x09ae, B:45:0x09da, B:43:0x09fa, B:48:0x09ef, B:54:0x0935, B:56:0x0943, B:59:0x07d8, B:61:0x086d, B:63:0x08a9, B:65:0x08b1, B:66:0x08d0, B:72:0x0914, B:73:0x08fc, B:76:0x04e5, B:77:0x04bd, B:16:0x0489, B:18:0x04a8, B:20:0x04b2, B:80:0x0477, B:82:0x0375, B:84:0x03be, B:86:0x03d2, B:88:0x03ea, B:90:0x03fe, B:91:0x0404, B:93:0x0358), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object _c_anonymous_11(org.autojs.autojspro.gen._7a9076d6d94e62c13d641aa71f19ae8e r14, org.mozilla.javascript.Context r15, org.mozilla.javascript.Scriptable r16, org.mozilla.javascript.Scriptable r17, java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 2582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.autojs.autojspro.gen._7a9076d6d94e62c13d641aa71f19ae8e._c_anonymous_11(org.autojs.autojspro.gen._7a9076d6d94e62c13d641aa71f19ae8e, org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Object");
    }

    private static Object _c_anonymous_12(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 1) {
            objArr = ScriptRuntime.padArguments(objArr, 1);
        }
        Object input = objArr[0];
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Object age = OptRuntime.callName(new Object[]{input}, "String", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 60);
        if (ScriptRuntime.eq(age, "")) {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "SKYCDK", "000", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 117);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "SKYCDK", age, context, parentScope);
            ScriptRuntime.addInstructionCount(context, 36);
        }
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "激活状态"), "false", context, parentScope, "激活状态");
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 23);
        return obj2;
    }

    private static Object _c_anonymous_13(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("exit", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_md5_14(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 1) {
            objArr = ScriptRuntime.padArguments(objArr, 1);
        }
        Object string = objArr[0];
        ScriptRuntime.addInstructionCount(context, 1);
        Object callProp0 = OptRuntime.callProp0(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "java"), "math", context, parentScope), "BigInteger", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.oneObj, OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "java"), "security", context, parentScope), "MessageDigest", context, parentScope), "getInstance", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "md5", context, parentScope), "digest", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.callProp0(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "java"), "lang", context, parentScope), "String", context, parentScope), ScriptRuntime.lastStoredScriptable(context), string, context, parentScope), "getBytes", context, parentScope), context, parentScope), context, parentScope), "toString", context, parentScope), ScriptRuntime.lastStoredScriptable(context), _k12, context, parentScope), "toUpperCase", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 194);
        return callProp0;
    }

    private static Object _c_anonymous_15(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("jiazaitongzhiInstructions", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_anonymous_16(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("jiazaitongzhiannouncement", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_anonymous_17(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("jiazaitongzhiguangyupeiwan", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_anonymous_18(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("jiazaitongzhiguangyufuli", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_anonymous_19(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object objectProp;
        Object objectProp2;
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 1) {
            objArr = ScriptRuntime.padArguments(objArr, 1);
        }
        Object checked = objArr[0];
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 31);
        if (ScriptRuntime.toBoolean(checked) && ((objectProp = ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "auto"), "service", context, parentScope)) == null || objectProp == Undefined.instance)) {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "app"), "startActivity", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObjectLiteral(new Object[]{"action"}, new Object[]{"android.settings.ACCESSIBILITY_SETTINGS"}, (int[]) null, context, parentScope), context, parentScope);
            ScriptRuntime.addInstructionCount(context, 138);
        }
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 5);
        if (!ScriptRuntime.toBoolean(checked) && (objectProp2 = ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "auto"), "service", context, parentScope)) != null && objectProp2 != Undefined.instance) {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callProp0(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "auto"), "service", context, parentScope), "disableSelf", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 84);
        }
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj;
    }

    private static Object _c_anonymous_20(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 1) {
            objArr = ScriptRuntime.padArguments(objArr, 1);
        }
        Object ischecked = objArr[0];
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 31);
        if (ScriptRuntime.toBoolean(ischecked) && !ScriptRuntime.toBoolean(OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "floaty"), "checkPermission", context, parentScope))) {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{"请开启悬浮窗权限"}, "toastLog", context, parentScope);
            OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "console"), "show", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 114);
        }
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj;
    }

    private static Object _c_anonymous_21(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 1) {
            objArr = ScriptRuntime.padArguments(objArr, 1);
        }
        Object obj = objArr[0];
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "监控上键", context, parentScope), "checked", Boolean.TRUE, context, parentScope);
        ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "监控下键", context, parentScope), "checked", Boolean.TRUE, context, parentScope);
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 85);
        return obj2;
    }

    private static Object _c_anonymous_22(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createArrowFunctionActivation = ScriptRuntime.createArrowFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createArrowFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{"resume"}, "log", context, createArrowFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 43);
            Object objectProp = ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "auto"), "service", context, createArrowFunctionActivation);
            if (objectProp == null || objectProp == Undefined.instance) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "ui"), "无障碍", context, createArrowFunctionActivation), "checked", Boolean.FALSE, context, createArrowFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 115);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "ui"), "无障碍", context, createArrowFunctionActivation), "checked", Boolean.TRUE, context, createArrowFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 33);
            }
            OptRuntime.callName(new Object[]{OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createArrowFunctionActivation, context, 23), context, createArrowFunctionActivation, scriptable2), OptRuntime.oneObj}, "setTimeout", context, createArrowFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 42);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_23(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        if (ScriptRuntime.toBoolean(OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "floaty"), "checkPermission", context, parentScope))) {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{"有悬浮窗权限"}, "log", context, parentScope);
            ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "悬浮窗", context, parentScope), "checked", Boolean.TRUE, context, parentScope);
            ScriptRuntime.addInstructionCount(context, 93);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{"没有悬浮窗权限"}, "log", context, parentScope);
            ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "悬浮窗", context, parentScope), "checked", Boolean.FALSE, context, parentScope);
            ScriptRuntime.addInstructionCount(context, 52);
        }
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj;
    }

    private static Object _c_anonymous_24(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "国际服", context, parentScope), "checked", Boolean.TRUE, context, parentScope);
        ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "国服", context, parentScope), "checked", Boolean.FALSE, context, parentScope);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "国际服", ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "国际服", context, parentScope), "checked", context, parentScope), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 117);
        return obj;
    }

    private static Object _c_anonymous_25(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "国服", context, parentScope), "checked", Boolean.TRUE, context, parentScope);
        ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "国际服", context, parentScope), "checked", Boolean.FALSE, context, parentScope);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "国服", ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "国服", context, parentScope), "checked", context, parentScope), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 117);
        return obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 11 */
    private static Object _c_anonymous_26(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
            ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "激活状态"), "true");
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callProp0(ScriptRuntime.name(context, createFunctionActivation, "events"), "observeKey", context, createFunctionActivation);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "录屏模式", ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "ui"), "录屏模式", context, createFunctionActivation), "checked", context, createFunctionActivation), context, createFunctionActivation);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "监控下键", ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "ui"), "监控下键", context, createFunctionActivation), "checked", context, createFunctionActivation), context, createFunctionActivation);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "监控上键", ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "ui"), "监控上键", context, createFunctionActivation), "checked", context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 241);
            if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "开启悬浮框状态"), "true")) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{"请勿重复开启！"}, "toastLog", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 292);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "threads"), "start", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 27), context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 42);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 3);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_27(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 28), context, createFunctionActivation, scriptable2), _k18}, "setInterval", context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "开启悬浮框状态"), "true", context, createFunctionActivation, "开启悬浮框状态");
            OptRuntime.callName0("initFloatWin", context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 95);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_28(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 8);
        return obj;
    }

    private static Object _c_initFloatWin_29(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "window0"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "floaty"), "rawWindow", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObject(ScriptRuntime.name(context, createFunctionActivation, "XML"), context, createFunctionActivation, new Object[]{"<frame w=\"40\" h=\"40\" id=\"ccc\" alpha=\"0.8\" gravity=\"center\">\n            <img id=\"action\" w=\"40\" h=\"40\" src=\"file://images/3720.png\" layout_gravity=\"center|right\" layout_weight=\"1\" alpha=\"0.95\" />\n        </frame>"}), context, createFunctionActivation), context, createFunctionActivation, "window0");
            OptRuntime.callName(new Object[]{OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 30), context, createFunctionActivation, scriptable2), OptRuntime.oneObj}, "setTimeout", context, createFunctionActivation);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "window0"), "setPosition", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), _k19, _k20, context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "x"), OptRuntime.zeroObj, context, createFunctionActivation, "x");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "y"), OptRuntime.zeroObj, context, createFunctionActivation, "y");
            ScriptRuntime.setObjectProp(scriptable2, "Tx", OptRuntime.zeroObj, context, createFunctionActivation);
            ScriptRuntime.setObjectProp(scriptable2, "Ty", OptRuntime.zeroObj, context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ar"), Boolean.TRUE, context, createFunctionActivation, "ar");
            ScriptRuntime.setObjectProp(scriptable2, "Orientation", ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "context"), "resources", context, createFunctionActivation), "configuration", context, createFunctionActivation), "orientation", context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.setObjectProp(scriptable2, "Width", ScriptRuntime.toBoolean(!ScriptRuntime.eq(ScriptRuntime.getObjectProp(scriptable2, "Orientation", context), OptRuntime.oneObj) ? Boolean.FALSE : Boolean.TRUE) ? ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "device"), "width", context, createFunctionActivation) : ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "device"), "height", context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.setObjectProp(scriptable2, "Height", ScriptRuntime.toBoolean(!ScriptRuntime.eq(ScriptRuntime.getObjectProp(scriptable2, "Orientation", context), _k21) ? Boolean.FALSE : Boolean.TRUE) ? ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "device"), "width", context, createFunctionActivation) : ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "device"), "height", context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.setObjectProp(scriptable2, "Move", new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 31), context, createFunctionActivation);
            ScriptRuntime.setObjectProp(scriptable2, "Tyidong", Boolean.FALSE, context, createFunctionActivation);
            ScriptRuntime.setObjectProp(scriptable2, "Tkeep", Boolean.FALSE, context, createFunctionActivation);
            ScriptRuntime.setObjectProp(scriptable2, "isAutoIntScreen", Boolean.TRUE, context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "ui"), "post", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 32), _k18, context, createFunctionActivation);
            OptRuntime.callName(new Object[]{OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 33), context, createFunctionActivation, scriptable2), _k22}, "setInterval", context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window0"), "action", context, createFunctionActivation), "setOnTouchListener", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObject(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "android"), "view", context, createFunctionActivation), "View", context, createFunctionActivation), "OnTouchListener", context, createFunctionActivation), context, createFunctionActivation, new Object[]{OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 34), context, createFunctionActivation, scriptable2)}), context, createFunctionActivation);
            ScriptRuntime.setObjectProp(scriptable2, "G", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 37), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            ScriptRuntime.setObjectProp(scriptable2, "windowGXY", new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 38), context, createFunctionActivation);
            ScriptRuntime.setObjectProp(scriptable2, "weiyi", new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 39), context, createFunctionActivation);
            ScriptRuntime.setObjectProp(scriptable2, "windowyidong", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 40), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            ScriptRuntime.setObjectProp(scriptable2, "ViewIntScreen", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 41), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            ScriptRuntime.setObjectProp(scriptable2, "IntScreen", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 42), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "threads"), "start", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObject(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "java"), "lang", context, createFunctionActivation), "Runnable", context, createFunctionActivation), context, createFunctionActivation, new Object[]{OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 43), context, createFunctionActivation, scriptable2)}), context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 934);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_30(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 8);
        return obj;
    }

    private static Object _c_anonymous_31(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 8);
        return obj;
    }

    private static Object _c_anonymous_32(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "windowWidth"), OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window0"), "getWidth", context, parentScope), context, parentScope, "windowWidth");
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "windowHeight"), OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window0"), "getHeight", context, parentScope), context, parentScope, "windowHeight");
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 74);
        return obj;
    }

    private static Object _c_anonymous_33(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 15);
        if (!ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "开启悬浮框状态"), "false")) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setObjectProp(scriptable2, "Orientation", ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "context"), "resources", context, parentScope), "configuration", context, parentScope), "orientation", context, parentScope), context, parentScope);
            ScriptRuntime.setObjectProp(scriptable2, "Width", ScriptRuntime.toBoolean(!ScriptRuntime.eq(ScriptRuntime.getObjectProp(scriptable2, "Orientation", context), OptRuntime.oneObj) ? Boolean.FALSE : Boolean.TRUE) ? ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "device"), "width", context, parentScope) : ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "device"), "height", context, parentScope), context, parentScope);
            ScriptRuntime.setObjectProp(scriptable2, "Height", ScriptRuntime.toBoolean(!ScriptRuntime.eq(ScriptRuntime.getObjectProp(scriptable2, "Orientation", context), _k21) ? Boolean.FALSE : Boolean.TRUE) ? ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "device"), "width", context, parentScope) : ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "device"), "height", context, parentScope), context, parentScope);
            ScriptRuntime.addInstructionCount(context, 1);
            Object xy = OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(scriptable2, "windowGXY", context, parentScope), ScriptRuntime.lastStoredScriptable(context), new Object[]{OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window0"), "getX", context, parentScope), OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window0"), "getY", context, parentScope), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(scriptable2, "G", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "window0"), context, parentScope)}, context, parentScope);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(scriptable2, "windowyidong", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.newArrayLiteral(new Object[]{OptRuntime.newArrayLiteral(new Object[]{OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window0"), "getX", context, parentScope), OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window0"), "getY", context, parentScope)}, (String) null, 0, context, parentScope), OptRuntime.newArrayLiteral(new Object[]{ScriptRuntime.getObjectProp(xy, "x", context, parentScope), ScriptRuntime.getObjectProp(xy, "y", context, parentScope)}, (String) null, 0, context, parentScope)}, (String) null, 0, context, parentScope), context, parentScope);
            ScriptRuntime.addInstructionCount(context, 466);
        }
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj2;
    }

    private static Object _c_anonymous_34(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Boolean bool;
        Scriptable createArrowFunctionActivation = ScriptRuntime.createArrowFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createArrowFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(scriptable2, "Move", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createArrowFunctionActivation, "view"), ScriptRuntime.name(context, createArrowFunctionActivation, "event"), context, createArrowFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 64);
            Object callProp0 = OptRuntime.callProp0(ScriptRuntime.name(context, createArrowFunctionActivation, "event"), "getAction", context, createArrowFunctionActivation);
            if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "event"), "ACTION_DOWN", context, createArrowFunctionActivation), callProp0)) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "downTime"), OptRuntime.callProp0(ScriptRuntime.newObject(ScriptRuntime.name(context, createArrowFunctionActivation, "Date"), context, createArrowFunctionActivation, objArr2), "getTime", context, createArrowFunctionActivation), context, createArrowFunctionActivation, "downTime");
                ScriptRuntime.setObjectProp(scriptable2, "Tx", OptRuntime.callProp0(ScriptRuntime.name(context, createArrowFunctionActivation, "event"), "getRawX", context, createArrowFunctionActivation), context, createArrowFunctionActivation);
                ScriptRuntime.setObjectProp(scriptable2, "Ty", OptRuntime.callProp0(ScriptRuntime.name(context, createArrowFunctionActivation, "event"), "getRawY", context, createArrowFunctionActivation), context, createArrowFunctionActivation);
                ScriptRuntime.setObjectProp(scriptable2, "TX", OptRuntime.callProp0(ScriptRuntime.name(context, createArrowFunctionActivation, "window0"), "getX", context, createArrowFunctionActivation), context, createArrowFunctionActivation);
                ScriptRuntime.setObjectProp(scriptable2, "TY", OptRuntime.callProp0(ScriptRuntime.name(context, createArrowFunctionActivation, "window0"), "getY", context, createArrowFunctionActivation), context, createArrowFunctionActivation);
                ScriptRuntime.setObjectProp(scriptable2, "Tkeep", Boolean.TRUE, context, createArrowFunctionActivation);
                bool = Boolean.TRUE;
                ScriptRuntime.addInstructionCount(context, 165);
            } else if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "event"), "ACTION_MOVE", context, createArrowFunctionActivation), callProp0)) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "sx"), OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.callProp0(ScriptRuntime.name(context, createArrowFunctionActivation, "event"), "getRawX", context, createArrowFunctionActivation)) - ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(scriptable2, "Tx", context))), context, createArrowFunctionActivation, "sx");
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "sy"), OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.callProp0(ScriptRuntime.name(context, createArrowFunctionActivation, "event"), "getRawY", context, createArrowFunctionActivation)) - ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(scriptable2, "Ty", context))), context, createArrowFunctionActivation, "sy");
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 122);
                if (!ScriptRuntime.toBoolean(ScriptRuntime.getObjectProp(scriptable2, "Tyidong", context)) && ScriptRuntime.toBoolean(ScriptRuntime.getObjectProp(scriptable2, "Tkeep", context)) && ScriptRuntime.cmp_LE(_k23, OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(scriptable2, "weiyi", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createArrowFunctionActivation, "sx"), ScriptRuntime.name(context, createArrowFunctionActivation, "sy"), context, createArrowFunctionActivation))) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setObjectProp(scriptable2, "Tyidong", Boolean.TRUE, context, createArrowFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 227);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.toBoolean(ScriptRuntime.getObjectProp(scriptable2, "Tyidong", context)) && ScriptRuntime.toBoolean(ScriptRuntime.getObjectProp(scriptable2, "Tkeep", context))) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "window0"), "setPosition", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.getObjectProp(scriptable2, "TX", context), ScriptRuntime.name(context, createArrowFunctionActivation, "sx"), context), ScriptRuntime.add(ScriptRuntime.getObjectProp(scriptable2, "TY", context), ScriptRuntime.name(context, createArrowFunctionActivation, "sy"), context), context, createArrowFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 121);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                bool = Boolean.TRUE;
                ScriptRuntime.addInstructionCount(context, 8);
            } else if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "event"), "ACTION_UP", context, createArrowFunctionActivation), callProp0)) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (!ScriptRuntime.toBoolean(ScriptRuntime.getObjectProp(scriptable2, "Tyidong", context)) && ScriptRuntime.toBoolean(ScriptRuntime.getObjectProp(scriptable2, "Tkeep", context)) && ScriptRuntime.cmp_LT(ScriptRuntime.getObjectProp(scriptable2, "Ttime", context), _k24)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "threads"), "start", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createArrowFunctionActivation, "功能列表"), context, createArrowFunctionActivation);
                    OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "threads"), "start", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createArrowFunctionActivation, "自检"), context, createArrowFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 143);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setObjectProp(scriptable2, "Tkeep", Boolean.FALSE, context, createArrowFunctionActivation);
                ScriptRuntime.setObjectProp(scriptable2, "Ttime", OptRuntime.zeroObj, context, createArrowFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 36);
                if (ScriptRuntime.toBoolean(ScriptRuntime.getObjectPropNoWarn(scriptable2, "Tyidong", context, createArrowFunctionActivation))) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 70);
                    if (ScriptRuntime.toBoolean(ScriptRuntime.getObjectPropNoWarn(scriptable2, "isAutoIntScreen", context, createArrowFunctionActivation))) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "threads"), "start", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObject(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "java"), "lang", context, createArrowFunctionActivation), "Runnable", context, createArrowFunctionActivation), context, createArrowFunctionActivation, new Object[]{OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createArrowFunctionActivation, context, 35), context, createArrowFunctionActivation, scriptable2)}), context, createArrowFunctionActivation);
                        ScriptRuntime.addInstructionCount(context, 178);
                    } else {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "threads"), "start", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObject(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "java"), "lang", context, createArrowFunctionActivation), "Runnable", context, createArrowFunctionActivation), context, createArrowFunctionActivation, new Object[]{OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createArrowFunctionActivation, context, 36), context, createArrowFunctionActivation, scriptable2)}), context, createArrowFunctionActivation);
                        ScriptRuntime.addInstructionCount(context, 84);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setObjectProp(scriptable2, "Tyidong", Boolean.FALSE, context, createArrowFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 18);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                bool = Boolean.TRUE;
                ScriptRuntime.addInstructionCount(context, 8);
            } else {
                ScriptRuntime.addInstructionCount(context, 160);
                bool = Boolean.TRUE;
                ScriptRuntime.addInstructionCount(context, 3);
            }
            return bool;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_35(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(scriptable2, "windowyidong", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.callProp0(scriptable2, "IntScreen", context, parentScope), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 36);
        return obj;
    }

    private static Object _c_anonymous_36(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(scriptable2, "windowyidong", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.callProp0(scriptable2, "ViewIntScreen", context, parentScope), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 36);
        return obj;
    }

    private static Object _c_anonymous_37(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object ary;
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 2) {
            objArr = ScriptRuntime.padArguments(objArr, 2);
        }
        Object win = objArr[0];
        Object view = objArr[1];
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Object K = _k25;
        Object H = _k26;
        Object D = _k22;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 79);
        if (!ScriptRuntime.toBoolean(ScriptRuntime.name(context, parentScope, "ar"))) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 112);
            if (ScriptRuntime.toBoolean(view)) {
                ScriptRuntime.addInstructionCount(context, 1);
                ary = OptRuntime.newArrayLiteral(new Object[]{OptRuntime.newArrayLiteral(new Object[]{OptRuntime.wrapDouble(-ScriptRuntime.toNumber(OptRuntime.callProp0(view, "getX", context, parentScope))), OptRuntime.wrapDouble(-ScriptRuntime.toNumber(OptRuntime.callProp0(view, "getY", context, parentScope)))}, (String) null, 0, context, parentScope), OptRuntime.newArrayLiteral(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(scriptable2, "Width", context)) - ScriptRuntime.toNumber(ScriptRuntime.add(OptRuntime.callProp0(view, "getX", context, parentScope), OptRuntime.callProp0(view, "getWidth", context, parentScope), context))), OptRuntime.wrapDouble((((ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(scriptable2, "Height", context)) - ScriptRuntime.toNumber(ScriptRuntime.add(OptRuntime.callProp0(view, "getY", context, parentScope), OptRuntime.callProp0(view, "getHeight", context, parentScope), context))) - ScriptRuntime.toNumber(H)) - ScriptRuntime.toNumber(K)) - ScriptRuntime.toNumber(D))}, (String) null, 0, context, parentScope)}, (String) null, 0, context, parentScope);
                ScriptRuntime.addInstructionCount(context, 323);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ary = OptRuntime.newArrayLiteral(new Object[]{OptRuntime.newArrayLiteral(new Object[]{OptRuntime.zeroObj, OptRuntime.zeroObj}, (String) null, 0, context, parentScope), OptRuntime.newArrayLiteral(new Object[]{ScriptRuntime.add(OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(scriptable2, "Width", context)) - ScriptRuntime.toNumber(OptRuntime.callProp0(win, "getWidth", context, parentScope))), OptRuntime.wrapDouble(ScriptRuntime.toNumber(K) * ScriptRuntime.toNumber(_k21)), context), OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.add(OptRuntime.wrapDouble((ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(scriptable2, "Height", context)) - ScriptRuntime.toNumber(OptRuntime.callProp0(win, "getHeight", context, parentScope))) - ScriptRuntime.toNumber(H)), OptRuntime.wrapDouble(ScriptRuntime.toNumber(K) * ScriptRuntime.toNumber(_k21)), context)) - ScriptRuntime.toNumber(D))}, (String) null, 0, context, parentScope)}, (String) null, 0, context, parentScope);
                ScriptRuntime.addInstructionCount(context, 176);
            }
            ScriptRuntime.addInstructionCount(context, 1);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 10);
            if (ScriptRuntime.toBoolean(view)) {
                ScriptRuntime.addInstructionCount(context, 1);
                ary = OptRuntime.newArrayLiteral(new Object[]{OptRuntime.newArrayLiteral(new Object[]{OptRuntime.wrapDouble(-ScriptRuntime.toNumber(OptRuntime.callProp0(view, "getX", context, parentScope))), OptRuntime.wrapDouble(ScriptRuntime.toNumber(H) - ScriptRuntime.toNumber(OptRuntime.callProp0(view, "getY", context, parentScope)))}, (String) null, 0, context, parentScope), OptRuntime.newArrayLiteral(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(scriptable2, "Width", context)) - ScriptRuntime.toNumber(ScriptRuntime.add(OptRuntime.callProp0(view, "getX", context, parentScope), OptRuntime.callProp0(view, "getWidth", context, parentScope), context))), OptRuntime.wrapDouble((ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(scriptable2, "Height", context)) - ScriptRuntime.toNumber(ScriptRuntime.add(OptRuntime.callProp0(view, "getY", context, parentScope), OptRuntime.callProp0(view, "getHeight", context, parentScope), context))) - ScriptRuntime.toNumber(D))}, (String) null, 0, context, parentScope)}, (String) null, 0, context, parentScope);
                ScriptRuntime.addInstructionCount(context, 214);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ary = OptRuntime.newArrayLiteral(new Object[]{OptRuntime.newArrayLiteral(new Object[]{OptRuntime.zeroObj, H}, (String) null, 0, context, parentScope), OptRuntime.newArrayLiteral(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(scriptable2, "Width", context)) - ScriptRuntime.toNumber(OptRuntime.callProp0(win, "getWidth", context, parentScope))), OptRuntime.wrapDouble((ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(scriptable2, "Height", context)) - ScriptRuntime.toNumber(OptRuntime.callProp0(win, "getHeight", context, parentScope))) - ScriptRuntime.toNumber(D))}, (String) null, 0, context, parentScope)}, (String) null, 0, context, parentScope);
                ScriptRuntime.addInstructionCount(context, 125);
            }
            ScriptRuntime.addInstructionCount(context, 1);
        }
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 7);
        return ary;
    }

    private static Object _c_anonymous_38(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 3) {
            objArr = ScriptRuntime.padArguments(objArr, 3);
        }
        Object x = objArr[0];
        Object y = objArr[1];
        Object k = objArr[2];
        ScriptRuntime.addInstructionCount(context, 1);
        Boolean bool = !ScriptRuntime.cmp_LT(ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(k, OptRuntime.zeroObj, context, parentScope), OptRuntime.zeroObj, context, parentScope), x) ? Boolean.FALSE : Boolean.TRUE;
        if (ScriptRuntime.toBoolean(bool)) {
            bool = !ScriptRuntime.cmp_LT(x, ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(k, OptRuntime.oneObj, context, parentScope), OptRuntime.zeroObj, context, parentScope)) ? Boolean.FALSE : Boolean.TRUE;
        }
        if (!ScriptRuntime.toBoolean(bool)) {
            x = ScriptRuntime.toBoolean(!ScriptRuntime.cmp_LT(ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(k, OptRuntime.zeroObj, context, parentScope), OptRuntime.zeroObj, context, parentScope), x) ? Boolean.FALSE : Boolean.TRUE) ? ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(k, OptRuntime.oneObj, context, parentScope), OptRuntime.zeroObj, context, parentScope) : ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(k, OptRuntime.zeroObj, context, parentScope), OptRuntime.zeroObj, context, parentScope);
        }
        Boolean bool2 = !ScriptRuntime.cmp_LT(ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(k, OptRuntime.zeroObj, context, parentScope), OptRuntime.oneObj, context, parentScope), y) ? Boolean.FALSE : Boolean.TRUE;
        if (ScriptRuntime.toBoolean(bool2)) {
            bool2 = !ScriptRuntime.cmp_LT(y, ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(k, OptRuntime.oneObj, context, parentScope), OptRuntime.oneObj, context, parentScope)) ? Boolean.FALSE : Boolean.TRUE;
        }
        if (!ScriptRuntime.toBoolean(bool2)) {
            y = ScriptRuntime.toBoolean(!ScriptRuntime.cmp_LT(ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(k, OptRuntime.zeroObj, context, parentScope), OptRuntime.oneObj, context, parentScope), y) ? Boolean.FALSE : Boolean.TRUE) ? ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(k, OptRuntime.oneObj, context, parentScope), OptRuntime.oneObj, context, parentScope) : ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(k, OptRuntime.zeroObj, context, parentScope), OptRuntime.oneObj, context, parentScope);
        }
        Scriptable newObjectLiteral = ScriptRuntime.newObjectLiteral(new Object[]{"x", "y"}, new Object[]{x, y}, (int[]) null, context, parentScope);
        ScriptRuntime.addInstructionCount(context, 434);
        return newObjectLiteral;
    }

    private static Object _c_anonymous_39(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "num"), OptRuntime.zeroObj, context, createFunctionActivation, "num");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "i"), OptRuntime.zeroObj, context, createFunctionActivation, "i");
            ScriptRuntime.addInstructionCount(context, 74);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (ScriptRuntime.cmp_LT(ScriptRuntime.name(context, createFunctionActivation, "i"), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "arguments"), "length", context, createFunctionActivation))) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "num"), ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "num"), OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createFunctionActivation, "arguments"), ScriptRuntime.name(context, createFunctionActivation, "i"), context, createFunctionActivation)) * ScriptRuntime.toNumber(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createFunctionActivation, "arguments"), ScriptRuntime.name(context, createFunctionActivation, "i"), context, createFunctionActivation))), context), context, createFunctionActivation, "num");
                    ScriptRuntime.addInstructionCount(context, 86);
                    ScriptRuntime.nameIncrDecr(createFunctionActivation, "i", context, 2);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 15);
                } else {
                    ScriptRuntime.addInstructionCount(context, 38);
                    ScriptRuntime.addInstructionCount(context, 1);
                    Double wrapDouble = OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "Math"), "round", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "Math"), "sqrt", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "num"), context, createFunctionActivation)) * ScriptRuntime.toNumber(_k18)), context, createFunctionActivation)) / ScriptRuntime.toNumber(_k18));
                    ScriptRuntime.addInstructionCount(context, 89);
                    return wrapDouble;
                }
            }
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_40(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 3) {
            objArr = ScriptRuntime.padArguments(objArr, 3);
        }
        Object A = objArr[0];
        Object s = objArr[1];
        Object obj = objArr[2];
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.name(context, parentScope, "window0");
        if (!ScriptRuntime.toBoolean(s)) {
            s = _k23;
        }
        ScriptRuntime.addInstructionCount(context, 1);
        Object sx = OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(A, OptRuntime.oneObj, context, parentScope), OptRuntime.zeroObj, context, parentScope)) - ScriptRuntime.toNumber(ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(A, OptRuntime.zeroObj, context, parentScope), OptRuntime.zeroObj, context, parentScope)));
        Object sy = OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(A, OptRuntime.oneObj, context, parentScope), OptRuntime.oneObj, context, parentScope)) - ScriptRuntime.toNumber(ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(A, OptRuntime.zeroObj, context, parentScope), OptRuntime.oneObj, context, parentScope)));
        ScriptRuntime.addInstructionCount(context, 1);
        Object sd = OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(scriptable2, "weiyi", context, parentScope), ScriptRuntime.lastStoredScriptable(context), sx, sy, context, parentScope)) / ScriptRuntime.toNumber(s));
        ScriptRuntime.addInstructionCount(context, 1);
        Object X = OptRuntime.wrapDouble(ScriptRuntime.toNumber(sx) / ScriptRuntime.toNumber(sd));
        Object Y = OptRuntime.wrapDouble(ScriptRuntime.toNumber(sy) / ScriptRuntime.toNumber(sd));
        ScriptRuntime.addInstructionCount(context, 1);
        Object x = OptRuntime.zeroObj;
        Object y = OptRuntime.zeroObj;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Double i = OptRuntime.zeroObj;
        ScriptRuntime.addInstructionCount(context, 305);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (ScriptRuntime.cmp_LT(i, sd)) {
                ScriptRuntime.addInstructionCount(context, 1);
                x = ScriptRuntime.add(x, X, context);
                y = ScriptRuntime.add(y, Y, context);
                OptRuntime.callName(new Object[]{OptRuntime.oneObj}, "sleep", context, parentScope);
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "window0"), "setPosition", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(A, OptRuntime.zeroObj, context, parentScope), OptRuntime.zeroObj, context, parentScope), x, context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(A, OptRuntime.zeroObj, context, parentScope), OptRuntime.oneObj, context, parentScope), y, context), context, parentScope);
                ScriptRuntime.addInstructionCount(context, 118);
                double number = ScriptRuntime.toNumber(i);
                i = OptRuntime.wrapDouble(1.0d + number);
                OptRuntime.wrapDouble(number);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 22);
            } else {
                ScriptRuntime.addInstructionCount(context, 18);
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "window0"), "setPosition", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(A, OptRuntime.oneObj, context, parentScope), OptRuntime.zeroObj, context, parentScope), ScriptRuntime.getObjectElem(ScriptRuntime.getObjectElem(A, OptRuntime.oneObj, context, parentScope), OptRuntime.oneObj, context, parentScope), context, parentScope);
                Object obj3 = Undefined.instance;
                ScriptRuntime.addInstructionCount(context, 70);
                return obj3;
            }
        }
    }

    private static Object _c_anonymous_41(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Object A = OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(scriptable2, "windowGXY", context, parentScope), ScriptRuntime.lastStoredScriptable(context), new Object[]{OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window0"), "getX", context, parentScope), OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window0"), "getY", context, parentScope), OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(scriptable2, "G", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "window0"), ScriptRuntime.name(context, parentScope, "windowid"), context, parentScope)}, context, parentScope);
        Scriptable newArrayLiteral = OptRuntime.newArrayLiteral(new Object[]{OptRuntime.newArrayLiteral(new Object[]{OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window"), "getX", context, parentScope), OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window"), "getY", context, parentScope)}, (String) null, 0, context, parentScope), OptRuntime.newArrayLiteral(new Object[]{ScriptRuntime.getObjectProp(A, "x", context, parentScope), ScriptRuntime.getObjectProp(A, "y", context, parentScope)}, (String) null, 0, context, parentScope)}, (String) null, 0, context, parentScope);
        ScriptRuntime.addInstructionCount(context, 217);
        return newArrayLiteral;
    }

    private static Object _c_anonymous_42(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Object A = OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(scriptable2, "windowGXY", context, parentScope), ScriptRuntime.lastStoredScriptable(context), new Object[]{OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window0"), "getX", context, parentScope), OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window0"), "getY", context, parentScope), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(scriptable2, "G", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "window0"), context, parentScope)}, context, parentScope);
        Scriptable newArrayLiteral = OptRuntime.newArrayLiteral(new Object[]{OptRuntime.newArrayLiteral(new Object[]{OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window0"), "getX", context, parentScope), OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window0"), "getY", context, parentScope)}, (String) null, 0, context, parentScope), OptRuntime.newArrayLiteral(new Object[]{ScriptRuntime.getObjectProp(A, "x", context, parentScope), ScriptRuntime.getObjectProp(A, "y", context, parentScope)}, (String) null, 0, context, parentScope)}, (String) null, 0, context, parentScope);
        ScriptRuntime.addInstructionCount(context, 209);
        return newArrayLiteral;
    }

    private static Object _c_anonymous_43(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(scriptable2, "windowyidong", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.callProp0(scriptable2, "IntScreen", context, parentScope), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 36);
        return obj;
    }

    /* renamed from: _c_功能列表_44, reason: contains not printable characters */
    private static Object m9_c__44(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Object ppll = OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "dialogs"), "select", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "自动弹奏功能", OptRuntime.newArrayLiteral(new Object[]{"云端音乐", "云端音乐搜索", "我的收藏", "想被圈就点", "设置键位", "别他妈瞎点", "别他妈瞎点", "别他妈瞎点", "隐藏悬浮窗"}, (String) null, 0, context, parentScope), context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 119);
        if (ScriptRuntime.shallowEq(ppll, OptRuntime.zeroObj)) {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "云端音乐"), context, parentScope);
            ScriptRuntime.addInstructionCount(context, 178);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 5);
            if (ScriptRuntime.shallowEq(ppll, OptRuntime.oneObj)) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "云端音乐搜索"), context, parentScope);
                ScriptRuntime.addInstructionCount(context, 63);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                if (ScriptRuntime.shallowEq(ppll, _k21)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "我的收藏"), context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 63);
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 5);
                    if (ScriptRuntime.shallowEq(ppll, _k3)) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "想被圈就点"), context, parentScope);
                        ScriptRuntime.addInstructionCount(context, 63);
                    } else {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 5);
                        if (ScriptRuntime.shallowEq(ppll, _k7)) {
                            ScriptRuntime.addInstructionCount(context, 1);
                            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "设置键位"), context, parentScope);
                            ScriptRuntime.addInstructionCount(context, 63);
                        } else {
                            ScriptRuntime.addInstructionCount(context, 1);
                            ScriptRuntime.addInstructionCount(context, 5);
                            if (ScriptRuntime.shallowEq(ppll, _k24)) {
                                ScriptRuntime.addInstructionCount(context, 1);
                                ScriptRuntime.addInstructionCount(context, 1);
                                ScriptRuntime.addInstructionCount(context, 34);
                                if (ScriptRuntime.shallowEq(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "get", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "是否赠送", context, parentScope), "true")) {
                                    ScriptRuntime.addInstructionCount(context, 1);
                                    OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "别他妈瞎点"), context, parentScope);
                                    ScriptRuntime.addInstructionCount(context, 119);
                                } else {
                                    ScriptRuntime.addInstructionCount(context, 1);
                                    OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "别他妈瞎点"), context, parentScope);
                                    ScriptRuntime.addInstructionCount(context, 39);
                                }
                                ScriptRuntime.addInstructionCount(context, 1);
                            } else {
                                ScriptRuntime.addInstructionCount(context, 1);
                                ScriptRuntime.addInstructionCount(context, 5);
                                if (ScriptRuntime.shallowEq(ppll, _k11)) {
                                    ScriptRuntime.addInstructionCount(context, 1);
                                    ScriptRuntime.addInstructionCount(context, 1);
                                    ScriptRuntime.addInstructionCount(context, 34);
                                    if (ScriptRuntime.shallowEq(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "get", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "是否赠送", context, parentScope), "true")) {
                                        ScriptRuntime.addInstructionCount(context, 1);
                                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "别他妈瞎点"), context, parentScope);
                                        ScriptRuntime.addInstructionCount(context, 119);
                                    } else {
                                        ScriptRuntime.addInstructionCount(context, 1);
                                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "别他妈瞎点"), context, parentScope);
                                        ScriptRuntime.addInstructionCount(context, 39);
                                    }
                                    ScriptRuntime.addInstructionCount(context, 1);
                                } else {
                                    ScriptRuntime.addInstructionCount(context, 1);
                                    ScriptRuntime.addInstructionCount(context, 5);
                                    if (ScriptRuntime.shallowEq(ppll, _k27)) {
                                        ScriptRuntime.addInstructionCount(context, 1);
                                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "加载加群信息"), context, parentScope);
                                        ScriptRuntime.addInstructionCount(context, 63);
                                    } else {
                                        ScriptRuntime.addInstructionCount(context, 1);
                                        ScriptRuntime.addInstructionCount(context, 5);
                                        if (ScriptRuntime.shallowEq(ppll, _k5)) {
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "开启悬浮框状态"), "false", context, parentScope, "开启悬浮框状态");
                                            OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window0"), "close", context, parentScope);
                                            ScriptRuntime.addInstructionCount(context, 66);
                                        }
                                        ScriptRuntime.addInstructionCount(context, 1);
                                    }
                                    ScriptRuntime.addInstructionCount(context, 1);
                                }
                                ScriptRuntime.addInstructionCount(context, 1);
                            }
                            ScriptRuntime.addInstructionCount(context, 1);
                        }
                        ScriptRuntime.addInstructionCount(context, 1);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                }
                ScriptRuntime.addInstructionCount(context, 1);
            }
            ScriptRuntime.addInstructionCount(context, 1);
        }
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj2;
    }

    /* renamed from: _c_想被圈就点_45, reason: contains not printable characters */
    private static Object m13_c__45(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, createFunctionActivation, "guanyuiyewuiiii"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 46)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 112);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_46(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.callProp0(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "res"), "body", context, createFunctionActivation), "string", context, createFunctionActivation), context, createFunctionActivation, "neirong");
            OptRuntime.callSpecial(context, ScriptRuntime.getNameFunctionAndThis("eval", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, createFunctionActivation, "neirong")}, createFunctionActivation, scriptable2, 1, "", 746);
            OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "li")}, "log", context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "所有数据"), ScriptRuntime.name(context, createFunctionActivation, "li"), context, createFunctionActivation, "所有数据");
            OptRuntime.callProp0(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "dialogs"), "build", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObjectLiteral(new Object[]{"title", "positive", "negative", "items", "itemsSelectMode", "itemsSelectedIndex"}, new Object[]{"想被圈就点", "确定", "取消", ScriptRuntime.name(context, createFunctionActivation, "所有数据"), "singleChoice", OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation), "on", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "single_choice", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 47), context, createFunctionActivation, scriptable2), context, createFunctionActivation), "show", context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 327);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_47(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createArrowFunctionActivation = ScriptRuntime.createArrowFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createArrowFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "ggg"), ScriptRuntime.add("open_", OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.name(context, createArrowFunctionActivation, "index"), OptRuntime.oneObj, context)}, "Number", context, createArrowFunctionActivation)), context, createArrowFunctionActivation, "ggg");
            OptRuntime.callSpecial(context, ScriptRuntime.getNameFunctionAndThis("eval", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.add("var ggg= ", ScriptRuntime.name(context, createArrowFunctionActivation, "ggg"))}, createArrowFunctionActivation, scriptable2, 1, "", 759);
            OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createArrowFunctionActivation, "ggg")}, "log", context, createArrowFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "app"), "openUrl", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createArrowFunctionActivation, "ggg"), context, createArrowFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 185);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    /* renamed from: _c_我的收藏_48, reason: contains not printable characters */
    private static Object m14_c__48(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "返回喜欢的内容"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiao"), context, createFunctionActivation), context, createFunctionActivation, "返回喜欢的内容");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "返回喜欢ID"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiaoID"), context, createFunctionActivation), context, createFunctionActivation, "返回喜欢ID");
            OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "返回喜欢ID")}, "log", context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 163);
            if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "返回喜欢的内容"), "")) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "write", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiaoID"), "", context, createFunctionActivation);
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "write", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiao"), "", context, createFunctionActivation);
                OptRuntime.callName(new Object[]{"没有收藏音乐，请添加"}, "toastLog", context, createFunctionActivation);
                OptRuntime.callName0("选择新音乐进行收藏", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 297);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "返回收藏的ID"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("[", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiaoID"), context, createFunctionActivation)), "]"), context, createFunctionActivation), context, createFunctionActivation, "返回收藏的ID");
                OptRuntime.callName(new Object[]{ScriptRuntime.add("返回收藏的ID:", ScriptRuntime.name(context, createFunctionActivation, "返回收藏的ID"))}, "log", context, createFunctionActivation);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "所有数据"), ScriptRuntime.add(ScriptRuntime.add("[", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiao"), context, createFunctionActivation)), "]"), context, createFunctionActivation, "所有数据");
                OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "所有数据")}, "log", context, createFunctionActivation);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "所有数据"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "所有数据"), context, createFunctionActivation), context, createFunctionActivation, "所有数据");
                OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "remove", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "音乐编号", context, createFunctionActivation);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "状态"), "fales", context, createFunctionActivation, "状态");
                OptRuntime.callProp0(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "dialogs"), "build", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObjectLiteral(new Object[]{"title", "positive", "negative", "neutral", "items", "itemsSelectMode", "itemsSelectedIndex"}, new Object[]{"收藏的音乐", "确定", "管理收藏", "新增收藏", ScriptRuntime.name(context, createFunctionActivation, "所有数据"), "singleChoice", OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation), "on", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "single_choice", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 49), context, createFunctionActivation, scriptable2), context, createFunctionActivation), "on", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "neutral", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 50), context, createFunctionActivation, scriptable2), context, createFunctionActivation), "on", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "negative", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 51), context, createFunctionActivation, scriptable2), context, createFunctionActivation), "show", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 559);
            }
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 3);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_49(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 3) {
            objArr = ScriptRuntime.padArguments(objArr, 3);
        }
        Object index = objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "本次所选ID", index, context, parentScope);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "音乐列表类型"), "收藏音乐", context, parentScope, "音乐列表类型");
        _7a9076d6d94e62c13d641aa71f19ae8e nameFunctionAndThis = ScriptRuntime.getNameFunctionAndThis("执行本地喜欢中转", context, parentScope);
        Scriptable lastStoredScriptable = ScriptRuntime.lastStoredScriptable(context);
        if (nameFunctionAndThis instanceof _7a9076d6d94e62c13d641aa71f19ae8e) {
            nameFunctionAndThis = nameFunctionAndThis;
            if (nameFunctionAndThis._id == 58) {
                m19_c__58(nameFunctionAndThis, context, parentScope, lastStoredScriptable, ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "返回收藏的ID"), index, context, parentScope), 0.0d, ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "所有数据"), index, context, parentScope), 0.0d, ScriptRuntime.emptyArgs);
                Object obj3 = Undefined.instance;
                ScriptRuntime.addInstructionCount(context, 220);
                return obj3;
            }
        }
        nameFunctionAndThis.call(context, parentScope, lastStoredScriptable, new Object[]{ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "返回收藏的ID"), index, context, parentScope), ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "所有数据"), index, context, parentScope)});
        Object obj32 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 220);
        return obj32;
    }

    private static Object _c_anonymous_50(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("选择新音乐进行收藏", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_anonymous_51(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("管理收藏", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    /* renamed from: _c_管理收藏_52, reason: contains not printable characters */
    private static Object m22_c__52(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "返回收藏的ID"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("[", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiaoID"), context, createFunctionActivation)), "]"), context, createFunctionActivation), context, createFunctionActivation, "返回收藏的ID");
            OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "返回收藏的ID")}, "log", context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "所有数据"), ScriptRuntime.add(ScriptRuntime.add("[", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiao"), context, createFunctionActivation)), "]"), context, createFunctionActivation, "所有数据");
            OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "所有数据")}, "log", context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "所有数据"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "所有数据"), context, createFunctionActivation), context, createFunctionActivation, "所有数据");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "状态"), "fales", context, createFunctionActivation, "状态");
            OptRuntime.callProp0(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "dialogs"), "build", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObjectLiteral(new Object[]{"title", "positive", "items", "itemsSelectMode"}, new Object[]{"请选择需要移除的音乐", "移除", ScriptRuntime.name(context, createFunctionActivation, "所有数据"), "multiChoice"}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation), "on", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "multi_choice", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 53), context, createFunctionActivation, scriptable2), context, createFunctionActivation), "show", context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 432);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_53(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 2) {
            objArr = ScriptRuntime.padArguments(objArr, 2);
        }
        Object indices = objArr[0];
        Object obj = objArr[1];
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Double i = OptRuntime.zeroObj;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 72);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (!ScriptRuntime.cmp_LT(i, ScriptRuntime.getObjectProp(indices, "length", context, parentScope))) {
                ScriptRuntime.addInstructionCount(context, 26);
                Object obj3 = Undefined.instance;
                ScriptRuntime.addInstructionCount(context, 3);
                return obj3;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            Object str = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "read", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "musilikecliebiaoID"), context, parentScope);
            ScriptRuntime.addInstructionCount(context, 1);
            Object index = ScriptRuntime.getObjectElem(indices, i, context, parentScope);
            ScriptRuntime.addInstructionCount(context, 1);
            Object objectElem = ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "返回收藏的ID"), index, context, parentScope);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 88);
            if (!ScriptRuntime.eq(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(str, "indexOf", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add(",\"", objectElem), "\""), context, parentScope), OptRuntime.minusOneObj)) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                str = OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(str, "replace", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add(",\"", objectElem), "\""), "", context, parentScope);
                ScriptRuntime.addInstructionCount(context, 187);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                if (!ScriptRuntime.eq(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(str, "indexOf", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("\"", objectElem), "\","), context, parentScope), OptRuntime.minusOneObj)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    str = OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(str, "replace", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("\"", objectElem), "\","), "", context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 103);
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 5);
                    if (!ScriptRuntime.eq(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(str, "indexOf", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("\"", objectElem), "\""), context, parentScope), OptRuntime.minusOneObj)) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 1);
                        str = OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(str, "replace", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("\"", objectElem), "\""), "", context, parentScope);
                        ScriptRuntime.addInstructionCount(context, 103);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                }
                ScriptRuntime.addInstructionCount(context, 1);
            }
            OptRuntime.callName(new Object[]{str}, "log", context, parentScope);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "write", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "musilikecliebiaoID"), str, context, parentScope);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "nusicname"), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "所有数据"), index, context, parentScope)}, "String", context, parentScope), context, parentScope, "nusicname");
            ScriptRuntime.addInstructionCount(context, 1);
            Object str2 = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "read", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "musilikecliebiao"), context, parentScope);
            ScriptRuntime.addInstructionCount(context, 1);
            Object name = ScriptRuntime.name(context, parentScope, "nusicname");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 161);
            if (!ScriptRuntime.eq(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(str2, "indexOf", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add(",\"", name), "\""), context, parentScope), OptRuntime.minusOneObj)) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                str2 = OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(str2, "replace", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add(",\"", name), "\""), "", context, parentScope);
                ScriptRuntime.addInstructionCount(context, 261);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                if (!ScriptRuntime.eq(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(str2, "indexOf", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("\"", name), "\","), context, parentScope), OptRuntime.minusOneObj)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    str2 = OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(str2, "replace", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("\"", name), "\","), "", context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 103);
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 5);
                    if (!ScriptRuntime.eq(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(str2, "indexOf", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("\"", name), "\""), context, parentScope), OptRuntime.minusOneObj)) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 1);
                        str2 = OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(str2, "replace", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("\"", name), "\""), "", context, parentScope);
                        ScriptRuntime.addInstructionCount(context, 103);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                }
                ScriptRuntime.addInstructionCount(context, 1);
            }
            OptRuntime.callName(new Object[]{str2}, "log", context, parentScope);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "write", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "musilikecliebiao"), str2, context, parentScope);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "remove", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, parentScope, "likemusic"), ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "返回收藏的ID"), index, context, parentScope), context), ".js"), context, parentScope);
            OptRuntime.callName(new Object[]{"移除成功"}, "toastLog", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 132);
            double number = ScriptRuntime.toNumber(i);
            i = OptRuntime.wrapDouble(1.0d + number);
            OptRuntime.wrapDouble(number);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 22);
        }
    }

    /* renamed from: _c_选择新音乐进行收藏_54, reason: contains not printable characters */
    private static Object m28_c__54(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "所有数据"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musicliebiao"), context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "所有数据");
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "remove", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "音乐编号", context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "状态"), "fales", context, createFunctionActivation, "状态");
            OptRuntime.callProp0(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "dialogs"), "build", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObjectLiteral(new Object[]{"title", "positive", "items", "itemsSelectMode"}, new Object[]{"选择音乐新增收藏", "加入收藏", ScriptRuntime.name(context, createFunctionActivation, "所有数据"), "multiChoice"}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation), "on", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "multi_choice", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 55), context, createFunctionActivation, scriptable2), context, createFunctionActivation), "show", context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 289);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_55(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 3) {
            objArr = ScriptRuntime.padArguments(objArr, 3);
        }
        Object indices = objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        Object obj3 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add("当前操作数组", indices)}, "log", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        Double i = OptRuntime.zeroObj;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 90);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (!ScriptRuntime.cmp_LT(i, OptRuntime.callName(new Object[]{ScriptRuntime.getObjectProp(indices, "length", context, parentScope)}, "Number", context, parentScope))) {
                ScriptRuntime.addInstructionCount(context, 41);
                Object obj4 = Undefined.instance;
                ScriptRuntime.addInstructionCount(context, 3);
                return obj4;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "保存状态"), "false", context, parentScope, "保存状态");
            OptRuntime.callName(new Object[]{OptRuntime.callName(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "get", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "总数量", context, parentScope)) - ScriptRuntime.toNumber(ScriptRuntime.getObjectElem(indices, i, context, parentScope)))}, "Number", context, parentScope)}, "保存喜欢音乐本地化", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 108);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.toBoolean(Boolean.TRUE)) {
                    ScriptRuntime.addInstructionCount(context, 17);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (!ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "保存状态"), "true")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 5);
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 41);
                    break;
                }
            }
            ScriptRuntime.addInstructionCount(context, 1);
            double number = ScriptRuntime.toNumber(i);
            i = OptRuntime.wrapDouble(1.0d + number);
            OptRuntime.wrapDouble(number);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 22);
        }
    }

    /* renamed from: _c_保存喜欢音乐本地化_56, reason: contains not printable characters */
    private static Object m2_c__56(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{ScriptRuntime.add("音乐编号:", ScriptRuntime.name(context, createFunctionActivation, "音乐编号"))}, "log", context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 54);
            if (ScriptRuntime.toBoolean(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "exists", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "likemusiczs"), ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context), ".js"), context, createFunctionActivation)) || ScriptRuntime.toBoolean(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "exists", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "likemusic"), ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context), ".js"), context, createFunctionActivation))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{"该音乐已收藏，请勿重复收藏"}, "toastLog", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 204);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "是否赠送"), "赠送")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "nusicname"), OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "音乐名称")}, "String", context, createFunctionActivation), context, createFunctionActivation, "nusicname");
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "音乐编号"), OptRuntime.callName(new Object[]{ScriptRuntime.add("zs", ScriptRuntime.name(context, createFunctionActivation, "音乐编号"))}, "String", context, createFunctionActivation), context, createFunctionActivation, "音乐编号");
                    OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "createWithDirs", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "likemusic"), ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context), ".js"), context, createFunctionActivation);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "音乐内容")}, "String", context, createFunctionActivation), context, createFunctionActivation, "neirong");
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "返回收藏的ID"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiaoID"), context, createFunctionActivation), context, createFunctionActivation, "返回收藏的ID");
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 314);
                    if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "返回收藏的ID"), "")) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "write", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiaoID"), ScriptRuntime.add(ScriptRuntime.add("\"", ScriptRuntime.name(context, createFunctionActivation, "音乐编号")), "\""), context, createFunctionActivation);
                        ScriptRuntime.addInstructionCount(context, 400);
                    } else {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "append", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiaoID"), ScriptRuntime.add(ScriptRuntime.add(",\"", ScriptRuntime.name(context, createFunctionActivation, "音乐编号")), "\""), context, createFunctionActivation);
                        ScriptRuntime.addInstructionCount(context, 59);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "返回收藏的列表"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiao"), context, createFunctionActivation), context, createFunctionActivation, "返回收藏的列表");
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 60);
                    if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "返回收藏的列表"), "")) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "write", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiao"), ScriptRuntime.add(ScriptRuntime.add("\"", ScriptRuntime.name(context, createFunctionActivation, "nusicname")), "\""), context, createFunctionActivation);
                        ScriptRuntime.addInstructionCount(context, 145);
                    } else {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "append", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiao"), ScriptRuntime.add(ScriptRuntime.add(",\"", ScriptRuntime.name(context, createFunctionActivation, "nusicname")), "\""), context, createFunctionActivation);
                        ScriptRuntime.addInstructionCount(context, 59);
                    }
                    OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "write", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "likemusic"), ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context), ".js"), ScriptRuntime.name(context, createFunctionActivation, "neirong"), context, createFunctionActivation);
                    OptRuntime.callName(new Object[]{"收藏成功"}, "toastLog", context, createFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 79);
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "nusicname"), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectElem(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "音乐列表", context, createFunctionActivation), OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "音乐编号")}, "Number", context, createFunctionActivation), context, createFunctionActivation)}, "String", context, createFunctionActivation), context, createFunctionActivation, "nusicname");
                    OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "createWithDirs", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "likemusic"), ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context), ".js"), context, createFunctionActivation);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
                    OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "请求网络乐谱地址"), ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context), ".js"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 57)}, context, createFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 258);
                }
                ScriptRuntime.addInstructionCount(context, 1);
            }
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "保存状态"), "true", context, createFunctionActivation, "保存状态");
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 23);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_57(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 2) {
            objArr = ScriptRuntime.padArguments(objArr, 2);
        }
        Object res = objArr[0];
        Object obj = objArr[1];
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Object neirong = OptRuntime.callProp0(ScriptRuntime.getObjectProp(res, "body", context, parentScope), "string", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        Object call1 = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "read", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "musilikecliebiaoID"), context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 115);
        if (ScriptRuntime.eq(call1, "")) {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "write", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "musilikecliebiaoID"), ScriptRuntime.add(ScriptRuntime.add("\"", ScriptRuntime.name(context, parentScope, "音乐编号")), "\""), context, parentScope);
            ScriptRuntime.addInstructionCount(context, 194);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "append", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "musilikecliebiaoID"), ScriptRuntime.add(ScriptRuntime.add(",\"", ScriptRuntime.name(context, parentScope, "音乐编号")), "\""), context, parentScope);
            ScriptRuntime.addInstructionCount(context, 59);
        }
        ScriptRuntime.addInstructionCount(context, 1);
        Object call12 = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "read", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "musilikecliebiao"), context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 45);
        if (ScriptRuntime.eq(call12, "")) {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "write", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "musilikecliebiao"), ScriptRuntime.add(ScriptRuntime.add("\"", ScriptRuntime.name(context, parentScope, "nusicname")), "\""), context, parentScope);
            ScriptRuntime.addInstructionCount(context, 124);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "append", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "musilikecliebiao"), ScriptRuntime.add(ScriptRuntime.add(",\"", ScriptRuntime.name(context, parentScope, "nusicname")), "\""), context, parentScope);
            ScriptRuntime.addInstructionCount(context, 59);
        }
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "write", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, parentScope, "likemusic"), ScriptRuntime.name(context, parentScope, "音乐编号"), context), ".js"), neirong, context, parentScope);
        OptRuntime.callName(new Object[]{"收藏成功"}, "toastLog", context, parentScope);
        OptRuntime.callName(new Object[]{ScriptRuntime.name(context, parentScope, "音乐编号"), ScriptRuntime.name(context, parentScope, "是否赠送")}, "log", context, parentScope);
        Object obj3 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 111);
        return obj3;
    }

    /* renamed from: _c_执行本地喜欢中转_58, reason: contains not printable characters */
    private static Object m19_c__58(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object obj, double d, Object obj2, double d2, Object[] objArr) {
        if (obj == Void.TYPE) {
            obj = OptRuntime.wrapDouble(d);
        }
        if (obj2 == Void.TYPE) {
            obj2 = OptRuntime.wrapDouble(d2);
        }
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        Object obj3 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "nusicname"), OptRuntime.callName(new Object[]{obj2}, "String", context, parentScope), context, parentScope, "nusicname");
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "ooooooooo"), _k28, context, parentScope, "ooooooooo");
        ScriptRuntime.addInstructionCount(context, 1);
        Object add = ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, parentScope, "likemusic"), obj, context), ".js");
        ScriptRuntime.addInstructionCount(context, 1);
        Object neirong = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "read", context, parentScope), ScriptRuntime.lastStoredScriptable(context), add, context, parentScope);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "SheetMusic", neirong, context, parentScope);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "路径", ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, parentScope, "likemusic"), obj, context), ".js"), context, parentScope);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "本次的音乐编号", OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(obj, "replace", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.wrapRegExp(context, parentScope, _re58_0), "", context, parentScope), context, parentScope);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "ooooooooo"), _k29, context, parentScope, "ooooooooo");
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "音乐类型"), "别他妈瞎点", context, parentScope, "音乐类型");
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "加载悬浮框"), context, parentScope);
        Object obj4 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 345);
        return obj4;
    }

    /* renamed from: _c_别他妈瞎点_59, reason: contains not printable characters */
    private static Object m3_c__59(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{"五星好评-解锁密码", "", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 60), context, createFunctionActivation, scriptable2)}, "rawInput", context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 67);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 8 */
    private static Object _c_anonymous_60(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 1) {
            objArr = ScriptRuntime.padArguments(objArr, 1);
        }
        Object name = objArr[0];
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 31);
        ScriptRuntime.eq(name, "9977");
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "是否赠送", "true", context, parentScope);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "别他妈瞎点"), context, parentScope);
        ScriptRuntime.addInstructionCount(context, 122);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj;
    }

    /* renamed from: _c_别他妈瞎点_61, reason: contains not printable characters */
    private static Object m4_c__61(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "remove", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "音乐编号", context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "赠送音乐名称"), _7a9076d6d94e62c13d641aa71f19ae8eVar.m5_c__61_literal1(context, createFunctionActivation, scriptable2, objArr), context, createFunctionActivation, "赠送音乐名称");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "状态"), "fales", context, createFunctionActivation, "状态");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "值"), "", context, createFunctionActivation, "值");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "状态"), "fales", context, createFunctionActivation, "状态");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "状态2"), "fales", context, createFunctionActivation, "状态2");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "查找oooo"), "0", context, createFunctionActivation, "查找oooo");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "结果昵称数组"), OptRuntime.newArrayLiteral(ScriptRuntime.emptyArgs, (String) null, 0, context, createFunctionActivation), context, createFunctionActivation, "结果昵称数组");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "结果编号数组"), OptRuntime.newArrayLiteral(ScriptRuntime.emptyArgs, (String) null, 0, context, createFunctionActivation), context, createFunctionActivation, "结果编号数组");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "最大值"), OptRuntime.callName(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "最大值", context, createFunctionActivation)) - ScriptRuntime.toNumber(OptRuntime.oneObj))}, "Number", context, createFunctionActivation), context, createFunctionActivation, "最大值");
            OptRuntime.callName(new Object[]{"请输入歌名", "", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 62), context, createFunctionActivation, scriptable2)}, "rawInput", context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 349);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_62(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 1) {
            objArr = ScriptRuntime.padArguments(objArr, 1);
        }
        Object name = objArr[0];
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 44);
        if (ScriptRuntime.shallowEq(name, "") || name == null) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "值"), "空值", context, parentScope, "值");
            OptRuntime.callName(new Object[]{"暂无此歌曲"}, "alert", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 116);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "关键词", OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(name, "replace", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.wrapRegExp(context, parentScope, _re62_0), "", context, parentScope), context, parentScope);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "状态"), "trues", context, parentScope, "状态");
            ScriptRuntime.addInstructionCount(context, 1);
            Double index = OptRuntime.zeroObj;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 116);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(index, ScriptRuntime.name(context, parentScope, "最大值"))) {
                    ScriptRuntime.addInstructionCount(context, 24);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.toBoolean(ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "状态"), "trues", context, parentScope, "状态"))) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    Object name2 = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "get", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "关键词", context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 1);
                    Object call2 = OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.callName(new Object[]{ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "赠送音乐名称"), index, context, parentScope)}, "String", context, parentScope), "replace", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.wrapRegExp(context, parentScope, _re62_1), "", context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 154);
                    if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "值"), "空值")) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 186);
                        break;
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 5);
                    if (ScriptRuntime.toBoolean(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(call2, "match", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObject(ScriptRuntime.name(context, parentScope, "RegExp"), context, parentScope, new Object[]{name2, "ig"}), context, parentScope))) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "结果昵称数组"), "push", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "赠送音乐名称"), index, context, parentScope)}, "String", context, parentScope), context, parentScope);
                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "结果编号数组"), "push", context, parentScope), ScriptRuntime.lastStoredScriptable(context), index, context, parentScope);
                        ScriptRuntime.nameIncrDecr(parentScope, "查找oooo", context, 2);
                        ScriptRuntime.addInstructionCount(context, 165);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                if (ScriptRuntime.shallowEq(ScriptRuntime.add(index, OptRuntime.oneObj, context), ScriptRuntime.name(context, parentScope, "最大值"))) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "状态2"), "trues", context, parentScope, "状态2");
                    ScriptRuntime.addInstructionCount(context, 61);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                double number = ScriptRuntime.toNumber(index);
                index = OptRuntime.wrapDouble(1.0d + number);
                OptRuntime.wrapDouble(number);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 22);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            Double index2 = OptRuntime.zeroObj;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 23);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(index2, _k16)) {
                    ScriptRuntime.addInstructionCount(context, 19);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "值"), "空值")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 41);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "状态2"), "trues")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 40);
                    if (ScriptRuntime.cmp_LT(OptRuntime.zeroObj, ScriptRuntime.name(context, parentScope, "查找oooo")) && !ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "值"), "空值")) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "别他妈瞎点"), context, parentScope);
                        ScriptRuntime.addInstructionCount(context, 126);
                    } else {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.callName(new Object[]{"暂无此歌曲"}, "alert", context, parentScope);
                        ScriptRuntime.addInstructionCount(context, 24);
                    }
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.callName(new Object[]{_k22}, "sleep", context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 24);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    double number2 = ScriptRuntime.toNumber(index2);
                    index2 = OptRuntime.wrapDouble(1.0d + number2);
                    OptRuntime.wrapDouble(number2);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 22);
                }
            }
            ScriptRuntime.addInstructionCount(context, 1);
        }
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj2;
    }

    /* renamed from: _c_别他妈瞎点_63, reason: contains not printable characters */
    private static Object m6_c__63(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "状态"), "fales", context, createFunctionActivation, "状态");
            OptRuntime.callProp0(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "dialogs"), "build", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObjectLiteral(new Object[]{"title", "positive", "negative", "items", "itemsSelectMode", "itemsSelectedIndex"}, new Object[]{ScriptRuntime.add(ScriptRuntime.add("云端音乐(", ScriptRuntime.name(context, createFunctionActivation, "查找oooo")), ")"), "确定", "取消", ScriptRuntime.name(context, createFunctionActivation, "结果昵称数组"), "singleChoice", OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation), "on", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "single_choice", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 64), context, createFunctionActivation, scriptable2), context, createFunctionActivation), "show", context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 228);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_64(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 3) {
            objArr = ScriptRuntime.padArguments(objArr, 3);
        }
        Object index = objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        ScriptRuntime.addInstructionCount(context, 1);
        _7a9076d6d94e62c13d641aa71f19ae8e nameFunctionAndThis = ScriptRuntime.getNameFunctionAndThis("执行本地中转", context, parentScope);
        Scriptable lastStoredScriptable = ScriptRuntime.lastStoredScriptable(context);
        if (nameFunctionAndThis instanceof _7a9076d6d94e62c13d641aa71f19ae8e) {
            nameFunctionAndThis = nameFunctionAndThis;
            if (nameFunctionAndThis._id == 81) {
                m18_c__81(nameFunctionAndThis, context, parentScope, lastStoredScriptable, ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "结果编号数组"), index, context, parentScope), 0.0d, ScriptRuntime.emptyArgs);
                Object obj3 = Undefined.instance;
                ScriptRuntime.addInstructionCount(context, 135);
                return obj3;
            }
        }
        nameFunctionAndThis.call(context, parentScope, lastStoredScriptable, new Object[]{ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "结果编号数组"), index, context, parentScope)});
        Object obj32 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 135);
        return obj32;
    }

    /* renamed from: _c_别他妈瞎点_65, reason: contains not printable characters */
    private static Object m7_c__65(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "赠送音乐名称"), _7a9076d6d94e62c13d641aa71f19ae8eVar.m8_c__65_literal1(context, createFunctionActivation, scriptable2, objArr), context, createFunctionActivation, "赠送音乐名称");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "状态"), "fales", context, createFunctionActivation, "状态");
            OptRuntime.callProp0(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "dialogs"), "build", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObjectLiteral(new Object[]{"title", "positive", "negative", "items", "itemsSelectMode", "itemsSelectedIndex"}, new Object[]{"别他妈瞎点(530)", "确定", "取消", ScriptRuntime.name(context, createFunctionActivation, "赠送音乐名称"), "singleChoice", OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation), "on", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "single_choice", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 66), context, createFunctionActivation, scriptable2), context, createFunctionActivation), "show", context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 237);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_66(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 3) {
            objArr = ScriptRuntime.padArguments(objArr, 3);
        }
        Object index = objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        ScriptRuntime.addInstructionCount(context, 1);
        _7a9076d6d94e62c13d641aa71f19ae8e nameFunctionAndThis = ScriptRuntime.getNameFunctionAndThis("执行本地中转", context, parentScope);
        Scriptable lastStoredScriptable = ScriptRuntime.lastStoredScriptable(context);
        if (nameFunctionAndThis instanceof _7a9076d6d94e62c13d641aa71f19ae8e) {
            nameFunctionAndThis = nameFunctionAndThis;
            if (nameFunctionAndThis._id == 81) {
                m18_c__81(nameFunctionAndThis, context, parentScope, lastStoredScriptable, index, 0.0d, ScriptRuntime.emptyArgs);
                Object obj3 = Undefined.instance;
                ScriptRuntime.addInstructionCount(context, 109);
                return obj3;
            }
        }
        nameFunctionAndThis.call(context, parentScope, lastStoredScriptable, new Object[]{index});
        Object obj32 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 109);
        return obj32;
    }

    /* renamed from: _c_设置键位_67, reason: contains not printable characters */
    private static Object m25_c__67(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callProp0(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "dialogs"), "build", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObjectLiteral(new Object[]{"title", "content", "positive", "negative"}, new Object[]{"提示", "1、请根据提示设置键位\n2、如果键位不完整没有15个，自动演奏时会报错\n3、设置成功后键位信息会自动保存到本地", "确定", "取消"}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation), "on", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "positive", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 68), context, createFunctionActivation, scriptable2), context, createFunctionActivation), "on", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "negative", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 69), context, createFunctionActivation, scriptable2), context, createFunctionActivation), "show", context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 197);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_68(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "createWithDirs", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "jianweixinxi"), context, parentScope);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "位置"), ScriptRuntime.name(context, parentScope, "jianweixinxi"), context, parentScope, "位置");
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "remove", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "位置"), context, parentScope);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "录入键位坐标"), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 135);
        return obj;
    }

    private static Object _c_anonymous_69(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 8);
        return obj;
    }

    /* renamed from: _c_录入键位坐标_70, reason: contains not printable characters */
    private static Object m12_c__70(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "w"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "floaty"), "rawWindow", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObject(ScriptRuntime.name(context, createFunctionActivation, "XML"), context, createFunctionActivation, new Object[]{"<frame id=\"top\" gravity=\"center\" bg=\"#333333\" alpha=\"0.3\">\n            <text id=\"bn\" textStyle=\"bold\" text='请点击第1个键位' gravity=\"center_horizontal\" textSize=\"18sp\" marginBottom=\"-100\" bg=\"#333333\" textColor='#fcfcfc' h=\"auto\" />\n        </frame>"}), context, createFunctionActivation), context, createFunctionActivation, "w");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ii"), "1", context, createFunctionActivation, "ii");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "w"), "setSize", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.minusOneObj, OptRuntime.minusOneObj, context, createFunctionActivation);
            OptRuntime.callName(new Object[]{OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 71), context, createFunctionActivation, scriptable2), _k22}, "setInterval", context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "w"), "top", context, createFunctionActivation), "setOnTouchListener", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 72), context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 228);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_71(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 8);
        return obj;
    }

    private static Object _c_anonymous_72(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 2) {
            objArr = ScriptRuntime.padArguments(objArr, 2);
        }
        Object obj = objArr[0];
        Object event = objArr[1];
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 37);
        if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectProp(event, "ACTION_DOWN", context, parentScope), OptRuntime.callProp0(event, "getAction", context, parentScope))) {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "w"), "setTouchable", context, parentScope), ScriptRuntime.lastStoredScriptable(context), Boolean.TRUE, context, parentScope);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "time"), ScriptRuntime.newObject(ScriptRuntime.name(context, parentScope, "Date"), context, parentScope, ScriptRuntime.emptyArgs), context, parentScope, "time");
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "x_start"), OptRuntime.callProp0(event, "getRawX", context, parentScope), context, parentScope, "x_start");
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "y_start"), OptRuntime.callProp0(event, "getRawY", context, parentScope), context, parentScope, "y_start");
            OptRuntime.callName(new Object[]{OptRuntime.callName(new Object[]{ScriptRuntime.name(context, parentScope, "ii")}, "String", context, parentScope), OptRuntime.callName(new Object[]{ScriptRuntime.name(context, parentScope, "x_start")}, "String", context, parentScope), OptRuntime.callName(new Object[]{ScriptRuntime.name(context, parentScope, "y_start")}, "String", context, parentScope)}, "记录坐标", context, parentScope);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "ii"), OptRuntime.callName(new Object[]{ScriptRuntime.add(OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "ii"))), OptRuntime.oneObj, context)}, "Number", context, parentScope), context, parentScope, "ii");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 270);
            if (ScriptRuntime.cmp_LE("16", OptRuntime.callName(new Object[]{ScriptRuntime.name(context, parentScope, "ii")}, "Number", context, parentScope))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{"键位设置成功，还有问题打开乐器截图去相册设置！"}, "toastLog", context, parentScope);
                OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "w"), "close", context, parentScope);
                ScriptRuntime.addInstructionCount(context, 354);
            }
            Boolean bool = Boolean.TRUE;
            ScriptRuntime.addInstructionCount(context, 3);
            return bool;
        }
        ScriptRuntime.addInstructionCount(context, 73);
        Boolean bool2 = Boolean.TRUE;
        ScriptRuntime.addInstructionCount(context, 3);
        return bool2;
    }

    /* renamed from: _c_记录坐标_73, reason: contains not printable characters */
    private static Object m24_c__73(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "key"), "-"), ScriptRuntime.name(context, createFunctionActivation, "downX"), context), "-"), ScriptRuntime.name(context, createFunctionActivation, "downY"), context)}, "log", context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 84);
            if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "key"), "1")) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "append", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "位置"), ScriptRuntime.add(ScriptRuntime.add("x=[", ScriptRuntime.name(context, createFunctionActivation, "downX")), ","), context, createFunctionActivation);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "Y坐标1"), ScriptRuntime.name(context, createFunctionActivation, "downY"), context, createFunctionActivation, "Y坐标1");
                ScriptRuntime.addInstructionCount(context, 194);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "key"), "2")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "append", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "位置"), ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "downX"), ","), context, createFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 83);
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 5);
                    if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "key"), "3")) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "append", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "位置"), ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "downX"), ","), context, createFunctionActivation);
                        ScriptRuntime.addInstructionCount(context, 83);
                    } else {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 5);
                        if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "key"), "4")) {
                            ScriptRuntime.addInstructionCount(context, 1);
                            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "append", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "位置"), ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "downX"), ","), context, createFunctionActivation);
                            ScriptRuntime.addInstructionCount(context, 83);
                        } else {
                            ScriptRuntime.addInstructionCount(context, 1);
                            ScriptRuntime.addInstructionCount(context, 5);
                            if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "key"), "5")) {
                                ScriptRuntime.addInstructionCount(context, 1);
                                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "append", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "位置"), ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "downX"), "]\ny=["), ScriptRuntime.name(context, createFunctionActivation, "Y坐标1"), context), ","), context, createFunctionActivation);
                                ScriptRuntime.addInstructionCount(context, 101);
                            } else {
                                ScriptRuntime.addInstructionCount(context, 1);
                                ScriptRuntime.addInstructionCount(context, 5);
                                if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "key"), "6")) {
                                    ScriptRuntime.addInstructionCount(context, 1);
                                    OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "append", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "位置"), ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "downY"), ","), context, createFunctionActivation);
                                    ScriptRuntime.addInstructionCount(context, 83);
                                } else {
                                    ScriptRuntime.addInstructionCount(context, 1);
                                    ScriptRuntime.addInstructionCount(context, 5);
                                    if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "key"), "11")) {
                                        ScriptRuntime.addInstructionCount(context, 1);
                                        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "append", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "位置"), ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "downY"), "]"), context, createFunctionActivation);
                                        ScriptRuntime.addInstructionCount(context, 83);
                                    }
                                    ScriptRuntime.addInstructionCount(context, 1);
                                }
                                ScriptRuntime.addInstructionCount(context, 1);
                            }
                            ScriptRuntime.addInstructionCount(context, 1);
                        }
                        ScriptRuntime.addInstructionCount(context, 1);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                }
                ScriptRuntime.addInstructionCount(context, 1);
            }
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "ui"), "run", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 74), context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 40);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_74(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "w"), "bn", context, parentScope), "setText", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("请点击第", OptRuntime.callName(new Object[]{ScriptRuntime.add(OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "key"))), OptRuntime.oneObj, context)}, "Number", context, parentScope)), "个键位"), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 90);
        return obj;
    }

    /* renamed from: _c_云端音乐搜索_75, reason: contains not printable characters */
    private static Object m1_c__75(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "remove", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "音乐编号", context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "所有数据"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musicliebiao"), context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "所有数据");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "值"), "", context, createFunctionActivation, "值");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "状态"), "fales", context, createFunctionActivation, "状态");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "状态2"), "fales", context, createFunctionActivation, "状态2");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "查找oooo"), "0", context, createFunctionActivation, "查找oooo");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "结果昵称数组"), OptRuntime.newArrayLiteral(ScriptRuntime.emptyArgs, (String) null, 0, context, createFunctionActivation), context, createFunctionActivation, "结果昵称数组");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "结果编号数组"), OptRuntime.newArrayLiteral(ScriptRuntime.emptyArgs, (String) null, 0, context, createFunctionActivation), context, createFunctionActivation, "结果编号数组");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "最大值"), OptRuntime.callName(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "最大值", context, createFunctionActivation)) - ScriptRuntime.toNumber(OptRuntime.oneObj))}, "Number", context, createFunctionActivation), context, createFunctionActivation, "最大值");
            OptRuntime.callName(new Object[]{"请输入歌名", "", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 76), context, createFunctionActivation, scriptable2)}, "rawInput", context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 378);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_76(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 1) {
            objArr = ScriptRuntime.padArguments(objArr, 1);
        }
        Object name = objArr[0];
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 48);
        if (ScriptRuntime.shallowEq(name, "") || name == null) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "值"), "空值", context, parentScope, "值");
            OptRuntime.callName(new Object[]{"暂无此歌曲"}, "alert", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 120);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "关键词", OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(name, "replace", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.wrapRegExp(context, parentScope, _re76_0), "", context, parentScope), context, parentScope);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "状态"), "trues", context, parentScope, "状态");
            ScriptRuntime.addInstructionCount(context, 1);
            Double index = OptRuntime.zeroObj;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 116);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(index, ScriptRuntime.name(context, parentScope, "最大值"))) {
                    ScriptRuntime.addInstructionCount(context, 24);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.toBoolean(ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "状态"), "trues", context, parentScope, "状态"))) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    Object name2 = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "get", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "关键词", context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 1);
                    Object call2 = OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.callName(new Object[]{ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "所有数据"), index, context, parentScope)}, "String", context, parentScope), "replace", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.wrapRegExp(context, parentScope, _re76_1), "", context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 154);
                    if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "值"), "空值")) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 186);
                        break;
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 5);
                    if (ScriptRuntime.toBoolean(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(call2, "match", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObject(ScriptRuntime.name(context, parentScope, "RegExp"), context, parentScope, new Object[]{name2, "ig"}), context, parentScope))) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "结果昵称数组"), "push", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "所有数据"), index, context, parentScope)}, "String", context, parentScope), context, parentScope);
                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "结果编号数组"), "push", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "最大值")) - ScriptRuntime.toNumber(index)), context, parentScope);
                        ScriptRuntime.nameIncrDecr(parentScope, "查找oooo", context, 2);
                        ScriptRuntime.addInstructionCount(context, 183);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                if (ScriptRuntime.shallowEq(ScriptRuntime.add(index, OptRuntime.oneObj, context), ScriptRuntime.name(context, parentScope, "最大值"))) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "状态2"), "trues", context, parentScope, "状态2");
                    ScriptRuntime.addInstructionCount(context, 61);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                double number = ScriptRuntime.toNumber(index);
                index = OptRuntime.wrapDouble(1.0d + number);
                OptRuntime.wrapDouble(number);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 22);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            Double index2 = OptRuntime.zeroObj;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 23);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(index2, _k16)) {
                    ScriptRuntime.addInstructionCount(context, 19);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "值"), "空值")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 41);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "状态2"), "trues")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 40);
                    if (ScriptRuntime.cmp_LT(OptRuntime.zeroObj, ScriptRuntime.name(context, parentScope, "查找oooo")) && !ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "值"), "空值")) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "get", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "音乐编号", context, parentScope);
                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "播放云端音乐搜索"), context, parentScope);
                        ScriptRuntime.addInstructionCount(context, 161);
                    } else {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.callName(new Object[]{"暂无此歌曲"}, "alert", context, parentScope);
                        ScriptRuntime.addInstructionCount(context, 24);
                    }
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.callName(new Object[]{_k22}, "sleep", context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 24);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    double number2 = ScriptRuntime.toNumber(index2);
                    index2 = OptRuntime.wrapDouble(1.0d + number2);
                    OptRuntime.wrapDouble(number2);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 22);
                }
            }
            ScriptRuntime.addInstructionCount(context, 1);
        }
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj2;
    }

    /* renamed from: _c_播放云端音乐搜索_77, reason: contains not printable characters */
    private static Object m20_c__77(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "状态"), "fales", context, createFunctionActivation, "状态");
            OptRuntime.callProp0(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "dialogs"), "build", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObjectLiteral(new Object[]{"title", "positive", "negative", "items", "itemsSelectMode", "itemsSelectedIndex"}, new Object[]{ScriptRuntime.add(ScriptRuntime.add("云端音乐(", ScriptRuntime.name(context, createFunctionActivation, "查找oooo")), ")"), "确定", "取消", ScriptRuntime.name(context, createFunctionActivation, "结果昵称数组"), "singleChoice", OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation), "on", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "single_choice", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 78), context, createFunctionActivation, scriptable2), context, createFunctionActivation), "show", context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 228);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_78(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 3) {
            objArr = ScriptRuntime.padArguments(objArr, 3);
        }
        Object index = objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "结果编号数组"), index, context, parentScope)}, "执行开始中转", context, parentScope);
        Object obj3 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 72);
        return obj3;
    }

    /* renamed from: _c_云端音乐_79, reason: contains not printable characters */
    private static Object m0_c__79(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "所有数据"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musicliebiao"), context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "所有数据");
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "remove", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "音乐编号", context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "状态"), "fales", context, createFunctionActivation, "状态");
            OptRuntime.callProp0(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "dialogs"), "build", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObjectLiteral(new Object[]{"title", "positive", "negative", "items", "itemsSelectMode", "itemsSelectedIndex"}, new Object[]{ScriptRuntime.add(ScriptRuntime.add("云端音乐(", ScriptRuntime.add(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "总数量", context, createFunctionActivation), _k30, context)), ")"), "确定", "取消", ScriptRuntime.name(context, createFunctionActivation, "所有数据"), "singleChoice", OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation), "on", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "single_choice", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 80), context, createFunctionActivation, scriptable2), context, createFunctionActivation), "show", context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 359);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_80(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 3) {
            objArr = ScriptRuntime.padArguments(objArr, 3);
        }
        Object index = objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{OptRuntime.callName(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "get", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "总数量", context, parentScope)) - ScriptRuntime.toNumber(index))}, "Number", context, parentScope)}, "执行开始中转", context, parentScope);
        Object obj3 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 112);
        return obj3;
    }

    /* renamed from: _c_执行本地中转_81, reason: contains not printable characters */
    private static Object m18_c__81(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object obj, double d, Object[] objArr) {
        if (obj == Void.TYPE) {
            obj = OptRuntime.wrapDouble(d);
        }
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "nusicname"), ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "赠送音乐名称"), OptRuntime.callName(new Object[]{obj}, "Number", context, parentScope), context, parentScope), context, parentScope, "nusicname");
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "ooooooooo"), _k28, context, parentScope, "ooooooooo");
        ScriptRuntime.addInstructionCount(context, 1);
        Object add = ScriptRuntime.add(ScriptRuntime.add("zengsongmusic/", OptRuntime.callName(new Object[]{OptRuntime.add(OptRuntime.wrapDouble(ScriptRuntime.toNumber(obj)), 1.0d)}, "Number", context, parentScope)), ".php");
        ScriptRuntime.addInstructionCount(context, 1);
        Object neirong = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "read", context, parentScope), ScriptRuntime.lastStoredScriptable(context), add, context, parentScope);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "SheetMusic", neirong, context, parentScope);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "本次的音乐编号", OptRuntime.callName(new Object[]{OptRuntime.add(OptRuntime.wrapDouble(ScriptRuntime.toNumber(obj)), 1.0d)}, "Number", context, parentScope), context, parentScope);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "ooooooooo"), _k29, context, parentScope, "ooooooooo");
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "音乐类型"), "别他妈瞎点", context, parentScope, "音乐类型");
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "音乐列表类型"), "别他妈瞎点", context, parentScope, "音乐列表类型");
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "put", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "路径", ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, parentScope, "likemusiczs"), OptRuntime.callName(new Object[]{OptRuntime.add(OptRuntime.wrapDouble(ScriptRuntime.toNumber(obj)), 1.0d)}, "Number", context, parentScope), context), ".js"), context, parentScope);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "threads"), "start", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "加载悬浮框"), context, parentScope);
        Object obj3 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 419);
        return obj3;
    }

    /* renamed from: _c_执行开始中转_82, reason: contains not printable characters */
    private static Object m16_c__82(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "音乐编号", ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "nusicname"), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectElem(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "音乐列表", context, createFunctionActivation), OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "音乐编号")}, "Number", context, createFunctionActivation), context, createFunctionActivation)}, "String", context, createFunctionActivation), context, createFunctionActivation, "nusicname");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "路径", ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "likemusic"), ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context), ".js"), context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "音乐编号")}, "log", context, createFunctionActivation);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次的音乐编号", ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context, createFunctionActivation);
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "请求网络乐谱地址"), ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context), ".js"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 83)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 371);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0137, code lost:
    
        org.mozilla.javascript.ScriptRuntime.addInstructionCount(r15, 1);
        org.mozilla.javascript.ScriptRuntime.addInstructionCount(r15, 104);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object _c_anonymous_83(org.autojs.autojspro.gen._7a9076d6d94e62c13d641aa71f19ae8e r14, org.mozilla.javascript.Context r15, org.mozilla.javascript.Scriptable r16, org.mozilla.javascript.Scriptable r17, java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.autojs.autojspro.gen._7a9076d6d94e62c13d641aa71f19ae8e._c_anonymous_83(org.autojs.autojspro.gen._7a9076d6d94e62c13d641aa71f19ae8e, org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: _c_执行云端音乐循环中转_84, reason: contains not printable characters */
    private static Object m15_c__84(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "音乐编号", ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "nusicname"), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectElem(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "音乐列表", context, createFunctionActivation), OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "音乐编号")}, "Number", context, createFunctionActivation), context, createFunctionActivation)}, "String", context, createFunctionActivation), context, createFunctionActivation, "nusicname");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "nusicname", ScriptRuntime.name(context, createFunctionActivation, "nusicname"), context, createFunctionActivation);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "路径", ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "likemusic"), ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context), ".js"), context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "音乐编号")}, "log", context, createFunctionActivation);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次的音乐编号", ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context, createFunctionActivation);
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "请求网络乐谱地址"), ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context), ".js"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 85)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 408);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x019c, code lost:
    
        org.mozilla.javascript.ScriptRuntime.addInstructionCount(r11, 1);
        r9 = org.mozilla.javascript.ScriptRuntime.leaveWith(r9);
        org.mozilla.javascript.ScriptRuntime.addInstructionCount(r11, 182);
        r4 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object _c_anonymous_85(org.autojs.autojspro.gen._7a9076d6d94e62c13d641aa71f19ae8e r10, org.mozilla.javascript.Context r11, org.mozilla.javascript.Scriptable r12, org.mozilla.javascript.Scriptable r13, java.lang.Object[] r14) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.autojs.autojspro.gen._7a9076d6d94e62c13d641aa71f19ae8e._c_anonymous_85(org.autojs.autojspro.gen._7a9076d6d94e62c13d641aa71f19ae8e, org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: _c_执行收藏音乐循环中转_86, reason: contains not printable characters */
    private static Object m17_c__86(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "nusicname"), OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "音乐昵称")}, "String", context, createFunctionActivation), context, createFunctionActivation, "nusicname");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "nusicname", ScriptRuntime.name(context, createFunctionActivation, "nusicname"), context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "位置文件"), ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "likemusic"), ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context), ".js"), context, createFunctionActivation, "位置文件");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "位置文件"), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "SheetMusic", ScriptRuntime.name(context, createFunctionActivation, "neirong"), context, createFunctionActivation);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "路径", ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "likemusic"), ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), context), ".js"), context, createFunctionActivation);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次的音乐编号", OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "音乐编号"), "replace", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.wrapRegExp(context, createFunctionActivation, _re86_0), "", context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k29, context, createFunctionActivation, "ooooooooo");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "音乐类型"), "别他妈瞎点", context, createFunctionActivation, "音乐类型");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "音乐列表类型"), "收藏音乐", context, createFunctionActivation, "音乐列表类型");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "返回数组"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "SheetMusic", context, createFunctionActivation), context, createFunctionActivation, "返回数组");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 491);
            if (ScriptRuntime.toBoolean(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "返回数组"), "match", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "SheetMusic", context, createFunctionActivation))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callSpecial(context, ScriptRuntime.getNameFunctionAndThis("eval", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "SheetMusic", context, createFunctionActivation)}, createFunctionActivation, scriptable2, 1, "", 1289);
                ScriptRuntime.addInstructionCount(context, 601);
            }
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 3);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    /* renamed from: _c_加载悬浮框_87, reason: contains not printable characters */
    private static Object m11_c__87(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 108), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 110), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 111), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 112), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 113), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 114), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 115), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 116), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 117), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 118), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 119), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 120), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 121), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 122), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 123), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 124), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 125), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 126), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 127), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 128), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 129), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 130), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 131), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 132), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 133), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 134), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 135), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 136), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 137), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 138), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 139), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 140), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 141), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 142), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 143), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 144), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 145), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 146), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 147), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 148), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 149), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 150), 1, createFunctionActivation, context);
            OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 151), 1, createFunctionActivation, context);
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "返回数组"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "SheetMusic", context, createFunctionActivation), context, createFunctionActivation, "返回数组");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 834);
            if (ScriptRuntime.toBoolean(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "返回数组"), "match", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "SheetMusic", context, createFunctionActivation))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "SheetMusic", context, createFunctionActivation)}, "log", context, createFunctionActivation);
                OptRuntime.callSpecial(context, ScriptRuntime.getNameFunctionAndThis("eval", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "SheetMusic", context, createFunctionActivation)}, createFunctionActivation, scriptable2, 1, "", 1299);
                ScriptRuntime.addInstructionCount(context, 988);
            }
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "颜色"), "#FFFFFF", context, createFunctionActivation, "颜色");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "透明度"), "0.6", context, createFunctionActivation, "透明度");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "字体颜色"), "#000000", context, createFunctionActivation, "字体颜色");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "中间按钮"), "file://images/A1.png", context, createFunctionActivation, "中间按钮");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "windowWidth"), OptRuntime.callProp0(ScriptRuntime.name(context, createFunctionActivation, "window0"), "getWidth", context, createFunctionActivation), context, createFunctionActivation, "windowWidth");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "windowHeight"), OptRuntime.callProp0(ScriptRuntime.name(context, createFunctionActivation, "window0"), "getHeight", context, createFunctionActivation), context, createFunctionActivation, "windowHeight");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "window0"), "setSize", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.oneObj, OptRuntime.oneObj, context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "参数控制台高度"), "680", context, createFunctionActivation, "参数控制台高度");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "悬浮窗是否隐藏"), "false", context, createFunctionActivation, "悬浮窗是否隐藏");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "录屏模式"), "已关闭", context, createFunctionActivation, "录屏模式");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "window1"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "floaty"), "rawWindow", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObject(ScriptRuntime.name(context, createFunctionActivation, "XML"), context, createFunctionActivation, new Object[]{ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add("<frame id=\"xuanfukuang\" alpha=\"1\" h=\"auto\">\n            <vertical>\n                <horizontal h=\"40\" alpha=\"{{透明度}}\">\n                    <frame bg=\"{{颜色}}\" margin=\"0 0 1 0\" w=\"40\" h=\"40\" gravity=\"center\">\n                        <img id=\"tubiao\" w=\"40\" h=\"40\" src=\"file://images/3720.png\"/>\n                    </frame>\n                    <frame bg=\"{{颜色}}\" h=\"40\" margin=\"1 0 0 0\" layout_weight=\"1\">\n                        <TextView\n                            id=\"nusicname\"\n                            singleLine=\"true\"\n                            ellipsize=\"marquee\"\n                            focusable=\"true\"\n                            gravity=\"center\"\n                            layout_weight=\"1\"\n                            text=\"《{{nusicname}}》\"\n                            textColor=\"#ff010100\" />\n                        ", ScriptRuntime.add(ScriptRuntime.add("\"", ScriptRuntime.escapeAttributeValue("", context)), "\"")), "\n                    </frame>\n                </horizontal>\n\n                <frame bg=\"{{颜色}}\" alpha=\"{{透明度}}\" margin=\"0 1 0 0\">\n                    <vertical>\n                        <seekbar id=\"seek\" margin=\"2 6 2 6\" gravity=\"center\" />\n                        <text id=\"jd\" text=\"0/0\" textStyle=\"bold\" textColor='{{字体颜色}}' gravity=\"center\" marginBottom='0' paddingTop='0' marginTop='-12' marginLeft='0' textSize=\"13sp\" />\n                    </vertical>\n                </frame>\n\n                <frame margin=\"0 1 0 0\" bg=\"{{颜色}}\" alpha=\"{{透明度}}\">\n                    <horizontal h=\"40\" gravity=\"center\">\n                        <img id=\"shangyishou\" margin=\"7 0\" w=\"30\" h=\"30\" src=\"file://images/A2.png\" />\n                        <img id=\"action21\" margin=\"7 0\" w=\"30\" h=\"30\" src=\"file://images/A1.png\" />\n                        <img id=\"xiayishou\" margin=\"7 0\" w=\"30\" h=\"30\" src=\"file://images/A3.png\" />\n                    </horizontal>\n                </frame>\n\n                "), ScriptRuntime.escapeTextValue("", context), context), "\n                <horizontal h=\"50\" alpha=\"{{透明度}}\">\n                    <button id=\"speedLow\" text='太快了啦' textStyle=\"bold\" h=\"50\" margin=\"0 1 1 0\" gravity=\"center\" bg=\"{{颜色}}\" textSize=\"13sp\" textColor='{{字体颜色}}' layout_weight=\"1\" />\n                    <horizontal h=\"50\" layout_weight=\"1\" margin=\"1 1 1 1\" >\n                        <button id=\"speed\" text='' h=\"50\" textStyle=\"bold\" gravity=\"center\" bg=\"{{颜色}}\" textSize=\"10sp\" textColor='{{字体颜色}}' />\n                    </horizontal>\n                    <button id=\"speedHigh\" text='快一点啦' textStyle=\"bold\" h=\"50\" margin=\"1 1 0 1\" gravity=\"center\" bg=\"{{颜色}}\" textSize=\"13sp\" textColor='{{字体颜色}}' layout_weight=\"1\" />\n                </horizontal>\n                <horizontal alpha=\"{{透明度}}\">\n                    <button id=\"toumingdu\" text='看不见我' textStyle=\"bold\" h=\"40\" margin=\"0 1 1 0\" gravity=\"center\" bg=\"{{颜色}}\" w=\"80\" textSize=\"13sp\" textColor='{{字体颜色}}' layout_weight=\"1\" />\n                    <button id=\"stop\" text='弹完啦' textStyle=\"bold\" h=\"40\" margin=\"1 1 0 0\" gravity=\"center\" bg=\"{{颜色}}\" w=\"80\" textSize=\"13sp\" textColor='{{字体颜色}}' layout_weight=\"1\" />\n                </horizontal>\n\n                "), ScriptRuntime.escapeTextValue("", context), context), "\n                <horizontal alpha=\"{{透明度}}\">\n                    <text visibility=\"gone\" id=\"moshi1\" text='单曲播放' margin=\"0 1 1 0\" textStyle=\"bold\" h=\"30\" gravity=\"center\" textSize=\"13sp\" textColor='#fcfcfc' layout_weight=\"1\" bg=\"#77005588\" />\n                    <img id=\"moshi\" h=\"30\" src=\"file://images/danqu.png\" margin=\"0 1 1 0\" gravity=\"center\" bg=\"{{颜色}}\" w=\"80\" textSize=\"13sp\" textColor='{{字体颜色}}' layout_weight=\"1\" />\n                    <img id=\"shoucang\" h=\"30\" src=\"file://images/A5.png\" margin=\"1 1 0 0\" gravity=\"center\" bg=\"{{颜色}}\" w=\"80\" textSize=\"13sp\" textColor='{{字体颜色}}' layout_weight=\"1\" />\n                    <text visibility=\"gone\" id=\"shoucang\" text='加入收藏' margin=\"1 1 0 0\" textStyle=\"bold\" h=\"30\" gravity=\"center\" textSize=\"13sp\" textColor='{{字体颜色}}' layout_weight=\"1\" bg=\"{{颜色}}\" />\n                    "), ScriptRuntime.add(ScriptRuntime.add("\"", ScriptRuntime.escapeAttributeValue("", context)), "\""), context), "\n                </horizontal>\n            </vertical>\n        </frame>")}), context, createFunctionActivation), context, createFunctionActivation, "window1");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "模式"), "单曲播放", context, createFunctionActivation, "模式");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "是否收藏"), "未收藏", context, createFunctionActivation, "是否收藏");
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "nusicname", context, createFunctionActivation), "setSelected", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), Boolean.TRUE, context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "speed", context, createFunctionActivation), "setText", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "速度\nx1", context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "tubiao", context, createFunctionActivation), "click", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 88), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "shangyishou", context, createFunctionActivation), "click", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 89), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "xiayishou", context, createFunctionActivation), "click", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 94), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "action21", context, createFunctionActivation), "click", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 95), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "speedHigh", context, createFunctionActivation), "click", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 96), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "speedLow", context, createFunctionActivation), "click", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 97), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "stop", context, createFunctionActivation), "click", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 98), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "toumingdu", context, createFunctionActivation), "click", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 99), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "shoucang", context, createFunctionActivation), "click", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 101), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add("当前编号：", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次的音乐编号", context, createFunctionActivation)), "类型："), ScriptRuntime.name(context, createFunctionActivation, "音乐类型"), context)}, "log", context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "moshi", context, createFunctionActivation), "click", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 102), context, createFunctionActivation, scriptable2), context, createFunctionActivation);
            OptRuntime.callName(new Object[]{OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "路径", context, createFunctionActivation)}, "log", context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "ui"), "run", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 103), context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "x0"), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "device"), "height", context, createFunctionActivation), context, createFunctionActivation, "x0");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "y0"), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "device"), "width", context, createFunctionActivation), context, createFunctionActivation, "y0");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1253);
            if (ScriptRuntime.cmp_LT(ScriptRuntime.name(context, createFunctionActivation, "x0"), ScriptRuntime.name(context, createFunctionActivation, "y0"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "leixing"), ScriptRuntime.name(context, createFunctionActivation, "y0"), context, createFunctionActivation, "leixing");
                ScriptRuntime.addInstructionCount(context, 1316);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "leixing"), ScriptRuntime.name(context, createFunctionActivation, "x0"), context, createFunctionActivation, "leixing");
                ScriptRuntime.addInstructionCount(context, 30);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 10);
            if (ScriptRuntime.cmp_LT(ScriptRuntime.name(context, createFunctionActivation, "y0"), ScriptRuntime.name(context, createFunctionActivation, "x0"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "leixing"), ScriptRuntime.name(context, createFunctionActivation, "x0"), context, createFunctionActivation, "leixing");
                ScriptRuntime.addInstructionCount(context, 72);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "leixing"), ScriptRuntime.name(context, createFunctionActivation, "y0"), context, createFunctionActivation, "leixing");
                ScriptRuntime.addInstructionCount(context, 30);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 10);
            if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "leixing"), OptRuntime.zeroObj)) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{"获取不到屏幕分辨率。"}, "toast", context, createFunctionActivation);
                OptRuntime.callName0("exit", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 69);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "bili"), OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "leixing")) / ScriptRuntime.toNumber(_k31)), context, createFunctionActivation, "bili");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "w0x"), OptRuntime.wrapDouble(ScriptRuntime.toNumber(_k23) * ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "bili"))), context, createFunctionActivation, "w0x");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "w0y"), OptRuntime.wrapDouble(ScriptRuntime.toNumber(_k32) * ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "bili"))), context, createFunctionActivation, "w0y");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "window1"), "setSize", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.wrapDouble(ScriptRuntime.toNumber(_k33) * ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "bili"))), OptRuntime.callProp0(ScriptRuntime.name(context, createFunctionActivation, "window1"), "getHeight", context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "参数控制台高度"), OptRuntime.callProp0(ScriptRuntime.name(context, createFunctionActivation, "window1"), "getHeight", context, createFunctionActivation), context, createFunctionActivation, "参数控制台高度");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "window1"), "setPosition", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "w0x"), ScriptRuntime.name(context, createFunctionActivation, "w0y"), context, createFunctionActivation);
            OptRuntime.callProp0(ScriptRuntime.name(context, createFunctionActivation, "events"), "observeKey", context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 284);
            if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "ui"), "监控下键", context, createFunctionActivation), "checked", context, createFunctionActivation), Boolean.TRUE) || ScriptRuntime.shallowEq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "ui"), "录屏模式", context, createFunctionActivation), "checked", context, createFunctionActivation), Boolean.TRUE)) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "ui"), "run", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 104), context, createFunctionActivation);
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "events"), "onKeyDown", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "volume_down", new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 105), context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 445);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "seek", context, createFunctionActivation), "setOnSeekBarChangeListener", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObject(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "android"), "widget", context, createFunctionActivation), "SeekBar", context, createFunctionActivation), "OnSeekBarChangeListener", context, createFunctionActivation), context, createFunctionActivation, new Object[]{ScriptRuntime.newObjectLiteral(new Object[]{"onProgressChanged"}, new Object[]{new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 109)}, (int[]) null, context, createFunctionActivation)}), context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "progressNow"), OptRuntime.zeroObj, context, createFunctionActivation, "progressNow");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "s"), OptRuntime.zeroObj, context, createFunctionActivation, "s");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "speedControl"), _k34, context, createFunctionActivation, "speedControl");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "time"), _k35, context, createFunctionActivation, "time");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "time1"), _k36, context, createFunctionActivation, "time1");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "time2"), _k37, context, createFunctionActivation, "time2");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "stopp"), OptRuntime.zeroObj, context, createFunctionActivation, "stopp");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "zuobiaoPath"), ScriptRuntime.name(context, createFunctionActivation, "jianweixinxi"), context, createFunctionActivation, "zuobiaoPath");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "zuobiaoPathX"), "/storage/emulated/0/脚本/files/CoordinatesX", context, createFunctionActivation, "zuobiaoPathX");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "zuobiaoPathY"), "/storage/emulated/0/脚本/files/CoordinatesY", context, createFunctionActivation, "zuobiaoPathY");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 372);
            if (ScriptRuntime.toBoolean(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "exists", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "zuobiaoPath"), context, createFunctionActivation))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callSpecial(context, ScriptRuntime.getNameFunctionAndThis("eval", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "zuobiaoPath"), context, createFunctionActivation)}, createFunctionActivation, scriptable2, 1, "", 1656);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 497);
                if (!ScriptRuntime.eq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "ui"), "录屏模式", context, createFunctionActivation), "checked", context, createFunctionActivation), Boolean.TRUE)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.callName(new Object[]{"如果音乐弹奏得不对请重新设置键位。"}, "toastLog", context, createFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 564);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (!ScriptRuntime.eq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "ui"), "录屏模式", context, createFunctionActivation), "checked", context, createFunctionActivation), Boolean.TRUE)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.callName(new Object[]{"键位未设置，已自动适配手机，如果无法正常弹奏请去设置键位！"}, "toastLog", context, createFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 76);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{_k38, _k31}, "setScreenMetrics", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "x"), OptRuntime.newArrayLiteral(new Object[]{_k39, _k40, _k41, _k42, _k43}, (String) null, 0, context, createFunctionActivation), context, createFunctionActivation, "x");
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "y"), OptRuntime.newArrayLiteral(new Object[]{_k44, _k45, _k46}, (String) null, 0, context, createFunctionActivation), context, createFunctionActivation, "y");
                ScriptRuntime.addInstructionCount(context, 144);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 5);
            if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "ui"), "国服", context, createFunctionActivation), "checked", context, createFunctionActivation), Boolean.TRUE)) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{"按压时间国服"}, "log", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "按压时间"), "1", context, createFunctionActivation, "按压时间");
                ScriptRuntime.addInstructionCount(context, 95);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "ui"), "国际服", context, createFunctionActivation), "checked", context, createFunctionActivation), Boolean.TRUE)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.callName(new Object[]{"按压时间国际服"}, "log", context, createFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "按压时间"), "50", context, createFunctionActivation, "按压时间");
                    ScriptRuntime.addInstructionCount(context, 95);
                }
                ScriptRuntime.addInstructionCount(context, 1);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callProp0(ScriptRuntime.name(context, createFunctionActivation, "events"), "observeKey", context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 122);
            if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "ui"), "监控上键", context, createFunctionActivation), "checked", context, createFunctionActivation), Boolean.TRUE)) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "events"), "onKeyDown", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "volume_up", new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 154), context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 210);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 5);
            if (ScriptRuntime.eq(ScriptRuntime.getObjectPropNoWarn(ScriptRuntime.name(context, createFunctionActivation, "SheetMusic"), "length", context, createFunctionActivation), ScriptRuntime.name(context, createFunctionActivation, "undefined"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{"歌曲异常"}, "toastLog", context, createFunctionActivation);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "s"), OptRuntime.zeroObj, context, createFunctionActivation, "s");
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "stopp"), OptRuntime.oneObj, context, createFunctionActivation, "stopp");
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "音乐列表类型"), "", context, createFunctionActivation, "音乐列表类型");
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "window0"), "setSize", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "windowWidth"), ScriptRuntime.name(context, createFunctionActivation, "windowHeight"), context, createFunctionActivation);
                OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "events"), "removeAllKeyDownListeners", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "volume_down", context, createFunctionActivation);
                OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "events"), "removeAllKeyUpListeners", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "volume_down", context, createFunctionActivation);
                OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "events"), "removeAllKeyDownListeners", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "volume_up", context, createFunctionActivation);
                OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "events"), "removeAllKeyUpListeners", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "volume_up", context, createFunctionActivation);
                OptRuntime.callProp0(ScriptRuntime.name(context, createFunctionActivation, "window1"), "close", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 302);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{ScriptRuntime.add("SheetMusic.length", ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "SheetMusic"), "length", context, createFunctionActivation))}, "log", context, createFunctionActivation);
                OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "seek", context, createFunctionActivation), "setMax", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "SheetMusic"), "length", context, createFunctionActivation), context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 93);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "i"), OptRuntime.zeroObj, context, createFunctionActivation, "i");
            ScriptRuntime.addInstructionCount(context, 30);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(ScriptRuntime.name(context, createFunctionActivation, "i"), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "SheetMusic"), "length", context, createFunctionActivation))) {
                    ScriptRuntime.addInstructionCount(context, 38);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{ScriptRuntime.add("s=", ScriptRuntime.name(context, createFunctionActivation, "s"))}, "log", context, createFunctionActivation);
                OptRuntime.callName(new Object[]{ScriptRuntime.add("i=", ScriptRuntime.name(context, createFunctionActivation, "i"))}, "log", context, createFunctionActivation);
                OptRuntime.callName(new Object[]{ScriptRuntime.add("音乐列表类型=", ScriptRuntime.name(context, createFunctionActivation, "音乐列表类型"))}, "log", context, createFunctionActivation);
                OptRuntime.callName(new Object[]{ScriptRuntime.add("progressNow=", ScriptRuntime.name(context, createFunctionActivation, "progressNow"))}, "log", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 130);
                if (!ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "stopp"), OptRuntime.zeroObj)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "s"), OptRuntime.zeroObj, context, createFunctionActivation, "s");
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "音乐列表类型"), "", context, createFunctionActivation, "音乐列表类型");
                    OptRuntime.callProp0(ScriptRuntime.name(context, createFunctionActivation, "window1"), "close", context, createFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 219);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "progressNow"), ScriptRuntime.name(context, createFunctionActivation, "i"))) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "seek", context, createFunctionActivation), "setProgress", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "i"), context, createFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 47);
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "i"), ScriptRuntime.name(context, createFunctionActivation, "progressNow"), context, createFunctionActivation, "i");
                    ScriptRuntime.addInstructionCount(context, 71);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                if (ScriptRuntime.cmp_LE(OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "SheetMusic"), "length", context, createFunctionActivation)) - ScriptRuntime.toNumber(OptRuntime.oneObj)), ScriptRuntime.name(context, createFunctionActivation, "i")) || ScriptRuntime.cmp_LE(ScriptRuntime.name(context, createFunctionActivation, "i"), OptRuntime.zeroObj)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 87);
                    if (ScriptRuntime.cmp_LE(OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "SheetMusic"), "length", context, createFunctionActivation)) - ScriptRuntime.toNumber(OptRuntime.oneObj)), ScriptRuntime.name(context, createFunctionActivation, "i"))) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 150);
                        if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "模式"), "单曲播放")) {
                            ScriptRuntime.addInstructionCount(context, 1);
                            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "s"), ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "i"), ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "progressNow"), OptRuntime.zeroObj, context, createFunctionActivation, "progressNow"), context, createFunctionActivation, "i"), context, createFunctionActivation, "s");
                            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "ui"), "run", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 155), context, createFunctionActivation);
                            ScriptRuntime.addInstructionCount(context, 272);
                        } else {
                            ScriptRuntime.addInstructionCount(context, 1);
                            ScriptRuntime.addInstructionCount(context, 5);
                            if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "模式"), "单曲循环")) {
                                ScriptRuntime.addInstructionCount(context, 1);
                                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "i"), ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "progressNow"), OptRuntime.zeroObj, context, createFunctionActivation, "progressNow"), context, createFunctionActivation, "i");
                                ScriptRuntime.addInstructionCount(context, 71);
                            } else {
                                ScriptRuntime.addInstructionCount(context, 1);
                                ScriptRuntime.addInstructionCount(context, 5);
                                if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "模式"), "全部循环")) {
                                    ScriptRuntime.addInstructionCount(context, 1);
                                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "s"), ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "i"), ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "progressNow"), OptRuntime.zeroObj, context, createFunctionActivation, "progressNow"), context, createFunctionActivation, "i"), context, createFunctionActivation, "s");
                                    ScriptRuntime.addInstructionCount(context, 1);
                                    ScriptRuntime.addInstructionCount(context, 92);
                                    if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "音乐列表类型"), "收藏音乐")) {
                                        ScriptRuntime.addInstructionCount(context, 1);
                                        ScriptRuntime.addInstructionCount(context, 1);
                                        ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "返回收藏的ID"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("[", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiaoID"), context, createFunctionActivation)), "]"), context, createFunctionActivation), context, createFunctionActivation, "返回收藏的ID");
                                        ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "所有数据"), ScriptRuntime.add(ScriptRuntime.add("[", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiao"), context, createFunctionActivation)), "]"), context, createFunctionActivation, "所有数据");
                                        ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "所有数据"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "所有数据"), context, createFunctionActivation), context, createFunctionActivation, "所有数据");
                                        ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "本次的ID"), OptRuntime.callName(new Object[]{ScriptRuntime.add(OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次所选ID", context, createFunctionActivation))), OptRuntime.oneObj, context)}, "Number", context, createFunctionActivation), context, createFunctionActivation, "本次的ID");
                                        OptRuntime.callName(new Object[]{ScriptRuntime.add("返回收藏的ID", ScriptRuntime.name(context, createFunctionActivation, "返回收藏的ID"))}, "log", context, createFunctionActivation);
                                        OptRuntime.callName(new Object[]{ScriptRuntime.add("所有数据", ScriptRuntime.name(context, createFunctionActivation, "所有数据"))}, "log", context, createFunctionActivation);
                                        OptRuntime.callName(new Object[]{ScriptRuntime.add("本次的ID", ScriptRuntime.name(context, createFunctionActivation, "本次的ID"))}, "log", context, createFunctionActivation);
                                        ScriptRuntime.addInstructionCount(context, 1);
                                        ScriptRuntime.addInstructionCount(context, 495);
                                        if (ScriptRuntime.cmp_LT(OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "返回收藏的ID"), "length", context, createFunctionActivation)))) - ScriptRuntime.toNumber(OptRuntime.oneObj)), ScriptRuntime.name(context, createFunctionActivation, "本次的ID"))) {
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "下次的ID"), "0", context, createFunctionActivation, "下次的ID");
                                            ScriptRuntime.addInstructionCount(context, 585);
                                        } else {
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "下次的ID"), ScriptRuntime.name(context, createFunctionActivation, "本次的ID"), context, createFunctionActivation, "下次的ID");
                                            ScriptRuntime.addInstructionCount(context, 35);
                                        }
                                        OptRuntime.callName(new Object[]{ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createFunctionActivation, "返回收藏的ID"), ScriptRuntime.name(context, createFunctionActivation, "下次的ID"), context, createFunctionActivation), ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createFunctionActivation, "所有数据"), ScriptRuntime.name(context, createFunctionActivation, "下次的ID"), context, createFunctionActivation)}, "执行收藏音乐循环中转", context, createFunctionActivation);
                                        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次所选ID", ScriptRuntime.name(context, createFunctionActivation, "下次的ID"), context, createFunctionActivation);
                                        OptRuntime.callName0("t5", context, createFunctionActivation);
                                        ScriptRuntime.addInstructionCount(context, 1);
                                        ScriptRuntime.addInstructionCount(context, 112);
                                        while (true) {
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "ooooooooo"), _k29)) {
                                                break;
                                            }
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.addInstructionCount(context, 10);
                                        }
                                        ScriptRuntime.addInstructionCount(context, 25);
                                        OptRuntime.callName0("更新控制台信息", context, createFunctionActivation);
                                        OptRuntime.callName0("t5", context, createFunctionActivation);
                                        ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "s"), OptRuntime.oneObj, context, createFunctionActivation, "s");
                                        ScriptRuntime.addInstructionCount(context, 38);
                                    } else {
                                        ScriptRuntime.addInstructionCount(context, 1);
                                        ScriptRuntime.addInstructionCount(context, 5);
                                        if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "音乐列表类型"), "云端音乐")) {
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.addInstructionCount(context, 40);
                                            if (ScriptRuntime.shallowEq(OptRuntime.callName(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次的音乐编号", context, createFunctionActivation)))) - ScriptRuntime.toNumber(OptRuntime.oneObj))}, "Number", context, createFunctionActivation), "0")) {
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "下次编号"), OptRuntime.callName(new Object[]{OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "总数量", context, createFunctionActivation)}, "Number", context, createFunctionActivation), context, createFunctionActivation, "下次编号");
                                                ScriptRuntime.addInstructionCount(context, 190);
                                            } else {
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "下次编号"), OptRuntime.callName(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次的音乐编号", context, createFunctionActivation)))) - ScriptRuntime.toNumber(OptRuntime.oneObj))}, "Number", context, createFunctionActivation), context, createFunctionActivation, "下次编号");
                                                ScriptRuntime.addInstructionCount(context, 89);
                                            }
                                            OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "下次编号")}, "执行云端音乐循环中转", context, createFunctionActivation);
                                            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "put", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次的音乐编号", ScriptRuntime.name(context, createFunctionActivation, "下次编号"), context, createFunctionActivation);
                                            OptRuntime.callName0("t5", context, createFunctionActivation);
                                            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "progressNow"), OptRuntime.zeroObj, context, createFunctionActivation, "progressNow");
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.addInstructionCount(context, 95);
                                            while (true) {
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "ooooooooo"), _k29)) {
                                                    break;
                                                }
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.addInstructionCount(context, 10);
                                            }
                                            ScriptRuntime.addInstructionCount(context, 25);
                                            OptRuntime.callName0("更新控制台信息", context, createFunctionActivation);
                                            OptRuntime.callName0("t5", context, createFunctionActivation);
                                            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "s"), OptRuntime.oneObj, context, createFunctionActivation, "s");
                                            ScriptRuntime.addInstructionCount(context, 38);
                                        }
                                        ScriptRuntime.addInstructionCount(context, 1);
                                    }
                                    ScriptRuntime.addInstructionCount(context, 1);
                                } else {
                                    ScriptRuntime.addInstructionCount(context, 1);
                                    ScriptRuntime.addInstructionCount(context, 5);
                                    if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "模式"), "全部随机")) {
                                        ScriptRuntime.addInstructionCount(context, 1);
                                        ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "s"), ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "i"), ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "progressNow"), OptRuntime.zeroObj, context, createFunctionActivation, "progressNow"), context, createFunctionActivation, "i"), context, createFunctionActivation, "s");
                                        ScriptRuntime.addInstructionCount(context, 1);
                                        ScriptRuntime.addInstructionCount(context, 92);
                                        if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "音乐列表类型"), "收藏音乐")) {
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "返回收藏的ID"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("[", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiaoID"), context, createFunctionActivation)), "]"), context, createFunctionActivation), context, createFunctionActivation, "返回收藏的ID");
                                            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "所有数据"), ScriptRuntime.add(ScriptRuntime.add("[", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "files"), "read", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "musilikecliebiao"), context, createFunctionActivation)), "]"), context, createFunctionActivation, "所有数据");
                                            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "所有数据"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "所有数据"), context, createFunctionActivation), context, createFunctionActivation, "所有数据");
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "本次的ID"), OptRuntime.callName(new Object[]{OptRuntime.zeroObj, OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "返回收藏的ID"), "length", context, createFunctionActivation)) - ScriptRuntime.toNumber(OptRuntime.oneObj))}, "random", context, createFunctionActivation), context, createFunctionActivation, "本次的ID");
                                            OptRuntime.callName(new Object[]{ScriptRuntime.add("返回收藏的ID", ScriptRuntime.name(context, createFunctionActivation, "返回收藏的ID"))}, "log", context, createFunctionActivation);
                                            OptRuntime.callName(new Object[]{ScriptRuntime.add("所有数据", ScriptRuntime.name(context, createFunctionActivation, "所有数据"))}, "log", context, createFunctionActivation);
                                            OptRuntime.callName(new Object[]{ScriptRuntime.add("本次的ID", ScriptRuntime.name(context, createFunctionActivation, "本次的ID"))}, "log", context, createFunctionActivation);
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.addInstructionCount(context, 494);
                                            if (ScriptRuntime.cmp_LT(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "返回收藏的ID"), "length", context, createFunctionActivation), ScriptRuntime.name(context, createFunctionActivation, "本次的ID"))) {
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "下次的ID"), OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "本次的ID")) - ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "返回收藏的ID"), "length", context, createFunctionActivation))), context, createFunctionActivation, "下次的ID");
                                                ScriptRuntime.addInstructionCount(context, 596);
                                            } else {
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "下次的ID"), ScriptRuntime.name(context, createFunctionActivation, "本次的ID"), context, createFunctionActivation, "下次的ID");
                                                ScriptRuntime.addInstructionCount(context, 35);
                                            }
                                            OptRuntime.callName(new Object[]{ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createFunctionActivation, "返回收藏的ID"), ScriptRuntime.name(context, createFunctionActivation, "下次的ID"), context, createFunctionActivation), ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createFunctionActivation, "所有数据"), ScriptRuntime.name(context, createFunctionActivation, "下次的ID"), context, createFunctionActivation)}, "执行收藏音乐循环中转", context, createFunctionActivation);
                                            OptRuntime.callName0("t5", context, createFunctionActivation);
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.addInstructionCount(context, 75);
                                            while (true) {
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "ooooooooo"), _k29)) {
                                                    break;
                                                }
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.addInstructionCount(context, 10);
                                            }
                                            ScriptRuntime.addInstructionCount(context, 25);
                                            OptRuntime.callName0("更新控制台信息", context, createFunctionActivation);
                                            OptRuntime.callName0("t5", context, createFunctionActivation);
                                            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "s"), OptRuntime.oneObj, context, createFunctionActivation, "s");
                                            ScriptRuntime.addInstructionCount(context, 38);
                                        } else {
                                            ScriptRuntime.addInstructionCount(context, 1);
                                            ScriptRuntime.addInstructionCount(context, 5);
                                            if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "音乐列表类型"), "云端音乐")) {
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "下次编号"), OptRuntime.callName(new Object[]{OptRuntime.oneObj, OptRuntime.callName(new Object[]{OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "storage"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "总数量", context, createFunctionActivation)}, "Number", context, createFunctionActivation)}, "random", context, createFunctionActivation), context, createFunctionActivation, "下次编号");
                                                OptRuntime.callName(new Object[]{OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createFunctionActivation, "下次编号")}, "Number", context, createFunctionActivation)}, "执行云端音乐循环中转", context, createFunctionActivation);
                                                OptRuntime.callName0("t5", context, createFunctionActivation);
                                                ScriptRuntime.addInstructionCount(context, 1);
                                                ScriptRuntime.addInstructionCount(context, 174);
                                                while (true) {
                                                    ScriptRuntime.addInstructionCount(context, 1);
                                                    if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "ooooooooo"), _k29)) {
                                                        break;
                                                    }
                                                    ScriptRuntime.addInstructionCount(context, 1);
                                                    ScriptRuntime.addInstructionCount(context, 1);
                                                    ScriptRuntime.addInstructionCount(context, 10);
                                                }
                                                ScriptRuntime.addInstructionCount(context, 25);
                                                OptRuntime.callName0("更新控制台信息", context, createFunctionActivation);
                                                OptRuntime.callName0("t5", context, createFunctionActivation);
                                                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "s"), OptRuntime.oneObj, context, createFunctionActivation, "s");
                                                ScriptRuntime.addInstructionCount(context, 38);
                                            }
                                            ScriptRuntime.addInstructionCount(context, 1);
                                        }
                                        ScriptRuntime.addInstructionCount(context, 1);
                                    }
                                    ScriptRuntime.addInstructionCount(context, 1);
                                }
                                ScriptRuntime.addInstructionCount(context, 1);
                            }
                            ScriptRuntime.addInstructionCount(context, 1);
                        }
                        ScriptRuntime.addInstructionCount(context, 1);
                    } else {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "s"), ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "i"), ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "progressNow"), OptRuntime.zeroObj, context, createFunctionActivation, "progressNow"), context, createFunctionActivation, "i"), context, createFunctionActivation, "s");
                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "ui"), "run", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 156), context, createFunctionActivation);
                        OptRuntime.callName0("t3", context, createFunctionActivation);
                        ScriptRuntime.addInstructionCount(context, 104);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                }
                OptRuntime.callSpecial(context, ScriptRuntime.getNameFunctionAndThis("eval", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createFunctionActivation, "SheetMusic"), ScriptRuntime.name(context, createFunctionActivation, "i"), context, createFunctionActivation)}, createFunctionActivation, scriptable2, 1, "", 1880);
                ScriptRuntime.nameIncrDecr(createFunctionActivation, "progressNow", context, 2);
                ScriptRuntime.addInstructionCount(context, 64);
                ScriptRuntime.nameIncrDecr(createFunctionActivation, "i", context, 2);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 15);
            }
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 3);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_88(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "window1"), "setSize", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.wrapDouble(ScriptRuntime.toNumber(_k33) * ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "bili"))), ScriptRuntime.name(context, parentScope, "参数控制台高度"), context, parentScope);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "toumingdu", context, parentScope), "setText", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "点击隐藏", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 100);
        return obj;
    }

    private static Object _c_anonymous_89(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createArrowFunctionActivation = ScriptRuntime.createArrowFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createArrowFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
            if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createArrowFunctionActivation, "音乐列表类型"), "收藏音乐")) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "progressNow"), OptRuntime.zeroObj, context, createArrowFunctionActivation, "progressNow");
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "window1"), "moshi", context, createArrowFunctionActivation), "attr", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/xunhuan.png", context, createArrowFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "返回收藏的ID"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "JSON"), "parse", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("[", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "files"), "read", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createArrowFunctionActivation, "musilikecliebiaoID"), context, createArrowFunctionActivation)), "]"), context, createArrowFunctionActivation), context, createArrowFunctionActivation, "返回收藏的ID");
                ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "所有数据"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "JSON"), "parse", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add("[", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "files"), "read", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createArrowFunctionActivation, "musilikecliebiao"), context, createArrowFunctionActivation)), "]"), context, createArrowFunctionActivation), context, createArrowFunctionActivation, "所有数据");
                OptRuntime.callName(new Object[]{ScriptRuntime.add("返回收藏的ID--", ScriptRuntime.name(context, createArrowFunctionActivation, "返回收藏的ID"))}, "log", context, createArrowFunctionActivation);
                OptRuntime.callName(new Object[]{ScriptRuntime.add("所有数据--", ScriptRuntime.name(context, createArrowFunctionActivation, "所有数据"))}, "log", context, createArrowFunctionActivation);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "本次的ID"), OptRuntime.callName(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "storage"), "get", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次所选ID", context, createArrowFunctionActivation)))) - ScriptRuntime.toNumber(OptRuntime.oneObj))}, "Number", context, createArrowFunctionActivation), context, createArrowFunctionActivation, "本次的ID");
                OptRuntime.callName(new Object[]{ScriptRuntime.add("返回收藏的ID", ScriptRuntime.name(context, createArrowFunctionActivation, "返回收藏的ID"))}, "log", context, createArrowFunctionActivation);
                OptRuntime.callName(new Object[]{ScriptRuntime.add("所有数据", ScriptRuntime.name(context, createArrowFunctionActivation, "所有数据"))}, "log", context, createArrowFunctionActivation);
                OptRuntime.callName(new Object[]{ScriptRuntime.add("本次的ID", ScriptRuntime.name(context, createArrowFunctionActivation, "本次的ID"))}, "log", context, createArrowFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 533);
                if (ScriptRuntime.cmp_LT(ScriptRuntime.name(context, createArrowFunctionActivation, "本次的ID"), OptRuntime.zeroObj)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "下次的ID"), OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "返回收藏的ID"), "length", context, createArrowFunctionActivation)))) - ScriptRuntime.toNumber(OptRuntime.oneObj)), context, createArrowFunctionActivation, "下次的ID");
                    ScriptRuntime.addInstructionCount(context, 622);
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "下次的ID"), ScriptRuntime.name(context, createArrowFunctionActivation, "本次的ID"), context, createArrowFunctionActivation, "下次的ID");
                    ScriptRuntime.addInstructionCount(context, 35);
                }
                OptRuntime.callName(new Object[]{ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createArrowFunctionActivation, "返回收藏的ID"), ScriptRuntime.name(context, createArrowFunctionActivation, "下次的ID"), context, createArrowFunctionActivation), ScriptRuntime.getObjectElem(ScriptRuntime.name(context, createArrowFunctionActivation, "所有数据"), ScriptRuntime.name(context, createArrowFunctionActivation, "下次的ID"), context, createArrowFunctionActivation)}, "执行收藏音乐循环中转", context, createArrowFunctionActivation);
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "storage"), "put", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次所选ID", ScriptRuntime.name(context, createArrowFunctionActivation, "下次的ID"), context, createArrowFunctionActivation);
                OptRuntime.callName(new Object[]{new _7a9076d6d94e62c13d641aa71f19ae8e(createArrowFunctionActivation, context, 90), _k37}, "setTimeout", context, createArrowFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 136);
                while (true) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    if (ScriptRuntime.eq(ScriptRuntime.name(context, createArrowFunctionActivation, "ooooooooo"), _k29)) {
                        break;
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 10);
                }
                ScriptRuntime.addInstructionCount(context, 25);
                OptRuntime.callName0("更新控制台信息", context, createArrowFunctionActivation);
                OptRuntime.callName(new Object[]{new _7a9076d6d94e62c13d641aa71f19ae8e(createArrowFunctionActivation, context, 91), _k37}, "setTimeout", context, createArrowFunctionActivation);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "s"), OptRuntime.oneObj, context, createArrowFunctionActivation, "s");
                OptRuntime.callName(new Object[]{"播放上一首"}, "toastLog", context, createArrowFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 81);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createArrowFunctionActivation, "音乐列表类型"), "云端音乐")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "progressNow"), OptRuntime.zeroObj, context, createArrowFunctionActivation, "progressNow");
                    OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "window1"), "moshi", context, createArrowFunctionActivation), "attr", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/xunhuan.png", context, createArrowFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 100);
                    if (ScriptRuntime.shallowEq(OptRuntime.callName(new Object[]{ScriptRuntime.add(OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "storage"), "get", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次的音乐编号", context, createArrowFunctionActivation))), OptRuntime.oneObj, context)}, "Number", context, createArrowFunctionActivation), "0")) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "下次编号"), OptRuntime.callName(new Object[]{OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "storage"), "get", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "总数量", context, createArrowFunctionActivation)}, "Number", context, createArrowFunctionActivation), context, createArrowFunctionActivation, "下次编号");
                        ScriptRuntime.addInstructionCount(context, 244);
                    } else {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "下次编号"), OptRuntime.callName(new Object[]{ScriptRuntime.add(OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "storage"), "get", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次的音乐编号", context, createArrowFunctionActivation))), OptRuntime.oneObj, context)}, "Number", context, createArrowFunctionActivation), context, createArrowFunctionActivation, "下次编号");
                        ScriptRuntime.addInstructionCount(context, 83);
                    }
                    OptRuntime.callName(new Object[]{ScriptRuntime.name(context, createArrowFunctionActivation, "下次编号")}, "执行云端音乐循环中转", context, createArrowFunctionActivation);
                    OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "storage"), "put", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "本次的音乐编号", ScriptRuntime.name(context, createArrowFunctionActivation, "下次编号"), context, createArrowFunctionActivation);
                    OptRuntime.callName(new Object[]{new _7a9076d6d94e62c13d641aa71f19ae8e(createArrowFunctionActivation, context, 92), _k37}, "setTimeout", context, createArrowFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 99);
                    while (true) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        if (ScriptRuntime.eq(ScriptRuntime.name(context, createArrowFunctionActivation, "ooooooooo"), _k29)) {
                            break;
                        }
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 10);
                    }
                    ScriptRuntime.addInstructionCount(context, 25);
                    OptRuntime.callName0("更新控制台信息", context, createArrowFunctionActivation);
                    OptRuntime.callName(new Object[]{new _7a9076d6d94e62c13d641aa71f19ae8e(createArrowFunctionActivation, context, 93), _k37}, "setTimeout", context, createArrowFunctionActivation);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "s"), OptRuntime.oneObj, context, createArrowFunctionActivation, "s");
                    OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "window1"), "action21", context, createArrowFunctionActivation), "attr", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/A6.png", context, createArrowFunctionActivation);
                    OptRuntime.callName(new Object[]{"播放上一首"}, "toastLog", context, createArrowFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 121);
                }
                ScriptRuntime.addInstructionCount(context, 1);
            }
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 3);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_90(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 8);
        return obj;
    }

    private static Object _c_anonymous_91(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 8);
        return obj;
    }

    private static Object _c_anonymous_92(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 8);
        return obj;
    }

    private static Object _c_anonymous_93(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 8);
        return obj;
    }

    private static Object _c_anonymous_94(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "音乐列表类型"), "收藏音乐")) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "模式"), "全部循环", context, parentScope, "模式");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "moshi", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/xunhuan.png", context, parentScope);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "progressNow"), OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "SheetMusic"), "length", context, parentScope)) - ScriptRuntime.toNumber(OptRuntime.oneObj)), context, parentScope, "progressNow");
            OptRuntime.callName0("更新控制台信息", context, parentScope);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "s"), OptRuntime.oneObj, context, parentScope, "s");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "action21", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/A6.png", context, parentScope);
            OptRuntime.callName(new Object[]{"播放下一首"}, "toastLog", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 235);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 5);
            if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "音乐列表类型"), "云端音乐")) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "模式"), "全部循环", context, parentScope, "模式");
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "moshi", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/xunhuan.png", context, parentScope);
                ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "progressNow"), OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "SheetMusic"), "length", context, parentScope)) - ScriptRuntime.toNumber(OptRuntime.oneObj)), context, parentScope, "progressNow");
                OptRuntime.callName0("更新控制台信息", context, parentScope);
                ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "s"), OptRuntime.oneObj, context, parentScope, "s");
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "action21", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/A6.png", context, parentScope);
                OptRuntime.callName(new Object[]{"播放下一首"}, "toastLog", context, parentScope);
                ScriptRuntime.addInstructionCount(context, 229);
            }
            ScriptRuntime.addInstructionCount(context, 1);
        }
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj;
    }

    private static Object _c_anonymous_95(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "s"), OptRuntime.zeroObj)) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "s"), OptRuntime.oneObj, context, parentScope, "s");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "action21", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/A6.png", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 101);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "s"), OptRuntime.zeroObj, context, parentScope, "s");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "action21", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/A1.png", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 65);
        }
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj;
    }

    private static Object _c_anonymous_96(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "speedControl"), OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.add(OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl")) * ScriptRuntime.toNumber(_k23)), OptRuntime.oneObj, context)) / ScriptRuntime.toNumber(_k23)), context, parentScope, "speedControl");
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "speed", context, parentScope), "setText", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add("速度\nX", OptRuntime.wrapDouble(((ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl")) * ScriptRuntime.toNumber(_k23)) - ScriptRuntime.toNumber(_k21)) / ScriptRuntime.toNumber(_k23))), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 141);
        return obj;
    }

    private static Object _c_anonymous_97(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        if (ScriptRuntime.cmp_LE(ScriptRuntime.name(context, parentScope, "speedControl"), _k47)) {
            ScriptRuntime.addInstructionCount(context, 1);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 44);
            return obj;
        }
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "speedControl"), OptRuntime.wrapDouble(((ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl")) * ScriptRuntime.toNumber(_k23)) - ScriptRuntime.toNumber(OptRuntime.oneObj)) / ScriptRuntime.toNumber(_k23)), context, parentScope, "speedControl");
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "speed", context, parentScope), "setText", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add("速度\nX", OptRuntime.wrapDouble(((ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl")) * ScriptRuntime.toNumber(_k23)) - ScriptRuntime.toNumber(_k21)) / ScriptRuntime.toNumber(_k23))), context, parentScope);
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 135);
        return obj2;
    }

    private static Object _c_anonymous_98(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "s"), OptRuntime.zeroObj)) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "s"), OptRuntime.zeroObj, context, parentScope, "s");
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "stopp"), OptRuntime.oneObj, context, parentScope, "stopp");
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "音乐列表类型"), "", context, parentScope, "音乐列表类型");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "window0"), "setSize", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "windowWidth"), ScriptRuntime.name(context, parentScope, "windowHeight"), context, parentScope);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "events"), "removeAllKeyDownListeners", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "volume_down", context, parentScope);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "events"), "removeAllKeyUpListeners", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "volume_down", context, parentScope);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "events"), "removeAllKeyDownListeners", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "volume_up", context, parentScope);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "events"), "removeAllKeyUpListeners", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "volume_up", context, parentScope);
            OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window1"), "close", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 276);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "stopp"), OptRuntime.oneObj, context, parentScope, "stopp");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "window0"), "setSize", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.zeroObj, OptRuntime.zeroObj, context, parentScope);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "音乐列表类型"), "", context, parentScope, "音乐列表类型");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "window0"), "setSize", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "windowWidth"), ScriptRuntime.name(context, parentScope, "windowHeight"), context, parentScope);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "events"), "removeAllKeyDownListeners", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "volume_down", context, parentScope);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "events"), "removeAllKeyUpListeners", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "volume_down", context, parentScope);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "events"), "removeAllKeyDownListeners", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "volume_up", context, parentScope);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "events"), "removeAllKeyUpListeners", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "volume_up", context, parentScope);
            OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "window1"), "close", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 252);
        }
        ScriptRuntime.addInstructionCount(context, 1);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 8);
        return obj;
    }

    private static Object _c_anonymous_99(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createArrowFunctionActivation = ScriptRuntime.createArrowFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createArrowFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 24);
            if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createArrowFunctionActivation, "ui"), "录屏模式", context, createArrowFunctionActivation), "checked", context, createArrowFunctionActivation), Boolean.TRUE)) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 76);
                if (!ScriptRuntime.eq(ScriptRuntime.name(context, createArrowFunctionActivation, "录屏模式"), "已开启")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "ui"), "run", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(createArrowFunctionActivation, context, 100), context, createArrowFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 144);
                }
                ScriptRuntime.addInstructionCount(context, 1);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createArrowFunctionActivation, "window1"), "setSize", context, createArrowFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createArrowFunctionActivation, "windowWidth"), ScriptRuntime.name(context, createArrowFunctionActivation, "windowHeight"), context, createArrowFunctionActivation);
                OptRuntime.callName(new Object[]{"点击图标就可以看见我啦"}, "toastLog", context, createArrowFunctionActivation);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createArrowFunctionActivation, "悬浮窗是否隐藏"), "true", context, createArrowFunctionActivation, "悬浮窗是否隐藏");
                ScriptRuntime.addInstructionCount(context, 86);
            }
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 3);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_100(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "xuanfukuang", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "visibility", "gone", context, parentScope);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window0"), "ccc", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "visibility", "gone", context, parentScope);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "录屏模式"), "已开启", context, parentScope, "录屏模式");
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 108);
        return obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 29 */
    private static Object _c_anonymous_101(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        if (!ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "是否收藏"), "已加收藏")) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 46);
            ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "音乐类型"), "别他妈瞎点");
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{OptRuntime.callName(new Object[]{OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "get", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "本次的音乐编号", context, parentScope)}, "Number", context, parentScope), "赠送", OptRuntime.callName(new Object[]{OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "get", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "SheetMusic", context, parentScope)}, "String", context, parentScope), OptRuntime.callName(new Object[]{ScriptRuntime.name(context, parentScope, "nusicname")}, "String", context, parentScope)}, "保存喜欢音乐本地化", context, parentScope);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "shoucang", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/A4.png", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 254);
            ScriptRuntime.addInstructionCount(context, 1);
        }
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj;
    }

    private static Object _c_anonymous_102(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "模式"), "单曲播放")) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "模式"), "单曲循环", context, parentScope, "模式");
            OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.add("当前为", ScriptRuntime.name(context, parentScope, "模式")), "模式！")}, "toastLog", context, parentScope);
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "moshi", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/danquxunhuan.png", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 137);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 5);
            if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "模式"), "单曲循环")) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 40);
                if (!ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "音乐列表类型"), "别他妈瞎点")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "模式"), "全部循环", context, parentScope, "模式");
                    OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.add("当前为", ScriptRuntime.name(context, parentScope, "模式")), "模式！")}, "toastLog", context, parentScope);
                    OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "moshi", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/xunhuan.png", context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 167);
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "模式"), "单曲播放", context, parentScope, "模式");
                    OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.add("当前为", ScriptRuntime.name(context, parentScope, "模式")), "模式！")}, "toastLog", context, parentScope);
                    OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "moshi", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/danqu.png", context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 101);
                }
                ScriptRuntime.addInstructionCount(context, 1);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "模式"), "全部循环")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 40);
                    if (!ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "音乐列表类型"), "别他妈瞎点")) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "模式"), "全部随机", context, parentScope, "模式");
                        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.add("当前为", ScriptRuntime.name(context, parentScope, "模式")), "模式！")}, "toastLog", context, parentScope);
                        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "moshi", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/suiji.png", context, parentScope);
                        ScriptRuntime.addInstructionCount(context, 167);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 5);
                    if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "模式"), "全部随机")) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 40);
                        if (!ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "音乐列表类型"), "别他妈瞎点")) {
                            ScriptRuntime.addInstructionCount(context, 1);
                            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "模式"), "单曲播放", context, parentScope, "模式");
                            OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.add("当前为", ScriptRuntime.name(context, parentScope, "模式")), "模式！")}, "toastLog", context, parentScope);
                            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "moshi", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/danqu.png", context, parentScope);
                            ScriptRuntime.addInstructionCount(context, 167);
                        }
                        ScriptRuntime.addInstructionCount(context, 1);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                }
                ScriptRuntime.addInstructionCount(context, 1);
            }
            ScriptRuntime.addInstructionCount(context, 1);
        }
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj;
    }

    private static Object _c_anonymous_103(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        if (ScriptRuntime.toBoolean(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "exists", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "get", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "路径", context, parentScope), context, parentScope))) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "是否收藏"), "已加收藏", context, parentScope, "是否收藏");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "shoucang", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/A4.png", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 143);
        }
        ScriptRuntime.addInstructionCount(context, 1);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 8);
        return obj;
    }

    private static Object _c_anonymous_104(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "录屏模式", context, parentScope), "checked", context, parentScope), Boolean.TRUE)) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "监控下键", context, parentScope), "checked", Boolean.TRUE, context, parentScope);
            ScriptRuntime.addInstructionCount(context, 85);
        }
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj;
    }

    private static Object _c_anonymous_105(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 24);
            if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "ui"), "录屏模式", context, createFunctionActivation), "checked", context, createFunctionActivation), Boolean.TRUE)) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 76);
                if (!ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "录屏模式"), "已开启")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "ui"), "run", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 106), context, createFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 144);
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "ui"), "run", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 107), context, createFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 42);
                }
                ScriptRuntime.addInstructionCount(context, 1);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
                if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "悬浮窗是否隐藏"), "false") && !ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "音乐列表类型"), "")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 60);
                    if (!ScriptRuntime.eq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "ui"), "录屏模式", context, createFunctionActivation), "checked", context, createFunctionActivation), Boolean.TRUE)) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.callName(new Object[]{"按手机音量-按钮可恢复弹奏窗口"}, "toastLog", context, createFunctionActivation);
                        ScriptRuntime.addInstructionCount(context, 126);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "window1"), "setSize", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "windowWidth"), ScriptRuntime.name(context, createFunctionActivation, "windowHeight"), context, createFunctionActivation);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "悬浮窗是否隐藏"), "true", context, createFunctionActivation, "悬浮窗是否隐藏");
                    ScriptRuntime.addInstructionCount(context, 67);
                } else {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 5);
                    if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "悬浮窗是否隐藏"), "true") && !ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "音乐列表类型"), "")) {
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 1);
                        ScriptRuntime.addInstructionCount(context, 60);
                        if (!ScriptRuntime.eq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "ui"), "录屏模式", context, createFunctionActivation), "checked", context, createFunctionActivation), Boolean.TRUE)) {
                            ScriptRuntime.addInstructionCount(context, 1);
                            OptRuntime.callName(new Object[]{"按手机音量-按钮可隐藏弹奏窗口"}, "toastLog", context, createFunctionActivation);
                            ScriptRuntime.addInstructionCount(context, 126);
                        }
                        ScriptRuntime.addInstructionCount(context, 1);
                        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "window1"), "setSize", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.wrapDouble(ScriptRuntime.toNumber(_k33) * ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "bili"))), ScriptRuntime.name(context, createFunctionActivation, "参数控制台高度"), context, createFunctionActivation);
                        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "toumingdu", context, createFunctionActivation), "setText", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "点击隐藏", context, createFunctionActivation);
                        ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "悬浮窗是否隐藏"), "false", context, createFunctionActivation, "悬浮窗是否隐藏");
                        ScriptRuntime.addInstructionCount(context, 117);
                    }
                    ScriptRuntime.addInstructionCount(context, 1);
                }
                ScriptRuntime.addInstructionCount(context, 1);
            }
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 3);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_106(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "xuanfukuang", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "visibility", "gone", context, parentScope);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window0"), "ccc", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "visibility", "gone", context, parentScope);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "录屏模式"), "已开启", context, parentScope, "录屏模式");
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 108);
        return obj;
    }

    private static Object _c_anonymous_107(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "xuanfukuang", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "visibility", "visible", context, parentScope);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window0"), "ccc", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "visibility", "visible", context, parentScope);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "录屏模式"), "已关闭", context, parentScope, "录屏模式");
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 108);
        return obj;
    }

    private static Object _c_timeSum_108(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object miaoshu;
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 1) {
            objArr = ScriptRuntime.padArguments(objArr, 1);
        }
        Object p = objArr[0];
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "seek", context, parentScope), "setMax", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "SheetMusic"), "length", context, parentScope), context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        Object timeTotal = OptRuntime.zeroObj;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Double i = OptRuntime.zeroObj;
        ScriptRuntime.addInstructionCount(context, 122);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (!ScriptRuntime.cmp_LT(i, p)) {
                break;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 10);
            Object objectElem = ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "SheetMusic"), i, context, parentScope);
            if (ScriptRuntime.shallowEq("t4();", objectElem)) {
                ScriptRuntime.addInstructionCount(context, 1);
                timeTotal = ScriptRuntime.add(timeTotal, OptRuntime.wrapDouble(ScriptRuntime.toNumber(_k22) / ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl"))), context);
                ScriptRuntime.addInstructionCount(context, 34);
            } else if (ScriptRuntime.shallowEq("t3();", objectElem)) {
                ScriptRuntime.addInstructionCount(context, 1);
                timeTotal = ScriptRuntime.add(timeTotal, OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "time2")) / ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl"))), context);
                ScriptRuntime.addInstructionCount(context, 39);
            } else if (ScriptRuntime.shallowEq("t2();", objectElem)) {
                ScriptRuntime.addInstructionCount(context, 1);
                timeTotal = ScriptRuntime.add(timeTotal, OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "time1")) / ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl"))), context);
                ScriptRuntime.addInstructionCount(context, 39);
            } else if (ScriptRuntime.shallowEq("t1();", objectElem)) {
                ScriptRuntime.addInstructionCount(context, 1);
                timeTotal = ScriptRuntime.add(timeTotal, OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "time")) / ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl"))), context);
                ScriptRuntime.addInstructionCount(context, 39);
            } else if (ScriptRuntime.shallowEq("m4();", objectElem)) {
                ScriptRuntime.addInstructionCount(context, 1);
                timeTotal = ScriptRuntime.add(timeTotal, OptRuntime.wrapDouble(ScriptRuntime.toNumber(_k22) / ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl"))), context);
                ScriptRuntime.addInstructionCount(context, 34);
            } else if (ScriptRuntime.shallowEq("m3();", objectElem)) {
                ScriptRuntime.addInstructionCount(context, 1);
                timeTotal = ScriptRuntime.add(timeTotal, OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "time2")) / ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl"))), context);
                ScriptRuntime.addInstructionCount(context, 39);
            } else if (ScriptRuntime.shallowEq("m2();", objectElem)) {
                ScriptRuntime.addInstructionCount(context, 1);
                timeTotal = ScriptRuntime.add(timeTotal, OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "time1")) / ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl"))), context);
                ScriptRuntime.addInstructionCount(context, 39);
            } else if (ScriptRuntime.shallowEq("m1();", objectElem)) {
                ScriptRuntime.addInstructionCount(context, 1);
                timeTotal = ScriptRuntime.add(timeTotal, OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "time")) / ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl"))), context);
                ScriptRuntime.addInstructionCount(context, 39);
            } else {
                ScriptRuntime.addInstructionCount(context, 121);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            double number = ScriptRuntime.toNumber(i);
            i = OptRuntime.wrapDouble(1.0d + number);
            OptRuntime.wrapDouble(number);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 22);
        }
        ScriptRuntime.addInstructionCount(context, 18);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Object minute = OptRuntime.zeroObj;
        ScriptRuntime.addInstructionCount(context, 1);
        Double second = OptRuntime.wrapDouble(ScriptRuntime.toNumber(timeTotal) / ScriptRuntime.toNumber(_k48));
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 42);
        if (ScriptRuntime.cmp_LT(_k20, second)) {
            ScriptRuntime.addInstructionCount(context, 1);
            minute = OptRuntime.callName(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(second) / ScriptRuntime.toNumber(_k20))}, "parseInt", context, parentScope);
            second = OptRuntime.wrapDouble(ScriptRuntime.toNumber(second) % ScriptRuntime.toNumber(_k20));
            ScriptRuntime.addInstructionCount(context, 117);
        }
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        if (ScriptRuntime.cmp_LT(_k49, OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(second, "toFixed", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.zeroObj, context, parentScope))) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            miaoshu = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(second, "toFixed", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.zeroObj, context, parentScope);
            ScriptRuntime.addInstructionCount(context, 85);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            miaoshu = ScriptRuntime.add("0", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(second, "toFixed", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.zeroObj, context, parentScope));
            ScriptRuntime.addInstructionCount(context, 40);
        }
        Object add = ScriptRuntime.add(ScriptRuntime.add(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(minute, "toFixed", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.zeroObj, context, parentScope), ":"), miaoshu, context);
        ScriptRuntime.addInstructionCount(context, 34);
        return add;
    }

    private static Object _c_anonymous_109(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 2) {
            objArr = ScriptRuntime.padArguments(objArr, 2);
        }
        Object sb = objArr[0];
        Object p = objArr[1];
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "progressNow"), p, context, parentScope, "progressNow");
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 56);
        if (!ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "音乐列表类型"), "")) {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "jd", context, parentScope), "setText", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add(OptRuntime.callName(new Object[]{p}, "timeSum", context, parentScope), "/"), OptRuntime.callName(new Object[]{OptRuntime.callProp0(sb, "getMax", context, parentScope)}, "timeSum", context, parentScope), context), context, parentScope);
            ScriptRuntime.addInstructionCount(context, 173);
        }
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj;
    }

    private static Object _c_m1_110(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("t1", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m2_111(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("t2", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m3_112(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("t3", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m4_113(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("t4", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m5_114(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("t5", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m6_115(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("c4", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m7_116(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("d4", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m8_117(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("e4", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m9_118(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("f4", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m10_119(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("g4", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m11_120(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("a4", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m12_121(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("b4", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m13_122(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("c5", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m14_123(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("d5", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m15_124(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("e5", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m16_125(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("f5", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m17_126(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("g5", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m18_127(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("a5", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m19_128(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("b5", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_m20_129(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName0("c6", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 17);
        return obj;
    }

    private static Object _c_ran_130(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        Double wrapDouble = OptRuntime.wrapDouble((ScriptRuntime.toNumber(OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "Math"), "random", context, parentScope)) * ScriptRuntime.toNumber(_k25)) - ScriptRuntime.toNumber(_k50));
        ScriptRuntime.addInstructionCount(context, 41);
        return wrapDouble;
    }

    private static Object _c_c4_131(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), OptRuntime.zeroObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), OptRuntime.zeroObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_d4_132(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), OptRuntime.oneObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), OptRuntime.zeroObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_e4_133(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), _k21, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), OptRuntime.zeroObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_f4_134(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), _k3, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), OptRuntime.zeroObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_g4_135(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), _k7, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), OptRuntime.zeroObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_a4_136(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), OptRuntime.zeroObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), OptRuntime.oneObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_b4_137(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), OptRuntime.oneObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), OptRuntime.oneObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_c5_138(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), _k21, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), OptRuntime.oneObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_d5_139(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), _k3, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), OptRuntime.oneObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_e5_140(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), _k7, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), OptRuntime.oneObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_f5_141(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), OptRuntime.zeroObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), _k21, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_g5_142(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), OptRuntime.oneObj, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), _k21, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_a5_143(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), _k21, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), _k21, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_b5_144(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), _k3, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), _k21, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_c6_145(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "x"), _k7, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.add(ScriptRuntime.getObjectElem(ScriptRuntime.name(context, parentScope, "y"), _k21, context, parentScope), OptRuntime.callName0("ran", context, parentScope), context), ScriptRuntime.name(context, parentScope, "按压时间")}, "press", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 94);
        return obj;
    }

    private static Object _c_t1_146(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "s"), OptRuntime.oneObj)) {
                ScriptRuntime.addInstructionCount(context, 25);
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "time")) / ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl")))}, "sleep", context, parentScope);
                Object obj = Undefined.instance;
                ScriptRuntime.addInstructionCount(context, 50);
                return obj;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{_k22}, "sleep", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
        }
    }

    private static Object _c_t2_147(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "s"), OptRuntime.oneObj)) {
                ScriptRuntime.addInstructionCount(context, 25);
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "time1")) / ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl")))}, "sleep", context, parentScope);
                Object obj = Undefined.instance;
                ScriptRuntime.addInstructionCount(context, 50);
                return obj;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{_k22}, "sleep", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
        }
    }

    private static Object _c_t3_148(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "s"), OptRuntime.oneObj)) {
                ScriptRuntime.addInstructionCount(context, 25);
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "time2")) / ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl")))}, "sleep", context, parentScope);
                Object obj = Undefined.instance;
                ScriptRuntime.addInstructionCount(context, 50);
                return obj;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{_k22}, "sleep", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
        }
    }

    private static Object _c_t4_149(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "s"), OptRuntime.oneObj)) {
                ScriptRuntime.addInstructionCount(context, 25);
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{OptRuntime.wrapDouble(ScriptRuntime.toNumber(_k22) / ScriptRuntime.toNumber(ScriptRuntime.name(context, parentScope, "speedControl")))}, "sleep", context, parentScope);
                Object obj = Undefined.instance;
                ScriptRuntime.addInstructionCount(context, 45);
                return obj;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{_k22}, "sleep", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
        }
    }

    private static Object _c_t5_150(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.callName(new Object[]{_k51}, "sleep", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 27);
        return obj;
    }

    /* renamed from: _c_更新控制台信息_151, reason: contains not printable characters */
    private static Object m21_c__151(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "ui"), "run", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 152), context, createFunctionActivation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "window1"), "seek", context, createFunctionActivation), "setOnSeekBarChangeListener", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObject(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "android"), "widget", context, createFunctionActivation), "SeekBar", context, createFunctionActivation), "OnSeekBarChangeListener", context, createFunctionActivation), context, createFunctionActivation, new Object[]{ScriptRuntime.newObjectLiteral(new Object[]{"onProgressChanged"}, new Object[]{new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 153)}, (int[]) null, context, createFunctionActivation)}), context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 173);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_152(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        if (ScriptRuntime.toBoolean(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "exists", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "get", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "路径", context, parentScope), context, parentScope))) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "是否收藏"), "已加收藏", context, parentScope, "是否收藏");
            OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "shoucang", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/A4.png", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 143);
        }
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "nusicname", context, parentScope), "setText", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.callName(new Object[]{OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "storage"), "get", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "nusicname", context, parentScope)}, "String", context, parentScope), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 85);
        return obj;
    }

    private static Object _c_anonymous_153(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 2) {
            objArr = ScriptRuntime.padArguments(objArr, 2);
        }
        Object sb = objArr[0];
        Object p = objArr[1];
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "progressNow"), p, context, parentScope, "progressNow");
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 56);
        if (!ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "stopp"), OptRuntime.zeroObj)) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 87);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "jd", context, parentScope), "setText", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(ScriptRuntime.add(OptRuntime.callName(new Object[]{p}, "timeSum", context, parentScope), "/"), OptRuntime.callName(new Object[]{OptRuntime.callProp0(sb, "getMax", context, parentScope)}, "timeSum", context, parentScope), context), context, parentScope);
            ScriptRuntime.addInstructionCount(context, 91);
        }
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj;
    }

    private static Object _c_anonymous_154(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 10);
        if (!ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "音乐列表类型"), "")) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 46);
            if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, parentScope, "s"), OptRuntime.oneObj)) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 82);
                if (!ScriptRuntime.eq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "录屏模式", context, parentScope), "checked", context, parentScope), Boolean.TRUE)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.callName(new Object[]{"按手机音量+按钮可恢复弹奏"}, "toastLog", context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 148);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "s"), OptRuntime.zeroObj, context, parentScope, "s");
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "action21", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/A1.png", context, parentScope);
                ScriptRuntime.addInstructionCount(context, 65);
            } else {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (!ScriptRuntime.eq(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "录屏模式", context, parentScope), "checked", context, parentScope), Boolean.TRUE)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.callName(new Object[]{"按手机音量+按钮可暂停弹奏"}, "toastLog", context, parentScope);
                    ScriptRuntime.addInstructionCount(context, 76);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "s"), OptRuntime.oneObj, context, parentScope, "s");
                OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "action21", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/A6.png", context, parentScope);
                ScriptRuntime.addInstructionCount(context, 65);
            }
            ScriptRuntime.addInstructionCount(context, 1);
        }
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj;
    }

    private static Object _c_anonymous_155(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "seek", context, parentScope), "setProgress", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.zeroObj, context, parentScope);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "action21", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/A1.png", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 85);
        return obj;
    }

    private static Object _c_anonymous_156(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "seek", context, parentScope), "setProgress", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.zeroObj, context, parentScope);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "window1"), "action21", context, parentScope), "attr", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "src", "file://images/A1.png", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 85);
        return obj;
    }

    private static Object _c_jiazaitongzhiannouncement_157(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, createFunctionActivation, "Skytongzhi"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 158)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 113);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_158(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
            if (ScriptRuntime.toBoolean(ScriptRuntime.name(context, createFunctionActivation, "err"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName0("exit", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 66);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.callProp0(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "res"), "body", context, createFunctionActivation), "string", context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "substring", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容开始]", context, createFunctionActivation), _k5, context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容结束]", context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "neirong"), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k29, context, createFunctionActivation, "ooooooooo");
            ScriptRuntime.addInstructionCount(context, 1);
            Scriptable activation = ScriptRuntime.enterWith(ScriptRuntime.newObjectLiteral(new Object[]{"i"}, new Object[]{OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 278);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(ScriptRuntime.name(context, activation, "i"), _k52)) {
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.eq(ScriptRuntime.name(context, activation, "ooooooooo"), _k29)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, activation, "ooooooooo"), _k28, context, activation, "ooooooooo");
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{_k22}, "sleep", context, activation);
                ScriptRuntime.addInstructionCount(context, 60);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.nameIncrDecr(activation, "i", context, 2);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 15);
            }
            Scriptable activation2 = ScriptRuntime.leaveWith(activation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, activation2, "ui"), "run", context, activation2), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(activation2, context, 159), context, activation2);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 46);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_159(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "tongzhi", context, parentScope), "setText", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "neirong"), "announcement", context, parentScope), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 58);
        return obj;
    }

    private static Object _c_jiazaitongzhiInstructions_160(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, createFunctionActivation, "Skytongzhi"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 161)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 113);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_161(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
            if (ScriptRuntime.toBoolean(ScriptRuntime.name(context, createFunctionActivation, "err"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName0("exit", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 66);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.callProp0(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "res"), "body", context, createFunctionActivation), "string", context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "substring", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容开始]", context, createFunctionActivation), _k5, context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容结束]", context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "neirong"), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k29, context, createFunctionActivation, "ooooooooo");
            ScriptRuntime.addInstructionCount(context, 1);
            Scriptable activation = ScriptRuntime.enterWith(ScriptRuntime.newObjectLiteral(new Object[]{"i"}, new Object[]{OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 278);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(ScriptRuntime.name(context, activation, "i"), _k52)) {
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.eq(ScriptRuntime.name(context, activation, "ooooooooo"), _k29)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, activation, "ooooooooo"), _k28, context, activation, "ooooooooo");
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{_k22}, "sleep", context, activation);
                ScriptRuntime.addInstructionCount(context, 60);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.nameIncrDecr(activation, "i", context, 2);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 15);
            }
            Scriptable activation2 = ScriptRuntime.leaveWith(activation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, activation2, "ui"), "run", context, activation2), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(activation2, context, 162), context, activation2);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 46);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_162(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "tongzhi", context, parentScope), "setText", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "neirong"), "Instructions", context, parentScope), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 58);
        return obj;
    }

    private static Object _c_jiazaitongzhiguangyupeiwan_163(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, createFunctionActivation, "Skytongzhi"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 164)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 113);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_164(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
            if (ScriptRuntime.toBoolean(ScriptRuntime.name(context, createFunctionActivation, "err"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName0("exit", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 66);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.callProp0(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "res"), "body", context, createFunctionActivation), "string", context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "substring", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容开始]", context, createFunctionActivation), _k5, context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容结束]", context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "neirong"), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k29, context, createFunctionActivation, "ooooooooo");
            ScriptRuntime.addInstructionCount(context, 1);
            Scriptable activation = ScriptRuntime.enterWith(ScriptRuntime.newObjectLiteral(new Object[]{"i"}, new Object[]{OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 278);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(ScriptRuntime.name(context, activation, "i"), _k52)) {
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.eq(ScriptRuntime.name(context, activation, "ooooooooo"), _k29)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, activation, "ooooooooo"), _k28, context, activation, "ooooooooo");
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{_k22}, "sleep", context, activation);
                ScriptRuntime.addInstructionCount(context, 60);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.nameIncrDecr(activation, "i", context, 2);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 15);
            }
            Scriptable activation2 = ScriptRuntime.leaveWith(activation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, activation2, "ui"), "run", context, activation2), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(activation2, context, 165), context, activation2);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 46);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_165(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "tongzhi", context, parentScope), "setText", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "neirong"), "guangyupeiwan", context, parentScope), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 58);
        return obj;
    }

    private static Object _c_jiazaitongzhiguangyufuli_166(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, createFunctionActivation, "Skytongzhi"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 167)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 113);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_167(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
            if (ScriptRuntime.toBoolean(ScriptRuntime.name(context, createFunctionActivation, "err"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName0("exit", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 66);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.callProp0(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "res"), "body", context, createFunctionActivation), "string", context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "substring", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容开始]", context, createFunctionActivation), _k5, context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容结束]", context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "neirong"), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k29, context, createFunctionActivation, "ooooooooo");
            ScriptRuntime.addInstructionCount(context, 1);
            Scriptable activation = ScriptRuntime.enterWith(ScriptRuntime.newObjectLiteral(new Object[]{"i"}, new Object[]{OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 278);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(ScriptRuntime.name(context, activation, "i"), _k52)) {
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.eq(ScriptRuntime.name(context, activation, "ooooooooo"), _k29)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, activation, "ooooooooo"), _k28, context, activation, "ooooooooo");
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{_k22}, "sleep", context, activation);
                ScriptRuntime.addInstructionCount(context, 60);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.nameIncrDecr(activation, "i", context, 2);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 15);
            }
            Scriptable activation2 = ScriptRuntime.leaveWith(activation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, activation2, "ui"), "run", context, activation2), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(activation2, context, 168), context, activation2);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 46);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_168(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "tongzhi", context, parentScope), "setText", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "neirong"), "guangyufuli", context, parentScope), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 58);
        return obj;
    }

    private static Object _c_jiazaijinrishuliang_169(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, createFunctionActivation, "Skytongzhi"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 170)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 113);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_170(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
            if (ScriptRuntime.toBoolean(ScriptRuntime.name(context, createFunctionActivation, "err"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName0("exit", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 66);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.callProp0(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "res"), "body", context, createFunctionActivation), "string", context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "substring", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容开始]", context, createFunctionActivation), _k5, context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容结束]", context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "neirong"), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k29, context, createFunctionActivation, "ooooooooo");
            ScriptRuntime.addInstructionCount(context, 1);
            Scriptable activation = ScriptRuntime.enterWith(ScriptRuntime.newObjectLiteral(new Object[]{"i"}, new Object[]{OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 278);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(ScriptRuntime.name(context, activation, "i"), _k52)) {
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.eq(ScriptRuntime.name(context, activation, "ooooooooo"), _k29)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, activation, "ooooooooo"), _k28, context, activation, "ooooooooo");
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{_k22}, "sleep", context, activation);
                ScriptRuntime.addInstructionCount(context, 60);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.nameIncrDecr(activation, "i", context, 2);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 15);
            }
            Scriptable activation2 = ScriptRuntime.leaveWith(activation);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, activation2, "ui"), "run", context, activation2), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(activation2, context, 171), context, activation2);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 46);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_171(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "jrtj", context, parentScope), "setText", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "neirong"), "今日添加", context, parentScope), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 58);
        return obj;
    }

    private static Object _c_jiazaizongshuliang_172(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, createFunctionActivation, "Skytongzhi"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 173)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 113);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_173(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
            if (ScriptRuntime.toBoolean(ScriptRuntime.name(context, createFunctionActivation, "err"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName0("exit", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 66);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.callProp0(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "res"), "body", context, createFunctionActivation), "string", context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "substring", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容开始]", context, createFunctionActivation), _k5, context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容结束]", context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "neirong"), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k29, context, createFunctionActivation, "ooooooooo");
            ScriptRuntime.addInstructionCount(context, 1);
            Scriptable activation = ScriptRuntime.enterWith(ScriptRuntime.newObjectLiteral(new Object[]{"i"}, new Object[]{OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 278);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(ScriptRuntime.name(context, activation, "i"), _k52)) {
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.eq(ScriptRuntime.name(context, activation, "ooooooooo"), _k29)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, activation, "ooooooooo"), _k28, context, activation, "ooooooooo");
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{_k22}, "sleep", context, activation);
                ScriptRuntime.addInstructionCount(context, 60);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.nameIncrDecr(activation, "i", context, 2);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 15);
            }
            Scriptable activation2 = ScriptRuntime.leaveWith(activation);
            ScriptRuntime.setName(ScriptRuntime.bind(context, activation2, "总数量2"), ScriptRuntime.add(OptRuntime.callName(new Object[]{ScriptRuntime.getObjectProp(ScriptRuntime.name(context, activation2, "neirong"), "歌曲总数量", context, activation2)}, "Number", context, activation2), _k30, context), context, activation2, "总数量2");
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, activation2, "ui"), "run", context, activation2), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(activation2, context, 174), context, activation2);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 101);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_174(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "ui"), "zgq", context, parentScope), "setText", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.callName(new Object[]{ScriptRuntime.name(context, parentScope, "总数量2")}, "String", context, parentScope), context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 65);
        return obj;
    }

    private static Object _c_jiazaigonggaogengxintankuang_175(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, createFunctionActivation, "SkyUpdate"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 176)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 113);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_176(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
            if (ScriptRuntime.toBoolean(ScriptRuntime.name(context, createFunctionActivation, "err"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName0("exit", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 66);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.callProp0(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "res"), "body", context, createFunctionActivation), "string", context, createFunctionActivation), context, createFunctionActivation, "neirong");
            Integer num = _k11;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "substring", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容开始]", context, createFunctionActivation), _k5, context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "neirong"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), "[通知内容结束]", context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "JSONneirong"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "neirong"), context, createFunctionActivation), context, createFunctionActivation, "JSONneirong");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k29, context, createFunctionActivation, "ooooooooo");
            ScriptRuntime.addInstructionCount(context, 1);
            Scriptable activation = ScriptRuntime.enterWith(ScriptRuntime.newObjectLiteral(new Object[]{"i"}, new Object[]{OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 282);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(ScriptRuntime.name(context, activation, "i"), _k52)) {
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.eq(ScriptRuntime.name(context, activation, "ooooooooo"), _k29)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, activation, "ooooooooo"), _k28, context, activation, "ooooooooo");
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{_k22}, "sleep", context, activation);
                ScriptRuntime.addInstructionCount(context, 60);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.nameIncrDecr(activation, "i", context, 2);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 15);
            }
            Scriptable activation2 = ScriptRuntime.leaveWith(activation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, activation2, "Updateversionnumber"), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectProp(ScriptRuntime.name(context, activation2, "JSONneirong"), "Updateversionnumber", context, activation2)}, "String", context, activation2), context, activation2, "Updateversionnumber");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, activation2, "Checkforupdates"), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectProp(ScriptRuntime.name(context, activation2, "JSONneirong"), "Checkforupdates", context, activation2)}, "String", context, activation2), context, activation2, "Checkforupdates");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, activation2, "Updatecontent"), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectProp(ScriptRuntime.name(context, activation2, "JSONneirong"), "Updatecontent", context, activation2)}, "String", context, activation2), context, activation2, "Updatecontent");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, activation2, "Updatelink"), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectProp(ScriptRuntime.name(context, activation2, "JSONneirong"), "Updatelink", context, activation2)}, "String", context, activation2), context, activation2, "Updatelink");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, activation2, "Updateannouncement"), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectProp(ScriptRuntime.name(context, activation2, "JSONneirong"), "Updateannouncement", context, activation2)}, "String", context, activation2), context, activation2, "Updateannouncement");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, activation2, "Updatetheannouncement"), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectProp(ScriptRuntime.name(context, activation2, "JSONneirong"), "Updatetheannouncement", context, activation2)}, "String", context, activation2), context, activation2, "Updatetheannouncement");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 328);
            if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, activation2, "Checkforupdates"), "强制弹框更新")) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 365);
                if (ScriptRuntime.cmp_LT(ScriptRuntime.name(context, activation2, "版本号"), ScriptRuntime.name(context, activation2, "Updateversionnumber"))) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.callProp0(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, activation2, "dialogs"), "build", context, activation2), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObjectLiteral(new Object[]{"title", "content", "positive"}, new Object[]{"发现新版本", ScriptRuntime.add("更新日志: ", ScriptRuntime.name(context, activation2, "Updatecontent")), "确定"}, (int[]) null, context, activation2), context, activation2), "on", context, activation2), ScriptRuntime.lastStoredScriptable(context), "positive", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(activation2, context, 177), context, activation2, scriptable2), context, activation2), "show", context, activation2);
                    OptRuntime.callName(new Object[]{_k53}, "sleep", context, activation2);
                    OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, activation2, "app"), "openUrl", context, activation2), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, activation2, "Updatelink"), context, activation2);
                    OptRuntime.callProp0(ScriptRuntime.name(context, activation2, "engines"), "stopAll", context, activation2);
                    ScriptRuntime.addInstructionCount(context, 606);
                }
                ScriptRuntime.addInstructionCount(context, 1);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 5);
            if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, activation2, "Updateannouncement"), "弹框公告")) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callProp0(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, activation2, "dialogs"), "build", context, activation2), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObjectLiteral(new Object[]{"title", "content", "positive"}, new Object[]{"公告", ScriptRuntime.name(context, activation2, "Updatetheannouncement"), "确定"}, (int[]) null, context, activation2), context, activation2), "on", context, activation2), ScriptRuntime.lastStoredScriptable(context), "positive", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(activation2, context, 178), context, activation2, scriptable2), context, activation2), "show", context, activation2);
                ScriptRuntime.addInstructionCount(context, 162);
            }
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 3);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_177(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "app"), "openUrl", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "Updatelink"), context, parentScope);
        OptRuntime.callProp0(ScriptRuntime.name(context, parentScope, "engines"), "stopAll", context, parentScope);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 59);
        return obj;
    }

    private static Object _c_anonymous_178(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 8);
        return obj;
    }

    /* renamed from: _c_远程保存音乐列表_179, reason: contains not printable characters */
    private static Object m26_c__179(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, createFunctionActivation, "Skymusicliebiao"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 180)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 113);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x025b, code lost:
    
        org.mozilla.javascript.ScriptRuntime.addInstructionCount(r21, 1);
        org.mozilla.javascript.optimizer.OptRuntime.call2(org.mozilla.javascript.ScriptRuntime.getPropFunctionAndThis(org.mozilla.javascript.ScriptRuntime.name(r21, r7, "storage"), "put", r21, r7), org.mozilla.javascript.ScriptRuntime.lastStoredScriptable(r21), "最大值", r5, r21, r7);
        org.mozilla.javascript.optimizer.OptRuntime.callName(new java.lang.Object[]{org.mozilla.javascript.ScriptRuntime.add("最大值", r5)}, "log", r21, r7);
        org.mozilla.javascript.optimizer.OptRuntime.call2(org.mozilla.javascript.ScriptRuntime.getPropFunctionAndThis(org.mozilla.javascript.ScriptRuntime.name(r21, r7, "storage"), "put", r21, r7), org.mozilla.javascript.ScriptRuntime.lastStoredScriptable(r21), "总数量", org.mozilla.javascript.optimizer.OptRuntime.callName(new java.lang.Object[]{org.mozilla.javascript.optimizer.OptRuntime.wrapDouble(org.mozilla.javascript.ScriptRuntime.toNumber(org.mozilla.javascript.optimizer.OptRuntime.wrapDouble(org.mozilla.javascript.ScriptRuntime.toNumber(r5))) - org.mozilla.javascript.ScriptRuntime.toNumber(org.mozilla.javascript.optimizer.OptRuntime.oneObj))}, "Number", r21, r7), r21, r7);
        org.mozilla.javascript.optimizer.OptRuntime.callName(new java.lang.Object[]{org.mozilla.javascript.ScriptRuntime.add("总数量", org.mozilla.javascript.optimizer.OptRuntime.callName(new java.lang.Object[]{org.mozilla.javascript.optimizer.OptRuntime.wrapDouble(org.mozilla.javascript.ScriptRuntime.toNumber(org.mozilla.javascript.optimizer.OptRuntime.wrapDouble(org.mozilla.javascript.ScriptRuntime.toNumber(r5))) - org.mozilla.javascript.ScriptRuntime.toNumber(org.mozilla.javascript.optimizer.OptRuntime.oneObj))}, "Number", r21, r7))}, "log", r21, r7);
        org.mozilla.javascript.ScriptRuntime.addInstructionCount(r21, 258);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object _c_anonymous_180(org.autojs.autojspro.gen._7a9076d6d94e62c13d641aa71f19ae8e r20, org.mozilla.javascript.Context r21, org.mozilla.javascript.Scriptable r22, org.mozilla.javascript.Scriptable r23, java.lang.Object[] r24) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.autojs.autojspro.gen._7a9076d6d94e62c13d641aa71f19ae8e._c_anonymous_180(org.autojs.autojspro.gen._7a9076d6d94e62c13d641aa71f19ae8e, org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: _c_远程保存音乐列表名称_181, reason: contains not printable characters */
    private static Object m27_c__181(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, createFunctionActivation, "Skymusicname"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 182)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 113);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_182(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 2) {
            objArr = ScriptRuntime.padArguments(objArr, 2);
        }
        Object res = objArr[0];
        Object err = objArr[1];
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 46);
        if (ScriptRuntime.toBoolean(err)) {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName0("exit", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 77);
        }
        ScriptRuntime.addInstructionCount(context, 1);
        Object neirong = OptRuntime.callProp0(ScriptRuntime.getObjectProp(res, "body", context, parentScope), "string", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        Object neirong2 = OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(neirong, "substring", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(neirong, "indexOf", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "[通知内容开始]", context, parentScope), _k49, context), OptRuntime.wrapDouble(ScriptRuntime.toNumber(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(neirong, "indexOf", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "[通知内容结束]", context, parentScope)) - ScriptRuntime.toNumber(OptRuntime.oneObj)), context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        Object neirong3 = ScriptRuntime.add(ScriptRuntime.add("[", neirong2), "]");
        ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "ooooooooo"), _k29, context, parentScope, "ooooooooo");
        ScriptRuntime.addInstructionCount(context, 1);
        Double i = OptRuntime.zeroObj;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 179);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (!ScriptRuntime.cmp_LT(i, _k52)) {
                ScriptRuntime.addInstructionCount(context, 19);
                break;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 10);
            if (ScriptRuntime.eq(ScriptRuntime.name(context, parentScope, "ooooooooo"), _k29)) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, parentScope, "ooooooooo"), _k28, context, parentScope, "ooooooooo");
                ScriptRuntime.addInstructionCount(context, 25);
                break;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName(new Object[]{_k22}, "sleep", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 60);
            ScriptRuntime.addInstructionCount(context, 1);
            double number = ScriptRuntime.toNumber(i);
            i = OptRuntime.wrapDouble(1.0d + number);
            OptRuntime.wrapDouble(number);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 22);
        }
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "files"), "write", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, parentScope, "musicliebiao"), neirong3, context, parentScope);
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 39);
        return obj2;
    }

    /* renamed from: _c_加载加群信息_183, reason: contains not printable characters */
    private static Object m10_c__183(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k28, context, createFunctionActivation, "ooooooooo");
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, createFunctionActivation, "jiaqun"), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 184)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 113);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_184(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
            if (ScriptRuntime.toBoolean(ScriptRuntime.name(context, createFunctionActivation, "err"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName0("exit", context, createFunctionActivation);
                ScriptRuntime.addInstructionCount(context, 66);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "neirong"), OptRuntime.callProp0(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "res"), "body", context, createFunctionActivation), "string", context, createFunctionActivation), context, createFunctionActivation, "neirong");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "ooooooooo"), _k29, context, createFunctionActivation, "ooooooooo");
            ScriptRuntime.addInstructionCount(context, 1);
            Scriptable activation = ScriptRuntime.enterWith(ScriptRuntime.newObjectLiteral(new Object[]{"i"}, new Object[]{OptRuntime.zeroObj}, (int[]) null, context, createFunctionActivation), context, createFunctionActivation);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 113);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(ScriptRuntime.name(context, activation, "i"), _k52)) {
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 10);
                if (ScriptRuntime.eq(ScriptRuntime.name(context, activation, "ooooooooo"), _k29)) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, activation, "ooooooooo"), _k28, context, activation, "ooooooooo");
                    ScriptRuntime.addInstructionCount(context, 25);
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{_k22}, "sleep", context, activation);
                ScriptRuntime.addInstructionCount(context, 60);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.nameIncrDecr(activation, "i", context, 2);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 15);
            }
            Scriptable activation2 = ScriptRuntime.leaveWith(activation);
            OptRuntime.callSpecial(context, ScriptRuntime.getNameFunctionAndThis("eval", context, activation2), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, activation2, "neirong")}, activation2, scriptable2, 1, "", 2137);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 49);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    /* renamed from: _c_自检_185, reason: contains not printable characters */
    private static Object m23_c__185(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{"http://paidmusic.mnari.cn/jss/kuangjia.js", ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 186)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 88);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_186(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        if (objArr.length < 2) {
            objArr = ScriptRuntime.padArguments(objArr, 2);
        }
        Object res = objArr[0];
        Object err = objArr[1];
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 46);
        if (ScriptRuntime.toBoolean(err)) {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callName0("exit", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 77);
        }
        ScriptRuntime.addInstructionCount(context, 1);
        Object neirong = OptRuntime.callProp0(ScriptRuntime.getObjectProp(res, "body", context, parentScope), "string", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        Object neirong2 = OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(neirong, "substring", context, parentScope), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(neirong, "indexOf", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "[远程内容开始]", context, parentScope), _k5, context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(neirong, "indexOf", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "[远程内容结束]", context, parentScope), context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        Object neirong3 = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, parentScope, "JSON"), "parse", context, parentScope), ScriptRuntime.lastStoredScriptable(context), neirong2, context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 141);
        if (ScriptRuntime.shallowEq(ScriptRuntime.getObjectProp(neirong3, "OOOOO", context, parentScope), "true")) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            Double p = OptRuntime.zeroObj;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 198);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (!ScriptRuntime.cmp_LT(p, _k24)) {
                    break;
                }
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{ScriptRuntime.getObjectProp(neirong3, "OOOOON", context, parentScope)}, "toastLog", context, parentScope);
                OptRuntime.callName(new Object[]{_k15}, "sleep", context, parentScope);
                ScriptRuntime.addInstructionCount(context, 50);
                double number = ScriptRuntime.toNumber(p);
                p = OptRuntime.wrapDouble(1.0d + number);
                OptRuntime.wrapDouble(number);
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 22);
            }
            ScriptRuntime.addInstructionCount(context, 19);
            OptRuntime.callName0("exit", context, parentScope);
            ScriptRuntime.addInstructionCount(context, 9);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 5);
        }
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 3);
        return obj2;
    }

    private static Object _c_toCode_187(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object obj, double d, Object[] objArr) {
        if (obj == Void.TYPE) {
            obj = OptRuntime.wrapDouble(d);
        }
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        Object obj2 = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        Object w = ScriptRuntime.getObjectProp("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ", "length", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        Object a = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ", "split", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "", context, parentScope);
        ScriptRuntime.addInstructionCount(context, 1);
        Object s = "";
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        double i = 0.0d;
        ScriptRuntime.addInstructionCount(context, 117);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (i < ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(obj, "length", context, parentScope))) {
                ScriptRuntime.addInstructionCount(context, 1);
                Object b = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(obj, "charCodeAt", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.wrapDouble(i), context, parentScope);
                double b1 = ScriptRuntime.toNumber(b) % ScriptRuntime.toNumber(w);
                Object b2 = OptRuntime.wrapDouble((ScriptRuntime.toNumber(b) - b1) / ScriptRuntime.toNumber(w));
                double b22 = ScriptRuntime.toNumber(b2) % ScriptRuntime.toNumber(w);
                double b3 = ScriptRuntime.toNumber(OptRuntime.wrapDouble((ScriptRuntime.toNumber(b2) - b22) / ScriptRuntime.toNumber(w))) % ScriptRuntime.toNumber(w);
                s = ScriptRuntime.add(s, ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.getObjectIndex(a, b3, context), ScriptRuntime.getObjectIndex(a, b22, context), context), ScriptRuntime.getObjectIndex(a, b1, context), context), context);
                ScriptRuntime.addInstructionCount(context, 148);
                i += 1.0d;
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 13);
            } else {
                ScriptRuntime.addInstructionCount(context, 27);
                ScriptRuntime.addInstructionCount(context, 2);
                return s;
            }
        }
    }

    private static Object _c_fromCode_188(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "key"), "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ", context, createFunctionActivation, "key");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "w"), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "key"), "length", context, createFunctionActivation), context, createFunctionActivation, "w");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "d"), OptRuntime.zeroObj, context, createFunctionActivation, "d");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "s"), ScriptRuntime.newObject(ScriptRuntime.name(context, createFunctionActivation, "Array"), context, createFunctionActivation, new Object[]{OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "Math"), "floor", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "str"), "length", context, createFunctionActivation)) / ScriptRuntime.toNumber(_k3)), context, createFunctionActivation)}), context, createFunctionActivation, "s");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "b"), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "s"), "length", context, createFunctionActivation), context, createFunctionActivation, "b");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "i"), OptRuntime.zeroObj, context, createFunctionActivation, "i");
            ScriptRuntime.addInstructionCount(context, 261);
            while (true) {
                ScriptRuntime.addInstructionCount(context, 1);
                if (ScriptRuntime.cmp_LT(ScriptRuntime.name(context, createFunctionActivation, "i"), ScriptRuntime.name(context, createFunctionActivation, "b"))) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "b1"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "key"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "str"), "charAt", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "d"), context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "b1");
                    ScriptRuntime.nameIncrDecr(createFunctionActivation, "d", context, 2);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "b2"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "key"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "str"), "charAt", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "d"), context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "b2");
                    ScriptRuntime.nameIncrDecr(createFunctionActivation, "d", context, 2);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "b3"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "key"), "indexOf", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "str"), "charAt", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, createFunctionActivation, "d"), context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "b3");
                    ScriptRuntime.nameIncrDecr(createFunctionActivation, "d", context, 2);
                    ScriptRuntime.setObjectElem(ScriptRuntime.name(context, createFunctionActivation, "s"), ScriptRuntime.name(context, createFunctionActivation, "i"), ScriptRuntime.add(ScriptRuntime.add(OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "b1")) * ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "w")) * ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "w"))), OptRuntime.wrapDouble(ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "b2")) * ScriptRuntime.toNumber(ScriptRuntime.name(context, createFunctionActivation, "w"))), context), ScriptRuntime.name(context, createFunctionActivation, "b3"), context), context, createFunctionActivation);
                    ScriptRuntime.addInstructionCount(context, 362);
                    ScriptRuntime.nameIncrDecr(createFunctionActivation, "i", context, 2);
                    ScriptRuntime.addInstructionCount(context, 1);
                    ScriptRuntime.addInstructionCount(context, 15);
                } else {
                    ScriptRuntime.addInstructionCount(context, 30);
                    ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "b"), OptRuntime.callSpecial(context, ScriptRuntime.getNameFunctionAndThis("eval", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.add(ScriptRuntime.add("String.fromCharCode(", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "s"), "join", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), ",", context, createFunctionActivation)), ")")}, createFunctionActivation, scriptable2, 1, "", 2199), context, createFunctionActivation, "b");
                    Object name = ScriptRuntime.name(context, createFunctionActivation, "b");
                    ScriptRuntime.addInstructionCount(context, 97);
                    return name;
                }
            }
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_activation_189(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "http_Statue"), "false", context, createFunctionActivation, "http_Statue");
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "http_content"), "激活成功", context, createFunctionActivation, "http_content");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "http_"), "http://www.baidu.com/ACYUN_api.php?", context, createFunctionActivation, "http_");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "cc"), "joy1mRlGh4fKHIL", context, createFunctionActivation, "cc");
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 114);
            if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "aa"), "")) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "aa"), "000", context, createFunctionActivation, "aa");
                ScriptRuntime.addInstructionCount(context, 165);
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 5);
            if (ScriptRuntime.eq(ScriptRuntime.name(context, createFunctionActivation, "bb"), "")) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "bb"), "000", context, createFunctionActivation, "bb");
                ScriptRuntime.addInstructionCount(context, 55);
            }
            OptRuntime.callN(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "http"), "get", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.name(context, createFunctionActivation, "http_"), "aa="), ScriptRuntime.name(context, createFunctionActivation, "aa"), context), "&bb="), ScriptRuntime.name(context, createFunctionActivation, "bb"), context), "&cc="), ScriptRuntime.name(context, createFunctionActivation, "cc"), context), ScriptRuntime.newObjectLiteral(ScriptRuntime.emptyArgs, ScriptRuntime.emptyArgs, (int[]) null, context, createFunctionActivation), new _7a9076d6d94e62c13d641aa71f19ae8e(createFunctionActivation, context, 190)}, context, createFunctionActivation);
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 128);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_anonymous_190(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable createFunctionActivation = ScriptRuntime.createFunctionActivation(_7a9076d6d94e62c13d641aa71f19ae8eVar, _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope(), objArr, false);
        ScriptRuntime.enterActivationFunction(context, createFunctionActivation);
        try {
            Object[] objArr2 = ScriptRuntime.emptyArgs;
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 29);
            if (ScriptRuntime.toBoolean(ScriptRuntime.name(context, createFunctionActivation, "res"))) {
                ScriptRuntime.addInstructionCount(context, 1);
                OptRuntime.callName(new Object[]{ScriptRuntime.add("AIAXC:", OptRuntime.callProp0(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "res"), "body", context, createFunctionActivation), "string", context, createFunctionActivation))}, "log", context, createFunctionActivation);
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "zifuchuan"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, createFunctionActivation, "JSON"), "parse", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), OptRuntime.callProp0(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "res"), "body", context, createFunctionActivation), "string", context, createFunctionActivation), context, createFunctionActivation), context, createFunctionActivation, "zifuchuan");
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "This_OFremotely"), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "zifuchuan"), "OFremotely", context, createFunctionActivation), context, createFunctionActivation, "This_OFremotely");
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "This_remotely"), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "zifuchuan"), "remotely", context, createFunctionActivation)}, "String", context, createFunctionActivation), context, createFunctionActivation, "This_remotely");
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "http_Statue"), ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "zifuchuan"), "Statue", context, createFunctionActivation), context, createFunctionActivation, "http_Statue");
                ScriptRuntime.setName(ScriptRuntime.bind(context, createFunctionActivation, "http_content"), OptRuntime.callName(new Object[]{ScriptRuntime.getObjectProp(ScriptRuntime.name(context, createFunctionActivation, "zifuchuan"), "Message", context, createFunctionActivation)}, "String", context, createFunctionActivation), context, createFunctionActivation, "http_content");
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 336);
                if (ScriptRuntime.shallowEq(ScriptRuntime.name(context, createFunctionActivation, "This_OFremotely"), "true")) {
                    ScriptRuntime.addInstructionCount(context, 1);
                    OptRuntime.callSpecial(context, ScriptRuntime.getNameFunctionAndThis("eval", context, createFunctionActivation), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, createFunctionActivation, "This_remotely")}, createFunctionActivation, scriptable2, 1, "", 2228);
                    ScriptRuntime.addInstructionCount(context, 409);
                }
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.addInstructionCount(context, 5);
            }
            Object obj = Undefined.instance;
            ScriptRuntime.addInstructionCount(context, 3);
            return obj;
        } finally {
            ScriptRuntime.exitActivationFunction(context);
        }
    }

    private static Object _c_md5_191(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object obj, double d, Object[] objArr) {
        if (obj == Void.TYPE) {
            obj = OptRuntime.wrapDouble(d);
        }
        Scriptable parentScope = _7a9076d6d94e62c13d641aa71f19ae8eVar.getParentScope();
        ScriptRuntime.addInstructionCount(context, 1);
        Object call1 = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "java"), "math", context, parentScope), "BigInteger", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.oneObj, OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "java"), "security", context, parentScope), "MessageDigest", context, parentScope), "getInstance", context, parentScope), ScriptRuntime.lastStoredScriptable(context), "MD5", context, parentScope), "digest", context, parentScope), ScriptRuntime.lastStoredScriptable(context), OptRuntime.callProp0(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, parentScope, "java"), "lang", context, parentScope), "String", context, parentScope), ScriptRuntime.lastStoredScriptable(context), obj, context, parentScope), "getBytes", context, parentScope), context, parentScope), context, parentScope), "toString", context, parentScope), ScriptRuntime.lastStoredScriptable(context), _k12, context, parentScope);
        ScriptRuntime.addInstructionCount(context, 165);
        return call1;
    }

    private static Object _c_script_0(_7a9076d6d94e62c13d641aa71f19ae8e _7a9076d6d94e62c13d641aa71f19ae8eVar, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        ScriptRuntime.initScript(_7a9076d6d94e62c13d641aa71f19ae8eVar, scriptable2, context, scriptable, false);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 1), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 2), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 29), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 44), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 45), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 48), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 52), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 54), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 56), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 58), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 59), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 61), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 63), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 65), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 67), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 70), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 73), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 75), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 77), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 79), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 81), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 82), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 84), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 86), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 87), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 157), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 160), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 163), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 166), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 169), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 172), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 175), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 179), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 181), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 183), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 185), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 187), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 188), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 189), 1, scriptable, context);
        OptRuntime.initFunction(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 191), 1, scriptable, context);
        Object obj = Undefined.instance;
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "storage"), OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storages"), "create", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "AIAXC-定制光遇自动弹琴1.1", context, scriptable), context, scriptable, "storage");
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "卡片圆角"), "10dp", context, scriptable, "卡片圆角");
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "卡片小圆角"), "5dp", context, scriptable, "卡片小圆角");
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "卡片阴影"), "5dp", context, scriptable, "卡片阴影");
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "卡片大小"), "0", context, scriptable, "卡片大小");
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "卡片内部空隙"), "10 8", context, scriptable, "卡片内部空隙");
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "卡片一内部空隙"), "20 0 0 0", context, scriptable, "卡片一内部空隙");
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "头部颜色"), "#000000", context, scriptable, "头部颜色");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "激活状态"), "false", context, scriptable, "激活状态");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "版本号"), "2.3.3", context, scriptable, "版本号");
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "ui"), "statusBarColor", context, scriptable), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, scriptable, "头部颜色"), context, scriptable);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "$settings"), "setEnabled", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "stop_all_on_volume_up", Boolean.FALSE, context, scriptable);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "ui"), "layout", context, scriptable), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.newObject(ScriptRuntime.name(context, scriptable, "XML"), context, scriptable, new Object[]{ScriptRuntime.add(ScriptRuntime.add("<vertical>\n        <horizontal margin=\"10 30 10 5\">\n            <frame layout_gravity=\"center|left\" layout_weight=\"1\">\n                <text text=\"SKY南辞自动弹琴\" margin=\"2 0\" textSize=\"26sp\" textColor=\"#000000\" layout_gravity=\"center|left\" layout_weight=\"1\" />\n            </frame>\n            <frame layout_gravity=\"center|right\" layout_weight=\"1\">\n                <img w=\"40\" h=\"40\" src=\"file://images/3720.png\" radius=\"20\" layout_gravity=\"center|right\" layout_weight=\"1\" />\n            </frame>\n        </horizontal>\n        <frame h=\"*\">\n            <ScrollView>\n                <vertical>\n\n                    <card cardBackgroundColor=\"#25b0c6\" w=\"*\" h=\"auto\" margin=\"10 20 10 5\" cardCornerRadius=\"{{卡片圆角}}\">\n                        <vertical padding=\"{{卡片内部空隙}}\" h=\"auto\">\n                            <horizontal margin=\"5\" >\n                                <text text=\"由FMVP团队开发\" margin=\"2 0\" textSize=\"26sp\" textColor=\"#ffffff\" layout_gravity=\"center\" />\n                                <card layout_gravity=\"center\" cardCornerRadius=\"{{卡片小圆角}}\" cardBackgroundColor=\"#777777\" margin=\"6 0 0 0\" id=\"zxgg0\">\n                                    <text id=\"zxgg\" margin=\"3 3\" text=\"公告\" textSize=\"16sp\" textColor=\"#ffffff\" />\n                                </card>\n                                <card layout_gravity=\"center\" cardCornerRadius=\"{{卡片小圆角}}\" cardBackgroundColor=\"#777777\" margin=\"3 0 0 0\" id=\"sysm0\">\n                                    <text id=\"sysm\" margin=\"3 3\" text=\"说明\" textSize=\"16sp\" textColor=\"#ffffff\" />\n                                </card>\n                                <card layout_gravity=\"center\" cardCornerRadius=\"{{卡片小圆角}}\" cardBackgroundColor=\"#777777\" margin=\"3 0 0 0\" id=\"zxgg0\">\n                                    <text id=\"gypw\" margin=\"3 3\" text=\"开发中\" textSize=\"16sp\" textColor=\"#ffffff\" />\n                                </card>\n                                <card layout_gravity=\"center\" cardCornerRadius=\"{{卡片小圆角}}\" cardBackgroundColor=\"#777777\" margin=\"3 0 0 0\" id=\"sysm0\">\n                                    <text id=\"gyfl\" margin=\"3 3\" text=\"开发中\" textSize=\"16sp\" textColor=\"#ffffff\" />\n                                </card>\n                            </horizontal>\n                            <frame h=\"auto\">\n                                <vertical>\n                                    <text id=\"tongzhi\" text=\"\" textColor=\"#ffffff\" textSize=\"14sp\" line=\"8\" margin=\"10 5\" ellipsize=\"marquee\" />\n                                </vertical>\n                            </frame>\n                        </vertical>\n                    </card>\n                    <card cardBackgroundColor=\"#fe937f\" w=\"*\" h=\"auto\" margin=\"10 5\" cardCornerRadius=\"{{卡片圆角}}\">\n                        <vertical padding=\"{{卡片内部空隙}}\" h=\"auto\">\n                            <horizontal>\n                                <horizontal layout_weight=\"1\" gravity=\"center\">\n                                    <vertical>\n                                        <text margin=\"3 3\" text=\"今日添加\" textSize=\"16sp\" textColor=\"#ffffff\" gravity=\"center\" />\n                                        <text id=\"jrtj\" margin=\"3 3\" text=\"0\" textSize=\"16sp\" textColor=\"#ffffff\" gravity=\"center\" />\n                                    </vertical>\n                                </horizontal>\n                                <text margin=\"3 3\" text=\"|\" textSize=\"40sp\" textColor=\"#ffffff\" layout_gravity=\"center\" />\n                                <horizontal layout_weight=\"1\" gravity=\"center\">\n                                    <vertical>\n                                        <text margin=\"3 3\" text=\"总歌曲\" textSize=\"16sp\" textColor=\"#ffffff\" gravity=\"center\" />\n                                        <text id=\"zgq\" margin=\"3 3\" text=\"0\" textSize=\"16sp\" textColor=\"#ffffff\" gravity=\"center\" />\n                                    </vertical>\n                                </horizontal>\n                            </horizontal>\n                        </vertical>\n                    </card>\n\n                    <horizontal>\n                        <card cardBackgroundColor=\"#f6a2cb\" layout_weight=\"1\" h=\"auto\" margin=\"10 5 5 5\" cardCornerRadius=\"{{卡片圆角}}\">\n                            <vertical padding=\"{{卡片内部空隙}}\" h=\"auto\">\n                                <horizontal>\n                                    <Switch id=\"无障碍\" text=\"无障碍服务\" w=\"*\" checked=\"{{auto.service != null}}\" padding=\"8 5\" textColor=\"#ffffff\" textSize=\"18sp\" textStyle=\"bold\" />\n                                </horizontal>\n                            </vertical>\n                        </card>\n                        <card cardBackgroundColor=\"#5ad6b8\" layout_weight=\"1\" h=\"auto\" margin=\"5 5 10 5\" cardCornerRadius=\"{{卡片圆角}}\">\n                            <vertical padding=\"{{卡片内部空隙}}\" h=\"auto\">\n                                <horizontal>\n                                    <Switch id=\"悬浮窗\" text=\"悬浮框权限\" w=\"*\" checked=\"\" padding=\"8 5\" textColor=\"#ffffff\" textSize=\"18sp\" textStyle=\"bold\" />\n                                </horizontal>\n                            </vertical>\n                        </card>\n                    </horizontal>\n\n                    <card cardBackgroundColor=\"#34b869\" w=\"*\" h=\"auto\" margin=\"10 5\" cardCornerRadius=\"{{卡片圆角}}\">\n                        <vertical padding=\"{{卡片内部空隙}}\" h=\"auto\">\n                            <horizontal>\n                                <Switch id=\"录屏模式\" text=\"录屏模式(使用音量减键完全隐藏浮窗)\" w=\"*\" checked=\"\" padding=\"8 5\" textColor=\"#ffffff\" textSize=\"18sp\" textStyle=\"bold\" />\n                            </horizontal>\n                        </vertical>\n                    </card>\n                    <card cardBackgroundColor=\"#dfa2f6\" w=\"*\" h=\"auto\" margin=\"10 5\" cardCornerRadius=\"{{卡片圆角}}\">\n                        <vertical padding=\"{{卡片内部空隙}}\" h=\"auto\">\n                            <horizontal>\n                                <Switch id=\"监控上键\" text=\"音量加暂停弹奏\" w=\"*\" checked=\"\" padding=\"8 5\" textColor=\"#ffffff\" textSize=\"18sp\" textStyle=\"bold\" />\n                            </horizontal>\n                        </vertical>\n                    </card>\n                    <card cardBackgroundColor=\"#dfa2f6\" w=\"*\" h=\"auto\" margin=\"10 5\" cardCornerRadius=\"{{卡片圆角}}\">\n                        <vertical padding=\"{{卡片内部空隙}}\" h=\"auto\">\n                            <horizontal>\n                                <Switch id=\"监控下键\" text=\"音量减隐藏浮窗\" w=\"*\" checked=\"\" padding=\"8 5\" textColor=\"#ffffff\" textSize=\"18sp\" textStyle=\"bold\" />\n                            </horizontal>\n                        </vertical>\n                    </card>\n\n\n                    \n                        ", ScriptRuntime.escapeTextValue("", context)), "\n\n                    <horizontal>\n                        <card cardBackgroundColor=\"#a2d7f6\" w=\"*\" h=\"auto\" margin=\"10 5\" cardCornerRadius=\"{{卡片圆角}}\" layout_weight=\"1\">\n                            <vertical h=\"auto\" layout_weight=\"1\">\n                                <horizontal gravity=\"center\">\n                                    <button id=\"开启悬浮框\" text=\"开启悬浮框\" w=\"*\" textColor=\"#ffffff\" textSize=\"16sp\" textStyle=\"bold\" style=\"Widget.AppCompat.Button.Borderless.Colored\" />\n                                </horizontal>\n                            </vertical>\n                        </card>\n                    </horizontal>\n\n                    <horizontal>\n                        <card cardBackgroundColor=\"#a2f6b8\" w=\"*\" h=\"auto\" margin=\"10 5 5 5\" cardCornerRadius=\"{{卡片圆角}}\" layout_weight=\"1\">\n                            <vertical padding=\"10 0\" h=\"auto\">\n                                <horizontal gravity=\"center\" h=\"50\">\n                                    <text text=\"稳定模式\" textColor=\"#ffffff\" textSize=\"16sp\" />\n                                    <checkbox textColor=\"#ffffff\" id=\"国服\" textStyle=\"bold\" checked='true' gravity=\"right\" />\n                                </horizontal>\n                            </vertical>\n                        </card>\n                        <card cardBackgroundColor=\"#a2f6b8\" w=\"*\" h=\"auto\" margin=\"5 5 10 5\" cardCornerRadius=\"{{卡片圆角}}\" layout_weight=\"1\" >\n                            <vertical padding=\"10 0\" h=\"auto\">\n                                <horizontal gravity=\"center\" h=\"50\">\n                                    <text text=\"兼容模式\" textColor=\"#ffffff\" textSize=\"16sp\" />\n                                    <checkbox textColor=\"#ffffff\" id=\"国际服\" textStyle=\"bold\" gravity=\"right\" />\n                                </horizontal>\n                            </vertical>\n                        </card>\n                    </horizontal>\n\n                    <text text=\"SKY自动弹琴V{{版本号}}\" textColor=\"#666666\" textSize=\"12sp\" gravity=\"center\" />\n                </vertical>\n            </ScrollView>\n        </frame>\n    </vertical>")}), context, scriptable);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "isCanFinish"), Boolean.FALSE, context, scriptable, "isCanFinish");
        ScriptRuntime.addInstructionCount(context, 1);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, scriptable, "ui"), "emitter", context, scriptable), "on", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "back_pressed", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 3), context, scriptable, scriptable2), context, scriptable);
        OptRuntime.callName(new Object[]{ScriptRuntime.add("前台服务: ", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "$settings"), "isEnabled", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "foreground_service", context, scriptable))}, "log", context, scriptable);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "$settings"), "setEnabled", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "foreground_service", Boolean.TRUE, context, scriptable);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "状态"), "oooo", context, scriptable, "状态");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "开启悬浮框状态"), "false", context, scriptable, "开启悬浮框状态");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "请求网络乐谱地址"), "http://paidmusic.mnari.cn/music/", context, scriptable, "请求网络乐谱地址");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "Skymusicname"), "http://paidmusic.mnari.cn/jss/musicname.js", context, scriptable, "Skymusicname");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "Skymusicliebiao"), "http://paidmusic.mnari.cn/jss/musicliebiao.js", context, scriptable, "Skymusicliebiao");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "Skytongzhi"), "http://paidmusic.mnari.cn/jss/tongzhi.js", context, scriptable, "Skytongzhi");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "SkyUpdate"), "http://paidmusic.mnari.cn/jss/update.js", context, scriptable, "SkyUpdate");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "aaaaaaaaa"), "http://baidu.com/sky/api.php?a=", context, scriptable, "aaaaaaaaa");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "aaaaaaaac"), "http://baidu.com/sky/api2.php?a=", context, scriptable, "aaaaaaaac");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "shabi"), "http://www.baidu.com", context, scriptable, "shabi");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "jianima"), "http://www.baidu.com", context, scriptable, "jiaqun");
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "_0xodB"), "jsjiami.com.v6", context, scriptable, "_0xodB");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "_0x2826"), OptRuntime.newArrayLiteral(new Object[]{ScriptRuntime.name(context, scriptable, "_0xodB"), "TTMjRsOLw69+XyzCjgosAsKKw4PDmQ==", "MRJXDyfDrhDCgcO6BMK5", "aD0eAsK8wqsLYgzCr30yGcKSw7/DssKGeMK0wpbClsKTwoZFHMKewoLDkw==", "jhFsjAiami.cfoplGImH.vz6OKexnfr=="}, (String) null, 0, context, scriptable), context, scriptable, "_0x2826");
        OptRuntime.callN(ScriptRuntime.getValueFunctionAndThis(new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 5), context), ScriptRuntime.lastStoredScriptable(context), new Object[]{ScriptRuntime.name(context, scriptable, "_0x2826"), _k0, _k1}, context, scriptable);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "_0x474a"), new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 7), context, scriptable, "_0x474a");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "YUANCHENGZIJIAN"), ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(ScriptRuntime.add(OptRuntime.callName(new Object[]{"0", "b#1V"}, "_0x474a", context, scriptable), OptRuntime.callName(new Object[]{"1", "b#1V"}, "_0x474a", context, scriptable), context), "LzZHR1ZEOGphZz09"), "/16269"), OptRuntime.callName(new Object[]{"2", "l1jr"}, "_0x474a", context, scriptable), context), context, scriptable, "YUANCHENGZIJIAN");
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "_0xodB"), "jsjiami.com.v6", context, scriptable, "_0xodB");
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "threads"), "start", context, scriptable), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(scriptable, context, 11), context, scriptable);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(OptRuntime.callProp0(ScriptRuntime.name(context, scriptable, "activity"), "getWindow", context, scriptable), "setSoftInputMode", context, scriptable), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, scriptable, "android"), "view", context, scriptable), "WindowManager", context, scriptable), "LayoutParams", context, scriptable), "SOFT_INPUT_STATE_ALWAYS_HIDDEN", context, scriptable), context, scriptable);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1939);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (!ScriptRuntime.toBoolean(OptRuntime.callName0("jiazaitongzhiannouncement", context, scriptable))) {
                break;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 10);
        }
        ScriptRuntime.addInstructionCount(context, 22);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 5);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (!ScriptRuntime.toBoolean(OptRuntime.callName0("jiazaijinrishuliang", context, scriptable))) {
                break;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 10);
        }
        ScriptRuntime.addInstructionCount(context, 22);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 5);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (!ScriptRuntime.toBoolean(OptRuntime.callName0("jiazaizongshuliang", context, scriptable))) {
                break;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 10);
        }
        ScriptRuntime.addInstructionCount(context, 22);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 5);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (!ScriptRuntime.toBoolean(OptRuntime.callName0("jiazaigonggaogengxintankuang", context, scriptable))) {
                break;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 10);
        }
        ScriptRuntime.addInstructionCount(context, 22);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "musicliebiao"), "likemusic/musicliebiao", context, scriptable, "musicliebiao");
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "files"), "createWithDirs", context, scriptable), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, scriptable, "musicliebiao"), context, scriptable);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "musilikecliebiao"), "likemusic/musilikecliebiao", context, scriptable, "musilikecliebiao");
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "files"), "createWithDirs", context, scriptable), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, scriptable, "musilikecliebiao"), context, scriptable);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "musilikecliebiaoID"), "likemusic/musilikecliebiaoID", context, scriptable, "musilikecliebiaoID");
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "files"), "createWithDirs", context, scriptable), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.name(context, scriptable, "musilikecliebiaoID"), context, scriptable);
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "likemusiczs"), "likemusic/zs", context, scriptable, "likemusiczs");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "likemusic"), "likemusic/", context, scriptable, "likemusic");
        ScriptRuntime.setName(ScriptRuntime.bind(context, scriptable, "jianweixinxi"), "cookie/jianweixinxi", context, scriptable, "jianweixinxi");
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "remove", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "音乐列表", context, scriptable);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "remove", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "音乐编号", context, scriptable);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "remove", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "SheetMusic", context, scriptable);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 326);
        Object call1 = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "get", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "录屏模式", context, scriptable);
        if (call1 == null || call1 == Undefined.instance || ScriptRuntime.eq(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "get", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "录屏模式", context, scriptable), "")) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 423);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, scriptable, "ui"), "录屏模式", context, scriptable), "checked", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "get", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "录屏模式", context, scriptable), context, scriptable);
            ScriptRuntime.addInstructionCount(context, 59);
        }
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 5);
        Object call12 = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "get", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "监控下键", context, scriptable);
        if (call12 == null || call12 == Undefined.instance || ScriptRuntime.eq(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "get", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "监控下键", context, scriptable), "")) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 100);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, scriptable, "ui"), "监控下键", context, scriptable), "checked", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "get", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "监控下键", context, scriptable), context, scriptable);
            ScriptRuntime.addInstructionCount(context, 59);
        }
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 5);
        Object call13 = OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "get", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "监控上键", context, scriptable);
        if (call13 == null || call13 == Undefined.instance || ScriptRuntime.eq(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "get", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "监控上键", context, scriptable), "")) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 100);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, scriptable, "ui"), "监控上键", context, scriptable), "checked", OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "get", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "监控上键", context, scriptable), context, scriptable);
            ScriptRuntime.addInstructionCount(context, 59);
        }
        ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, scriptable, "ui"), "监控上键", context, scriptable), "checked", Boolean.TRUE, context, scriptable);
        ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, scriptable, "ui"), "监控下键", context, scriptable), "checked", Boolean.TRUE, context, scriptable);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 63);
        if (ScriptRuntime.shallowEq(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "get", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "国服", context, scriptable), Boolean.TRUE)) {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, scriptable, "ui"), "国服", context, scriptable), "checked", Boolean.TRUE, context, scriptable);
            ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, scriptable, "ui"), "国际服", context, scriptable), "checked", Boolean.FALSE, context, scriptable);
            ScriptRuntime.addInstructionCount(context, 172);
        } else {
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 5);
            if (ScriptRuntime.shallowEq(OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, scriptable, "storage"), "get", context, scriptable), ScriptRuntime.lastStoredScriptable(context), "国际服", context, scriptable), Boolean.TRUE)) {
                ScriptRuntime.addInstructionCount(context, 1);
                ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, scriptable, "ui"), "国际服", context, scriptable), "checked", Boolean.TRUE, context, scriptable);
                ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, scriptable, "ui"), "国服", context, scriptable), "checked", Boolean.FALSE, context, scriptable);
                ScriptRuntime.addInstructionCount(context, 113);
            }
            ScriptRuntime.addInstructionCount(context, 1);
        }
        OptRuntime.callName0("远程保存音乐列表", context, scriptable);
        OptRuntime.callName0("远程保存音乐列表名称", context, scriptable);
        ScriptRuntime.addInstructionCount(context, 1);
        Scriptable global = ScriptRuntime.enterWith(ScriptRuntime.newObjectLiteral(new Object[]{"index"}, new Object[]{OptRuntime.oneObj}, (int[]) null, context, scriptable), context, scriptable);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 67);
        while (true) {
            ScriptRuntime.addInstructionCount(context, 1);
            if (!ScriptRuntime.cmp_LT(ScriptRuntime.name(context, global, "index"), _k2)) {
                break;
            }
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.name(context, global, "storage"), "remove", context, global), ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.add("查找记录", ScriptRuntime.name(context, global, "index")), context, global);
            ScriptRuntime.addInstructionCount(context, 46);
            ScriptRuntime.nameIncrDecr(global, "index", context, 2);
            ScriptRuntime.addInstructionCount(context, 1);
            ScriptRuntime.addInstructionCount(context, 15);
        }
        ScriptRuntime.addInstructionCount(context, 25);
        Scriptable global2 = ScriptRuntime.leaveWith(global);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "ui"), "sysm", context, global2), "click", context, global2), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(global2, context, 15), context, global2);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "ui"), "zxgg", context, global2), "click", context, global2), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(global2, context, 16), context, global2);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "ui"), "gypw", context, global2), "click", context, global2), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(global2, context, 17), context, global2);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "ui"), "gyfl", context, global2), "click", context, global2), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(global2, context, 18), context, global2);
        ScriptRuntime.addInstructionCount(context, 1);
        ScriptRuntime.addInstructionCount(context, 194);
        if (!ScriptRuntime.toBoolean(OptRuntime.callProp0(ScriptRuntime.name(context, global2, "$power_manager"), "isIgnoringBatteryOptimizations", context, global2))) {
            ScriptRuntime.addInstructionCount(context, 1);
            OptRuntime.callProp0(ScriptRuntime.name(context, global2, "$power_manager"), "requestIgnoreBatteryOptimizations", context, global2);
            ScriptRuntime.addInstructionCount(context, 249);
        }
        ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "ui"), "无障碍", context, global2), "checked", ScriptRuntime.toBoolean(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "auto"), "service", context, global2)) ? Boolean.TRUE : Boolean.FALSE, context, global2);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "ui"), "无障碍", context, global2), "on", context, global2), ScriptRuntime.lastStoredScriptable(context), "check", new _7a9076d6d94e62c13d641aa71f19ae8e(global2, context, 19), context, global2);
        ScriptRuntime.setObjectProp(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "ui"), "悬浮窗", context, global2), "checked", ScriptRuntime.toBoolean(OptRuntime.callProp0(ScriptRuntime.name(context, global2, "floaty"), "checkPermission", context, global2)) ? Boolean.TRUE : Boolean.FALSE, context, global2);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "ui"), "悬浮窗", context, global2), "on", context, global2), ScriptRuntime.lastStoredScriptable(context), "check", new _7a9076d6d94e62c13d641aa71f19ae8e(global2, context, 20), context, global2);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "ui"), "录屏模式", context, global2), "on", context, global2), ScriptRuntime.lastStoredScriptable(context), "check", new _7a9076d6d94e62c13d641aa71f19ae8e(global2, context, 21), context, global2);
        OptRuntime.call2(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "ui"), "开启悬浮框", context, global2), "on", context, global2), ScriptRuntime.lastStoredScriptable(context), "resume", OptRuntime.bindThis(new _7a9076d6d94e62c13d641aa71f19ae8e(global2, context, 22), context, global2, scriptable2), context, global2);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "ui"), "国际服", context, global2), "click", context, global2), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(global2, context, 24), context, global2);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "ui"), "国服", context, global2), "click", context, global2), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(global2, context, 25), context, global2);
        OptRuntime.call1(ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.getObjectProp(ScriptRuntime.name(context, global2, "ui"), "开启悬浮框", context, global2), "click", context, global2), ScriptRuntime.lastStoredScriptable(context), new _7a9076d6d94e62c13d641aa71f19ae8e(global2, context, 26), context, global2);
        OptRuntime.callName(new Object[]{"agjUWZDfjlaLqzPiHWMhuGrDraE1JQ", "AAAAAAAAAAAA"}, "activation", context, global2);
        Object name = ScriptRuntime.setName(ScriptRuntime.bind(context, global2, "http_Statue"), "false", context, global2, "http_Statue");
        ScriptRuntime.addInstructionCount(context, 501);
        return name;
    }
}