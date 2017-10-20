package softveloper.com.mygesture

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.*
import android.widget.TextView

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private lateinit var textView: TextView
    private lateinit var detector: GestureDetector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        detector = GestureDetector(this, this)
        textView = findViewById(R.id.textView) as TextView

        detector.setOnDoubleTapListener(this)
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        setTextView("Double Tap")
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        setTextView("Double Tap Event")
        return true
    }

    override fun onDown(e: MotionEvent?): Boolean {
        setTextView("Down")
        return true
    }

    override fun onFling(e1: MotionEvent?, e2: MotionEvent?, velocityX: Float, velocityY: Float): Boolean {
        setTextView("Fling")
        return true
    }

    override fun onLongPress(e: MotionEvent?) {
        setTextView("Long Press")
    }

    override fun onScroll(e1: MotionEvent?, e2: MotionEvent?, distanceX: Float, distanceY: Float): Boolean {
        setTextView("Scroll")
        return true
    }

    override fun onShowPress(e: MotionEvent?) {
        setTextView("Show Press")
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        setTextView("Single Tap Confirmed")
        return true
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        setTextView("Single Tap Up")
        return true
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        detector.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    private fun setTextView(text: String) {
        textView.text = text
    }
}
