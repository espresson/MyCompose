package com.example.mytest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mytest.ui.theme.MyTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         *这是一个函数/方法，设置页面的主要内容，
         * 它接受一个 lambda 表达式作为参数，
         * 这个 lambda 表达式包含了整个界面的布局
        */
        setContent {
            /**
             *定义了一个自定义的主题，
             * 包含了该应用程序中所有可供定制的颜色和属性。
             * MyTestTheme 是通过 compose.material.MaterialTheme 所提供的一个默认主题进行扩展的。
            */
            MyTestTheme {
                // A surface container using the 'background' color from the theme
                /**
                 * 定义了一个页面的表面容器，
                 * 使用了从主题中获取的“background”颜色作为背景色。
                 * Modifier.fillMaxSize() 用来指定该 Surface 组件的大小，填充整个屏幕。
                 */
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    /**
                     * 这个就是我们定义的组件
                     */
                    Greeting("Android")
                }
            }
        }
    }
}

/**
 * 自定义的组件
 *
 * @Composable 是一个注解，
 * 用于标记一个函数是 Compose 函数，
 * 就可以在函数中使用 Compose API 创建用户界面。
 * 被标记为 @Composable 的函数可以被其它 Compose 函数调用，以组合成更复杂的用户界面。
 * 使用 @Composable 注解后，
 * 函数的返回值类型必须是 @Composable () -> Unit，即一个不带参数的函数，返回值为空。
 *
 */
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

/**
 * 使用 @Preview 注释和 MyTestTheme 来预览应用程序的外观，展示 Greeting 组件的样式和布局。
 * 这个紧紧让我们展示的，运行app的时候不走
 */
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyTestTheme {
        Greeting("Android")
    }
}