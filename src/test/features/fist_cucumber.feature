#language: zh-CN
  功能:163登录功能
    @Automation @p1
    场景: 测试正确的账号登录
      当我打开sina网址
      并且我在email文本框输入"huixu1208@sina.com"
      并且我在密码框输入"huixu5678"
      当我点击登录按钮
      那么我登录成功
    @p1
    场景: 测试正确的账号登录2
      当我打开sina网址
      并且我用用户名:"huixu1208@sina.com",密码:"huixu5678"登录
      并且我登录成功
      并且关闭浏览器
    @p0
    场景大纲:测试正确的账号登录3
      当我打开网址
      并且我在email文本框输入"<username>"
      并且我在密码框输入"<password>"
      那么我登录成功2

      例子:
        | username | password |
        | test1    | pwd1     |
        | test2    | pwd2     |


