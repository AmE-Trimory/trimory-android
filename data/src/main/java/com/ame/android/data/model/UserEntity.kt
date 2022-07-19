package com.ame.android.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserEntity(
    /// user ID
    @PrimaryKey @ColumnInfo(name = "user_id") val userId: String,

    /// user name
    @ColumnInfo(name = "user_name") val userName: String,

    /// user status
    @ColumnInfo(name = "user_status") val userStatus: String,

    /// tenant code
    @ColumnInfo(name = "tenant_code") val tenantCode: String,

    /// tenant name
    @ColumnInfo(name = "tenant_name") val tenantName: String,

    /// department code
    @ColumnInfo(name = "dept_code") val deptCode: String,

    /// department name
    @ColumnInfo(name = "dept_name") val deptName: String,

    /// user portrait image URL
    @ColumnInfo(name = "user_image_url") val userImageUrl: String?,
)
