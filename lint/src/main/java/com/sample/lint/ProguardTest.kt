@file:Suppress("UnstableApiUsage")

package com.sample.lint

import com.android.tools.lint.detector.api.*

class ProguardTest : Detector() {

    init {
        println("ProguardTest constructor")
    }

    companion object {
        private const val ISSUE_ID = "ProguardSuperCheck"
        private const val BRIEF_DESCRIPTION =
            "Proguard super check description"
        private val EXPLANATION = """ 
            Proguard super check details
        """.trimIndent()

        @JvmField
        val ISSUE = Issue.create(
            id = ISSUE_ID,
            briefDescription = BRIEF_DESCRIPTION,
            explanation = EXPLANATION,
            category = Category.CORRECTNESS,
            priority = 10,
            severity = Severity.FATAL,
            implementation = Implementation(
                ProguardTest::class.java,
                Scope.PROGUARD_SCOPE
            )
        )
            .setAndroidSpecific(true)
    }

    override fun run(context: Context) {
        // This line never called
        println("ProguardTest.run()")
    }

}
