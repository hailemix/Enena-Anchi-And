package com.afc.amhariclovequotes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.lang.IllegalStateException

/**
 * Created by Haile on 06/9/2020.
 */
 class MyPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {


        override fun getItemCount(): Int = 77


        override fun createFragment(position: Int): Fragment {

                when (position) {
                    0 -> return FragmentOne(R.drawable.a1, 0)
                    1 -> return FragmentOne(R.drawable.a2, 1)
                    2 -> return FragmentOne(R.drawable.a3, 2)
                    3 -> return FragmentOne(R.drawable.a4,3)
                    4 -> return FragmentOne(R.drawable.a5,4)
                    5 -> return FragmentOne(R.drawable.a6,5)
                    6 -> return FragmentOne(R.drawable.a7,6)
                    7 -> return FragmentOne(R.drawable.a8,7)
                    8 -> return FragmentOne(R.drawable.a9,8)
                    9 -> return FragmentOne(R.drawable.a10,9)
                    10 -> return FragmentOne(R.drawable.a11,10)
                    11 -> return FragmentOne(R.drawable.a12,11)
                    12 -> return FragmentOne(R.drawable.a13,12)
                    13 -> return FragmentOne(R.drawable.a14,13)
                    14 -> return FragmentOne(R.drawable.a15,14)
                    15 -> return FragmentOne(R.drawable.a16,15)
                    16 -> return FragmentOne(R.drawable.a17,16)
                    17 -> return FragmentOne(R.drawable.a18,17)
                    18 -> return FragmentOne(R.drawable.a19,18)
                    19 -> return FragmentOne(R.drawable.a20,19)
                    20 -> return FragmentOne(R.drawable.a21,20)
                    21 -> return FragmentOne(R.drawable.a22,21)
                    22 -> return FragmentOne(R.drawable.a23,22)
                    23 -> return FragmentOne(R.drawable.a24,23)
                    24 -> return FragmentOne(R.drawable.a25,24)
                    25 -> return FragmentOne(R.drawable.a26,25)
                    26 -> return FragmentOne(R.drawable.a27,26)
                    27 -> return FragmentOne(R.drawable.a28,27)
                    28 -> return FragmentOne(R.drawable.a29,28)
                    29 -> return FragmentOne(R.drawable.a30,29)
                    30 -> return FragmentOne(R.drawable.a31,30)
                    31 -> return FragmentOne(R.drawable.a32,31)
                    32 -> return FragmentOne(R.drawable.a33,32)
                    33 -> return FragmentOne(R.drawable.a34,33)
                    34 -> return FragmentOne(R.drawable.a35,34)
                    35 -> return FragmentOne(R.drawable.a36,35)
                    36 -> return FragmentOne(R.drawable.a37,36)
                    37 -> return FragmentOne(R.drawable.a38,37)
                    38 -> return FragmentOne(R.drawable.a39,38)
                    39 -> return FragmentOne(R.drawable.a40,39)
                    40 -> return FragmentOne(R.drawable.a41,40)
                    41 -> return FragmentOne(R.drawable.a42,41)
                    42 -> return FragmentOne(R.drawable.a43,42)
                    43 -> return FragmentOne(R.drawable.a44,43)
                    44 -> return FragmentOne(R.drawable.a45,44)
                    45 -> return FragmentOne(R.drawable.a46,45)
                    46 -> return FragmentOne(R.drawable.a47,46)
                    47 -> return FragmentOne(R.drawable.a48,47)
                    48 -> return FragmentOne(R.drawable.a49,48)
                    49 -> return FragmentOne(R.drawable.a50,49)
                    50 -> return FragmentOne(R.drawable.a51,50)
                    51 -> return FragmentOne(R.drawable.a52,51)
                    52 -> return FragmentOne(R.drawable.a53,52)
                    53 -> return FragmentOne(R.drawable.a54,53)
                    54 -> return FragmentOne(R.drawable.a55,54)
                    55 -> return FragmentOne(R.drawable.a56,55)
                    56 -> return FragmentOne(R.drawable.a57,56)
                    57 -> return FragmentOne(R.drawable.a58,57)
                    58 -> return FragmentOne(R.drawable.a59,58)
                    59 -> return FragmentOne(R.drawable.a60,59)
                    60 -> return FragmentOne(R.drawable.a61,60)
                    61 -> return FragmentOne(R.drawable.a62,61)
                    62 -> return FragmentOne(R.drawable.a63,62)
                    63 -> return FragmentOne(R.drawable.a64,63)
                    64 -> return FragmentOne(R.drawable.a65,64)
                    65 -> return FragmentOne(R.drawable.a66,65)
                    66 -> return FragmentOne(R.drawable.a67,66)
                    67 -> return FragmentOne(R.drawable.a68,67)
                    68 -> return FragmentOne(R.drawable.a69,68)
                    69 -> return FragmentOne(R.drawable.a70,69)
                    70 -> return FragmentOne(R.drawable.a71,70)
                    71 -> return FragmentOne(R.drawable.a72,71)
                    72 -> return FragmentOne(R.drawable.a73,72)
                    73 -> return FragmentOne(R.drawable.a74,73)
                    74 -> return FragmentOne(R.drawable.a75,74)
                    75 -> return FragmentOne(R.drawable.a76,75)
                    76 -> return FragmentOne(R.drawable.a77,76)

                    else -> {
                        print("All the Photos are loaded")
                    }
                }

            throw IllegalStateException("image position $position is not valid for this viewpager.")
        }
    }
