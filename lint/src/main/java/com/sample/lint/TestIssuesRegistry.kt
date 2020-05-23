@file:Suppress("UnstableApiUsage")

package com.sample.lint

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.CURRENT_API
import com.android.tools.lint.detector.api.Issue

class TestIssuesRegistry : IssueRegistry() {
    override val issues: List<Issue> = listOf(
        ProguardTest.ISSUE
    )

    override val api: Int
        get() = CURRENT_API
}
