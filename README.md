# FinalHomework_Lienyu
> 都江堰旅游app，安卓期末大作业罢
A Student From SWPU. 文件结构有些乱，有空再整理吧
因为这个月是考试周，所以之前一直在复习数据库、马原、计算机系统，这个安卓只用了两天来做，当然也两天没洗澡...
1点睡7点起，真是太折磨了，文件结构很混乱请见谅。
中英文夹杂的话，就当是我是在准备六级考试

# 屏幕截图
一些作业截图
<img src="http://image.kypeople.cn/WoiBma.png" alt="Screenshot_1685017878.png" title="Screenshot_1685017878.png"  width = 20% height = 20%/><img src="http://image.kypeople.cn/rxcQRD.png" alt="Screenshot_1685026737.png" title="Screenshot_1685026737.png" width = 20% height = 20%/><img src="http://image.kypeople.cn/wu3exC.png" alt="Screenshot_1685026744.png" title="Screenshot_1685026744.png" width = 20% height = 20% /><img src="http://image.kypeople.cn/znNpls.png" alt="Screenshot_1685026741.png" title="Screenshot_1685026741.png" width = 20% height = 20% />

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
