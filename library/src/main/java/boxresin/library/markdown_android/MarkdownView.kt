package boxresin.library.markdown_android

import android.content.Context
import android.util.AttributeSet
import android.webkit.WebView


/**
 * 마크다운 뷰
 *
 * @author Minsuk Eom
 * @since v0.1.0 / 2018-03-19
 */
class MarkdownView(context: Context, attrs: AttributeSet? = null) : WebView(context, attrs)
{
    init
    {
        // XML 속성 로딩
        if (attrs != null)
        {
        }
    }

    /**
     * 비동기적으로 마크다운을 로딩한다.
     * @param text 마크다운 텍스트
     */
    fun loadMarkdown(text: String)
    {
    }

    /**
     * 비동기적으로 Assets 에서 마크다운을 로딩한다.
     * @param path Assets 상의 .md 파일 경로 (ex. "dir/hello.md")
     */
    fun loadMarkdownFromAssets(path: String)
    {
    }

    /**
     * 비동기적으로 CSS를 로딩한다.
     * @param text CSS 텍스트
     */
    fun loadCss(text: String)
    {
    }

    /**
     * 비동기적으로 Assets 에서 CSS를 로딩한다.
     * @param path Assets 상의 .css 파일 경로 (ex. "style.css")
     */
    fun loadCssFromAssets(path: String)
    {
    }
}
