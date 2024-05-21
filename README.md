# FinalHomework_Lienyu
> 都江堰旅游app，安卓Java期末大作业罢
A Student From SWPU. 文件结构有些乱，有空再整理吧
因为这个月是考试周，所以之前一直在复习数据库、马原、计算机系统，这个安卓只用了两天来做，当然也两天没洗澡...
1点睡7点起，真是太折磨了，文件结构很混乱请见谅。
中英文夹杂的话，就当是我是在准备六级考试

# 屏幕截图
一些作业截图

<img alt="picture 0" src="https://cdn.jsdelivr.net/gh/LeonYew-SWPU/FileTem@main/imgs/a632eea3861f709e99347c689dfe47cd851efe20315626082c55e54ca9035f33.png" width="200" />  <img alt="picture 1" src="https://cdn.jsdelivr.net/gh/LeonYew-SWPU/FileTem@main/imgs/a486699a977b2430679ce2c66181cf8a54896ff88d13d8ed21a7e749a049fee5.png" width="200" />  <img alt="picture 2" src="https://cdn.jsdelivr.net/gh/LeonYew-SWPU/FileTem@main/imgs/941b25d839955a88b19fb51b3f87fd32950d504de379f33c292567df2b47d167.png" width="200" />  <img alt="picture 3" src="https://cdn.jsdelivr.net/gh/LeonYew-SWPU/FileTem@main/imgs/bf02d081143526727fae81a23ab3890a210dfa065a382155fb7aeb37e5175d3c.png" width="200" />  <img alt="picture 4" src="https://cdn.jsdelivr.net/gh/LeonYew-SWPU/FileTem@main/imgs/867b5a6c4c0d50c42fdcd048a717c3db293ec0a0a2bc9cc3d7bc0370e50d8778.png" width="200" />  <img alt="picture 5" src="https://cdn.jsdelivr.net/gh/LeonYew-SWPU/FileTem@main/imgs/55de4cae9b4f24b9a18196c37503ab88517b23e299de97109a5e2dc8d7361d16.png" width="200" />  <img alt="picture 6" src="https://cdn.jsdelivr.net/gh/LeonYew-SWPU/FileTem@main/imgs/701ea3ff4b7fa568c0ebd1b0967081f85cbde239186fb477f50353ea73e8c7e5.png" width="200" />  <img alt="picture 7" src="https://cdn.jsdelivr.net/gh/LeonYew-SWPU/FileTem@main/imgs/7dfcc0836bf099fd1e8b1a9b727340bcfef5984ffa9ffbc7e2d4b8ad094016c0.png" width="200" />  <img alt="picture 8" src="https://cdn.jsdelivr.net/gh/LeonYew-SWPU/FileTem@main/imgs/4f1ddcd587f3dff4c7772296deb96b52f3f15552acb5e06d25c10ab2e0bf31da.png" width="200" />  <img alt="picture 9" src="https://cdn.jsdelivr.net/gh/LeonYew-SWPU/FileTem@main/imgs/c4db1ac546df4e4c87554411627e516a792db34491f4c878786ff44660df86c9.png" width="200" />  <img alt="picture 10" src="https://cdn.jsdelivr.net/gh/LeonYew-SWPU/FileTem@main/imgs/982b54b5ea283d41569fccb223192e619f1a51c505acfe45cd3674d412152123.png" width="200" />  <img alt="picture 11" src="https://cdn.jsdelivr.net/gh/LeonYew-SWPU/FileTem@main/imgs/f4c69b6d97ab5aba77120426a45495b0f5b24ffc7fb764f121dda1442717f34f.png" width="200" />  

# 如何使用？
## 方法一：Fork本项目再用Git同步你的AndroidStudio
## 方法二：Code -> Download Zip -> Unzip -> Import to Android Studio
## 图文教程
都是讲怎么把项目导入AS的
- https://www.codenong.com/25348339/
- https://blog.csdn.net/RPG6666/article/details/81322149
- https://www.cnblogs.com/CoolRandy/articles/4652557.html

# 已实现的功能及使用到的知识
  - 首页
    -  轮播图 
      -  ViewPager
      -  ZoomOutPageTransformer
    -  3条公告列表 
      -  ListView
      -  ArrayAdapter
    -  都江堰概况
      - ScrollView 
    -  初识度假村
      -  ListView + Modify xml
      -  ViewPager + ScrollView
    -  门票预定
      - SQLite
      - SQLiteDataBaseHelpr 
    -  精彩活动
      - GridView
      - Modify xml 
  - 智游
    - ListView
    - ViewPager
    - SimpleAdapter
  - 我的
    - RoundImageView
    - SharedPreference 记住登录状态
    - UserDBHelper

# 我可能还会更新这些

- 更新页面配色和UI
- 数据：从网页获取而不是内嵌
- 首页
  - 轮播图的进度指示器
  - 轮播图新闻的标题
  - 轮播图自动切换Timer
  - 公告长文字的横向滚动
- 智游
  - 纵向TabLayout
- 个人中心
  - 修改头像
  - 个人信息修改

# 我所用的速成方式
推荐图文教程为主，不懂的时候就跟着教程思路，用笔画画流程图和关系图，理解各 method 和各 class 之间的关系以及 adapter 和各种 view, item之间的关系

- [菜鸟教程](https://www.runoob.com/w3cnote/android-tutorial-intro.html)
- [RecyclerView最简入门](https://www.bilibili.com/video/BV1cz411z74r/)
- [android入门必看六分钟学会RecyclerView | 基础知识](https://www.bilibili.com/video/BV1YW4y177tk/)
- [2022 最新 Android 基础教程，从开发入门到项目实战，看它就够了，更新中](https://www.bilibili.com/video/BV19U4y1R7zV/) )
