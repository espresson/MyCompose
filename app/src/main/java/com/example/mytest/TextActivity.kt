package com.example.mytest

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.Paragraph
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontFamily.Companion.SansSerif
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.mytest.ui.theme.MyTestTheme
import java.time.format.TextStyle

class TextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@SuppressLint("RememberReturnType")
@Composable
fun Greeting2(name: String) {
    Column {
        Text(text = "text 显示的文本内容 $name!")
        Text(text ="modifier 用于定位、调整和增强组件的修饰符",modifier = Modifier.height(14.dp) )
        Text(text ="color：文本颜色",modifier = Modifier.fillMaxWidth(),color = MaterialTheme.colors.primary)
        Text(text ="fontSize：文本大小",Modifier.fillMaxWidth(), color = Color.Blue, fontSize = 20.sp)
        /**
         * FontStyle是一个枚举类，其中包括以下常量：
            Normal：正常字体
            Italic：斜体字体
            Oblique：倾斜字体
         */
        Text(text = "fontStyle：文本风格，如普通、粗体、斜体等", color =  Color(0xFF123456), fontStyle = FontStyle.Italic )// 定义自定义颜色,Italic 斜体
        Text(text = "fontWeight：字体,文本粗细程度，如 normal、bold 等", fontWeight = FontWeight.Bold)

        Text(text ="fontFamily：文本字体系列", fontFamily = FontFamily.Cursive)

        Text(text ="letterSpacing：字间距", style = androidx.compose.ui.text.TextStyle(letterSpacing = 0.5.em))

        //无效
        val textStyle = androidx.compose.ui.text.TextStyle(
            fontSize = 16.sp,
            lineHeight = 40.sp
        )
        Text(text = "lineHeight：行高", style =textStyle, modifier = Modifier.fillMaxWidth()  )

        Text(text ="textAlign：文本对齐方式，如左对齐、居中对齐等", textAlign = androidx.compose.ui.text.style.TextAlign.Right, modifier = Modifier.fillMaxWidth())

        Text(text ="textDecoration: 文本修饰，如下划线、删除线等", textDecoration = TextDecoration.LineThrough)


        /**
         * TextIndent 类型的参数，它具有以下属性：
            firstLine：指定首行相对于左侧边距的偏移量。
            restLine：指定剩余行相对于左侧边距的偏移量。
         */
        val style = androidx.compose.ui.text.TextStyle(
            fontSize = 16.sp,
            color = Color.Black,
            textIndent = TextIndent(firstLine = 24.sp, restLine = 0.sp)
        )

        Text(text="textIndent：首行缩进的空间量",style=style)
        Text(text="textIndent：首行缩进的空间量",style=androidx.compose.ui.text.TextStyle(fontSize = 16.sp, color = Color(0xFF123456), textIndent = TextIndent(firstLine = 4.sp, restLine = 155.sp)))
        /**
         * textStyle是一个枚举类，用于定义文本样式，包括字重（粗细）、字形（斜体）、字体等。

        常用的textStyle枚举值有：

        Normal：普通样式。
        Italic：斜体样式。
        Bold：加粗样式。
        BoldItalic：加粗斜体样式。



      TextStyle和FontStyle的区别?

        TextStyle 和 FontStyle 都可以用于定义 Text 组件的字体样式，但是它们的作用有所不同。
        FontStyle 是一个枚举类，定义了四个值：Normal、Italic、Oblique 和 Default。它用于指定字体的风格，比如是否倾斜或斜体。
        TextStyle 是一个类，它包含了多个属性，可以用来定义字体的各种样式，包括字体大小、字体颜色、字体家族、字体粗细、字体风格等等。
        在实际使用中，TextStyle 通常被用于定义更加详细和精细的字体样式，
        而 FontStyle 则更多地被用于定义字体的基本风格。
         */
        Text(text = "textStyle: 文本样式，包括字体大小、颜色、行高、字间距等", style = androidx.compose.ui.text.TextStyle(fontSize = 16.sp, color = Color(0xFF123456), textIndent = TextIndent(firstLine = 4.sp, restLine = 155.sp)))

        Text(
            text = "textStyle: 文本样式，包括字体大小、颜色、行高、字间距等",
            style = androidx.compose.ui.text.TextStyle(
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            )
        )

    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    MyTestTheme {
        Greeting2("Android")
    }
}