package com.hashtagataglance.hashatagataglance

import android.app.Application
import com.github.salomonbrys.kodein.*

class App: Application(), KodeinAware {
    override val kodein by Kodein.lazy {

        //import(autoAndroidModule(this@DemoApplication))


//        import(thermosiphonModule)
//        import(electricHeaterModule)

        //bind<Coffee>() with provider { Coffee(instance()) }

        // this is bound in the scope of an activity so any retrieval using the same activity will return the same Kettle instance
        //bind<Kettle<Coffee>>() with scopedSingleton(androidActivityScope) { Kettle<Coffee>(instance(), instance(), instance(), provider()) }


    }

}