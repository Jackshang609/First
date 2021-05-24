package tw.edu.o1083013.cpurazyshape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import kotlinx.android.synthetic.main.activity_main.*
import tw.edu.pu.o1083013.crazyshape.GameActivity
import tw.edu.pu.o1083013.crazyshape.R

@GlideModule
public final class MyAppGlideModule : AppGlideModule()





class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val shape =
            intArrayOf(R.drawable.circle, R.drawable.square, R.drawable.triangle, R.drawable.star)
        val i: Int = (0..3).random()
        imageView.setImageResource(shape[i])
*/
        val img: ImageView = findViewById(R.id.imageView2)
        GlideApp.with(this)
            .load(R.drawable.cover)
            .override(800, 600)
            .into(img)


        Toast.makeText(baseContext, "作者：成益辉", Toast.LENGTH_LONG).show()



        imageView.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(p0: View?): Boolean {
                intent = Intent(this@MainActivity, GameActivity::class.java)
                startActivity(intent)
                recreate()
                return true

            }
        })

        imageView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?){
               // imageView.setImageResource(shape[i])
            }
        })
    }
}
