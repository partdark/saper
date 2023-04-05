import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.saper.R

internal class MainAdapter(
    private val context: Context,
    private val count : Int

) :
    BaseAdapter() {
    private val kletka = R.drawable.asw
    private var layoutInflater: LayoutInflater? = null
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    override fun getCount(): Int {
        return count
    }
    override fun getItem(position: Int): Any? {
        return null
    }
    override fun getItemId(position: Int): Long {
        return 0
    }
    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View? {
        var convertView = convertView
        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null) {
            convertView = layoutInflater!!.inflate(R.layout.rowitem, null)
        }
        imageView = convertView!!.findViewById(R.id.imageView)
    //    textView = convertView.findViewById(R.id.textView)
        imageView.setImageResource(kletka)
    //    textView.text = numbersInWords[position]
        return convertView
    }
}