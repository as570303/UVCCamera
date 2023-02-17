package com.serenegiant.permission;
import com.hjq.permissions.OnPermissionCallback

/**
 *
 * @description
 * @author as752497576@gmail.com
 * @time 2022/8/26
 */
interface OnHHDPermissionCallback  : OnPermissionCallback {


    /**
     * 有权限被同意授予时回调
     *
     * @param permissions           请求成功的权限组
     * @param all                   是否全部授予了
     */
    override fun onGranted(permissions: List<String>, all: Boolean)

    /**
     * 有权限被拒绝授予时回调
     *
     * @param permissions            请求失败的权限组
     * @param never                  是否有某个权限被永久拒绝了
     */
    override fun onDenied(permissions: List<String>, never: Boolean) {}
}