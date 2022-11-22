# Account
（1）设计一个名为Account的账户类，要求如下：

    包含的属性如下：

    1）int类型的私有属性id，表示账号。

    2）double类型的私有属性balance，表示账户余额。

    3）Date类型的私有属性dateCreated，表示开户日期。

    包含的方法如下：

    1）创建无参构造函数（id和balance默认为0，dateCreated为当前日期）

    2）创建有参构造函数（id和balance通过参数赋值，dateCreated为当前日期）

    3）创建id和balance属性的读、写方法，创建dateCreated属性的读方法

    4）创建方法withDraw，表示从账户取款

    5）创建方法deposit，表示向账户存款



（2）设计一个测试类TestAccount，使用上述Account类来模拟一台ATM机。在main方法中创建一个账户（id为1，balance为100），系统显示如下所示主菜单，用户选择不同选项，然后系统执行相应操作：
https://p.ananas.chaoxing.com/star3/origin/68e4bccdd9c286bacc49bfb6f333c60b.png
