### object 使用
1、用来实现接口
~~~
window.addMouseListener(object : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) { /*……*/ }

    override fun mouseEntered(e: MouseEvent) { /*……*/ }
})
~~~

2、只是需要一个对象，没有类型要求，可以这样写
~~~
fun foo() {
    //我就是想要一个对象，这个对象有两个属性，仅此而已。
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }
    print(adHoc.x + adHoc.y)
}
~~~

3、可用来做对象声明
~~~
声明
object DataProviderManager {
    fun registerDataProvider(provider: DataProvider) {
        // ……
    }

    val allDataProviders: Collection<DataProvider>
        get() = // ……
}
使用
DataProviderManager.registerDataProvider(……)
~~~

4、companion 伴生对象 类似 util 中的静态方法
~~~
class MathUtil{
    //加法
    companion object{
        fun Add(i: Int, j: Int): Int {
            return i + j
        }
    }
}
 MathUtil.Add(2 , 3)
~~~
