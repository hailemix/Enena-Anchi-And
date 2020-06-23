package com.afc.amhariclovequotes

import android.app.WallpaperManager
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.GenericTransitionOptions
import com.bumptech.glide.Glide
import com.google.android.gms.ads.*
import java.io.IOException


/**
 * Created by Haile on 6/09/2020.

 */
class FragmentOne(var nextImage: Int, var textIndex : Int) : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

       val myImageViewLayout: View = inflater.inflate(R.layout.fragment_one_layout, container, false)
        val imageOne = myImageViewLayout.findViewById<ImageView>(R.id.preview)
        MobileAds.initialize(context)

        Glide
                .with(context!!)
                .load(nextImage)
                .transition(GenericTransitionOptions.with(R.anim.zoomin))
                .into(imageOne)

        return myImageViewLayout
    }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       val shareImage = view.findViewById<ImageView>(R.id.b1)
       val wallpaperImage = view.findViewById<ImageView>(R.id.wb1)
       val myContent = listOf(
               "ሁሌ በእንቅልፌ ልቤ የማይሽ ህልሜ\nከእንቅልፌ ስነቃ የማስብሽ ሃሳቤ\nየሁልጊዜ ደስታዬና መቼም ልረሳሽ የምልችለዉ ዉድ ትዝታዬ ነሽ፡፡",
               "በፍፁም ትቼሽ አልሄድም! ያለንበት ችግር ከባድና ዉስብስብ ቢሆንም ሁሌም እወድሻለሁ!",
               "አብሬሽ ስሆን ልቤ ረጋ ይላል..ስትርቂኝ ደግሞ ይጨነቃል",
               "ሲያሙሽ ደረስኩና አንጀቴ ነደደ፣በአንቺ የሚመጣብኝን ሰዉ እሹሩሩ ልለዉ አልችልም!",
               "መልክሽ ብቻ አድንቄ አላቆምም..ልብሽን እወደዋለሁ..ያ ምርጥና ልዬ ማንነትሽ ዉስጤን ማረከዉ!",
               "ጣፋጭ የሆነዉን ባህሪሽን ለማንም የማማበት አቅም ፈፅሞ የለኝም!",
               "እንደሮዝ አበባ ልዩ ጠረንህ አሁንም፣አሁንም፣አሁንም ከሩቅ ሃገር ያዉደኛል!",
               "ትወጂኛለሽ ብዬ አልጠይቅሽም..\n" + "ለእኔ ግን ሆድዬ ለእኔ ግን ሆድዬ፣ሳላስብሽ ብዉል ቀኑ እንኳን አይመሽም\n",
               "ፍቅር በምንፈልገዉ ሰአት ቀጥፈን የምንበላዉ ፍራፍሬ አይደለም!",
               "ለመዉደዴ ማረጋገጫ ይሆንሽ ዘንድ ይኸዉ ልቤን..",
               "የሚያቃጥል የዉስጥ እሳት ሆንሽብኝ..አንቺን መርሳት ፈፅሞ አልቻልኩም",
               "አንድ ቀን ላንቺ ስላለኝ ስሜት፣ፍቅርና ሃሳብ ምን ያህል ጥልቅ እንደነበር ታዉቂዋለሽ..ግን ሁሉ ከረፈደ ይሆናል!",
               "እወድሻለሁ ስልሽ እየቀለድኩ ወይም እየተጫወትኩ አይደለም፣ቃሉ የዉስጥ ማንነቴ ግልባጭ ነዉ፡፡",
               "እዉነተኛ ፍቅር አግኝተህ ከተንከባከብከዉ እራስህን በምድር ላይ ካሉ ጥቂት እድለኞች መሃል አንዱ ነህ!",
               "ብዙ ሰዎች እንደሚወዱሽ ነግረዉሽ ይሆናል፤ እኔ ግን ከመንገር ይልቅ በተግባር ላሳይሽ ቃል ገብቻለሁ",
               "አንድ የምወደዉ ማንነት አለ፣ይህ ማንነት ከልቤና ከአይኔ ሳይጠፋ እስከ ህይወቴ ፍፃሜ ይኖራል..እርሱም ምርጥ ጓደኛና ፍቅረና የሆነዉ ያንቺዉ ልብ ነዉ",
               "በምድር ላይ በጣም ዉዱ ስጦታ ፈትሽ ላይ የሚነበበዉ ፈገግታሽ ነዉ፡፡ ስለኔ ስታስቢ እንዴት ደስ እንደሚልሽ መገመት አያቅተኝም",
               "ነፍስን በጣም የሚያደማዉ የቱ ነዉ በጣም የምታፈቅሪዉ ሰዉ ሲጎዳሽ ወይስ በጣም የጎዳሽዉ ሰዉ አሁንም ሲወድሽ?",
               "የኔና ያንቺ ፍቅር ትዉልዱ የት ነበር? ቻይ ዉስጥ ነበር፣ምክንያቱም የሚያሲዘዉ ምንም አይነት ዋስትና አልነበረዉም",
               "ልብሽ እስር ቤት ቢሆን የእድሜ ልክ እስራት ቢፈረድብኝ ምኞቴ ነዉ!!",
               "ፍቅር የተለየ ቀን፣ልዩ ቦታን ድርጊት አይፈልግም፡፡ በቃ ሳይጠበቅ ይከሰታል!",
               "መዉደዴ ጥፋት ነዉ ወይስ ስህተት??ፈፅሞ አላጠፋሁም! አሁንም እወድሻለሁ!",
               "ሻማ ቀልጦ ቀልጦ ሊጠፋ ይችላል፣ያንቺ ፍቅር ግን ሁሌም በልቤ ዉስጥ እየነደደ ይኖራል!",
               "ፍቅርሽ በአይኔ በልቤና በነፍሴ ዉስጥ ይኖራል..ፈልገሽ ድረሽበት",
               "ፍቅር ምንድነዉ?\n" +
                       "•\tፍቅር ጭቅጭቅ ሳይሆን መግባባት ነዉ\n" +
                       "•\tፍቅር ወረት ሳይሆን ከዉስጥ የሚሰማ ስሜት ነዉ\n" +
                       "•\tፍቅር መፈለግ ሳይሆን ዋጋ መክፈል ነዉ\n" +
                       "•\tፍቅር ሌላዉን መጉዳት ሳይሆን መንከባከብ ነዉ\n" +
                       "•\tፍቅር አይነስዉር አይደለም ነገር ግን ማየት አያስፈልገዉም\n",
               "በማንኛዉም የህይወት ደረጃ ላይ ብትሆኚም እዉነተኛ ፍቅር ከያዘሽ ወጣትና መንፈሰ ጠንካራ ያደርግሻል",
               "በመጥፎና አሳዛኝ ሰአት ላይ ብትሆኚም መዉደዴን አላቆምኩም..ሁሌም አፈቅርሻለሁ!",
               "ተራርቆ ፍቅር እስከመቼ? ጠረንህ ናፍቆኛል..ማን አለኝ ያላንተ አንጀቴ!",
               "የኔ ፍቅር..አንድ ቃል ህይወቴን ልዩ የሆነ ደስታ ሊሰጠዉ እንደሚችል ታዉቂያለሽ? ይህን ቃል ለመስማት ማንኛዉንም መስዋዕት አደርጋለሁ..በጆሮዎቼ ስር ሆነሽ በሚነዝረዉ ድምፅሽ ‹እወድሃለሁ› በይኝ",
               "ስላንቺ ሳስብ ልቤ ዉስጥ የማይድን ጠባሳ፣ከባድ ሀዘንና የባከኑ ህልሞች ይታዩኛል፡፡አንቺ ሁሌም ህመሜና የጠፉ ቀናቶቼ እንደሆንሽ ትኖሪያለሽ፡፡",
               "ትዝታሽ ቀስ በቀስ ከዉስጤ እየተነነ አለቀና ባዶዬን ቀረሁ!",
               "ከፍቅሬ ዉጪ የሌላ ሴትን ሙቀት መዉሰድ ስለሚያሳምመኝ ትቼዋለሁ!",
               "ብዙ ነገር ናፍቆኛል..በተለይ አንተ!",
               "ፍቅር የሚይዘዉ ፋራ ነዉ ሲሉ አጨበጭብ ነበር..አሁን ደግሞ በተራዬ እየተጨበጨበልኝ ነዉ!",
               "ላንቺ ያለኝን ስሜት እንዴት ልግለፀዉ?ስሜቴ ህመም ነዉ..ስለአንድ ነገር መስማት ብቻ፣ማየት ብቻ፣ማሰብ ብቻ የሚፈልግ ደስ የሚል ህመም",
               "ደንግጦ የማያዉቀዉ ማንነቴ የዉበትሽ ኃይል አቀለጠዉ!",
               "የፍቅርህ ወጥመድ ዉስጥ ገብቼ ተሰቃየሁ፣ናልኝ የኔ መድሃኒት!",
               "ፍቅር እንደምታስቢዉ ቀይሮዝ አበባ ወይም ሻይ ቡና ተባብለን የምናሟሙቅበት ምቹ ጅምናዚየም ሳይሆን እሾህና እሳት የበዙበት መስዋእትነትን የሚጠይቅ መንገድ ነዉ፡፡",
               "የሚያፈቅሩት ሰዉ ማንነት ትርታዉ ሲጠፋ ልብ ይሰብራል፣ከዛ የሚከፋዉ ግን ጥቁር ክህደት ነዉ!",
               "ፀሎቴ ሲሰማ በሃገሬ አፈር ከሃገሬ ልጅ ጋር በፍቅር ክንፍ እላለሁ!",
               "አንቺን ለምን እንደወደድኩሽ የምሰጠዉ ምክንያት፣ጥያቄ፣መልስ ወይም ፍልስፍና የለኝም፡፡",
               "አቡጊዳ ያልሆነዉ ፍቅርሽ ሁሌም ትኩስ ነዉ! ታድዬ!",
               "ጭንቀትሽን ተጨንቄ፣እንባሽን አብሼ ከጎንሽ ልሆን ምያለዉ!",
               "ለካ ያ ሁሉ ዳር ዳር ለዚሁ ነበር! ፍቅር በጉልበት አይሆንም..ስለሁሉም ነገር አመሰግናለሁ፤ ይቅናሽ!",
               "በህይወቴ ዘመን ሁሉ አፈቅርሻለሁ፣ፍቅራችን ጠንካራና የማይጠፋ መሆኑን አዉቃለሁ!",
               "አንድ ያየሁትን እዉነት ልንገርሽ አደራ ግን እንዳትስቂ..በቀደም ለታ በህልሜ በፍቅር አቅፌ ሳም ሳም አረኩሽ ቀስ ብዬ በጆሮሽ ‹ሁሌም አፈቅርሻለሁ› አልኩ..ይህንን ህልም እንድኖረዉ ፍቅሬን ተቋደሺ፡፡",
               "በእጆቼ ላይ የነበረዉን የእጆችሽ ሙቀት መቼም አልረሳሁም፣ያ ቀስ እያለ የሚመጣዉ ሙቀትሽ በእያንዳንዱ ቀንና ሌሊት እመኘዋለሁ..በጣም ይናፍቀኛል፣ስለዚህ ማሬ የኔ ለመሆን ፈፅሞ አትፍሪ",
               "ሚስጥሬ፣እዉነተኛ የአካሌ ክፋይ፣የልብ ምቴ፣ወርቃማዉ ትዝታዬ እና ድሌ አንቺዉ ነሽ!",
               "እቅፎችሽ ዉስጥ ስሆን ልገልፀዉ የማልችለዉ የደስታ ስሜት ይሰማኛል፡፡ ልብሽ ዉጥ ሆኜ እድሜ ልኬን መኖር እንዴት መታደል መሰለሽ!",
               "ምን አለህና ነዉ ያፈቀርካት ካልከኝ ፣ዝምታ ነዉ መልሴ አትበልብኝ እኝኝ",
               "ትላንት ማታ የነበረን ጊዜ በህይወቴ ከሳለፍኳቸዉ ጥቂት ዉብ ቀናት አንዱ ነዉ፤ፍቅር በፍቅር ነሽ!",
               "ቀልድ በበዛበት ጊዜ ቀልድ የማያዉቅ ፍቅር ይዞኛል..መልስሽን ቀልድ በማያዉቅ እዉነት ላኪልኝ!",
               "መኖርና መሞት ብቅር አይደሉም..ማፍቀር ግን ሁሌም ብርቅ እንደሆነ ይኖራል",
               "ተዉ በሉት እሱን ልጅ ልቤን ይዞት ሄዷል፣ብነሳ ብተኛ እሱን እሱን ይላል",
               "እወድሃለሁ!",
               "አንድ ቀን…",
               "የሰዉ ሀገር ሆነሽ ብንራራቅም፣ርቀት የማይወስነዉ ሰደድ እሳት ፍቅር ላይቀዘቅዝ ነዷል!",
               "ነፍስ ነሽ",
               "ሰዉ ብዙ ቢያወራ እኔና አንቺ ልንለያይ የማንችል ፍጡር ሆነን አምላክችን ፈጥሮናል፡፡ ፍንክች አንልም!",
               "ጌታዬ ከሰጠኝ ነገሮች አንቺ ልዩ ነሽ!",
               "ፍቅርሽ ምግብ ሆነኝ!",
               "ፍቅር፣ቀኑ ቢጨልምም አልተዉሽም  ምክንያቱም አንቺኮ  ዉበቴ፣ገመናዬና ልቤ ነሽ!",
               "ሰዎች ስሙ..አንለያይም፣አንለያይም፣አንለያይም መቼም!",
               "ከጎኔ ብትርቂም ልቤ ዉስጥ እንደሚፈነዳ አበባ አብበሻል፣ዳግመኛ የተገናኘን ቀን አቤት እንዴት እንደምሆን..!",
               "የኛ ፍቅር ዘመንኛ አይደለም ግን ዘመን ይሻገራል!",
               "መቅናቴ ለክፋት ይመስላል ግን ምን ላድርግ..የፍቅርሽ እስረኛ ሆንኳ!",
               "ዉድድድ ሁሌም ዉድድድ አረግሃለሁ!",
               "የልቤ ጣፋጭ ማርማራታ፣ካንቺ ጋር እንዲህ እንደሆንኩ አረጃለሁ",
               "ከብዙ ሴቶች መሃል ልብሽ ከሩቅ አብረቅርቆ ጠራኝ",
               "እዉነተኛ ፍቅር ሲይዝህ ሰዉን መጉዳት ይደብርሃል",
               "ስለፍቅር በሰማሁ ቁጥር ስላንቺ አስባለሁ፡፡ ደስ ስላሉኝ ነገሮች ስሰማም ፊቴ ስመጪብኛለሽ፤ስቸገርና ስደሰትም ከእኔ ጋር እንደሀንሽ ይሰማኛል፡፡",
               "የበረሃዉ ሙቀትና አሸዋ የሚያስታዉሰኝ ነገር ቢኖር ባቀፍከኝ ቅፅበት ልቤ ሞቆ ይነዳል..ስትለቀኝና ስትርቀኝ ደግሞ ልክ እንደ አሸዋ ብን ብሎ ይጠፋል፡፡",
               "እንድታፈቅሪኝ እንድትንከባከቢኝና እንድታስቢልኝ ላስገድድሽ አልፈልግም…ግን አንድ ነገር የማስቸግርሽ ላንቺ ያለኝ ስሜት ምን ያህል ጥልቅ እንደሆነ እንዲሰማሽ ብቻ ነዉ፡፡",
               "ልቤ ዉስጥ ስለተቀረፅሽ ካቺ ሌላ ሰዉ ማቀፍ ምንኛ ይከብዳል! ስለዚህ ለእንጀራ ብለሽ ሩቅ ሀገር ብትሄጂም ልተዉሽ አልችልም..በዚህ አትጠራጠሪ፡፡",
               "ጥሩ ጓደኞች፣ምርጥ ቤተሰብና ቸንቺን የመሰለ አፍቃሪ ስለሰጠኝ አምላኬን አመሰግናሁ፣እወድሻለሁ!",
               "ዛሬ ልዩ ስለሆነ ሰዉ እያሰብኩ ነበር..በህይወቴ ሁሉ ከጎኔ ስለሆንክ አመሰግናለሁ፣በህይወት እስካለሁ እወድሃለሁ",
               "እኔ እንደሚሰማኝ አይነት ስሜት ካልተሰማሽ የሞትኩ ቀን ይሰማሻል"
       )

       shareImage.setOnClickListener {
           val shareIntent = Intent()
           shareIntent.action = Intent.ACTION_SEND
           shareIntent.putExtra(Intent.EXTRA_TEXT, myContent[textIndex])
           shareIntent.type = "text/plain"
           startActivity(Intent.createChooser(shareIntent, "ሼር ያድርጉ..."))

       }
       wallpaperImage.setOnClickListener {
           val bitmap = BitmapFactory.decodeResource(resources, nextImage)
           val wallpaperManager = WallpaperManager.getInstance(context)
           val width = wallpaperManager.desiredMinimumWidth
           val height = wallpaperManager.desiredMinimumHeight
           wallpaperManager.suggestDesiredDimensions(width, height)

           try {
               wallpaperManager.setBitmap(Bitmap.createScaledBitmap(bitmap, width, height, true))
               Toast.makeText(context, "ዎልፔፐር ስእል ተደርጓል", Toast.LENGTH_SHORT).show()

           } catch (e: IOException) {
               e.printStackTrace()
               Toast.makeText(context, "ዎልፔፐር ስእሉ አልመጣም…እንደገና ይሞክሩ", Toast.LENGTH_SHORT).show()
           }
       }
       super.onViewCreated(view, savedInstanceState)
    }
}
