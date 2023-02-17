package com.serenegiant.permission

import android.app.Activity
import android.app.Fragment
import android.content.Context
import com.hjq.permissions.XXPermissions

/**
 *
 * @description
 * @author as752497576@gmail.com
 * @time 2022/8/26
 */
class PermissionManager(context: Context?) {

    private var mContext: Context? = null

    init {
        mContext = context
    }

    companion object {
        fun with(context: Context?): PermissionManager {
            return PermissionManager(context)
        }

        fun with(fragment: Fragment): PermissionManager {
            return with(fragment.activity)
        }


        /**
         * 判断一个或多个权限是否全部授予了
         */
        fun isGranted(context: Context,    permissions: String): Boolean {
            return  XXPermissions.isGranted( context , permissions)
        }

        fun isGranted(context: Context,    permissions: Array<String>): Boolean {
            return XXPermissions.isGranted( context , permissions)
        }

        fun isGranted(context: Context, permissions: List<String>): Boolean {
            return XXPermissions.isGranted( context , permissions)
        }
        /**
         * 判断一个或多个权限是否全部授予了
         */
        fun isPermanentDenied(activity:   Activity, permissions: String): Boolean {
            return  XXPermissions.isPermanentDenied( activity , permissions)
        }

        fun isPermanentDenied(activity:   Activity,   permissions: Array<String>): Boolean {
            return XXPermissions.isPermanentDenied( activity , permissions)
        }

        fun isPermanentDenied(activity:   Activity, permissions: List<String>): Boolean {
            return XXPermissions.isPermanentDenied( activity , permissions)
        }

        // 如果是被永久拒绝就跳转到应用权限系统设置页面
        fun  startPermissionActivity(context: Context, permissions: String ){
            XXPermissions.startPermissionActivity( context,permissions )
        }
    }








    fun permission(  permissions: String ,
        callback: OnHHDPermissionCallback?
    ): PermissionManager {
        XXPermissions.with(mContext).permission(permissions)
            .request(callback )
        return this
    }


    fun permission(
        permissions: Array<String>,
        callback: OnHHDPermissionCallback?
    ): PermissionManager {
        XXPermissions.with(mContext).permission(permissions)
            .request(callback)
        return this
    }


    fun permission(
        permissions: List<String?>,
        callback: OnHHDPermissionCallback
    ): PermissionManager {
        XXPermissions.with(mContext).permission(permissions).request(callback)
        return this
    }




}


