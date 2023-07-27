package com.adobe.aem.commons.assetshare.content.renditions.download.impl;

import com.adobe.aem.commons.assetshare.content.AssetModel;

import java.util.Set;

public class Param {
    private final String folderName;
    private final AssetModel asset;
    private final String renditionName;
    private final String responseContentType;
    private final Set<String> zipEntryFileNames;

    public Param(String folderName, AssetModel asset, String renditionName, String responseContentType, Set<String> zipEntryFileNames) {
        this.folderName = folderName;
        this.asset = asset;
        this.renditionName = renditionName;
        this.responseContentType = responseContentType;
        this.zipEntryFileNames = zipEntryFileNames;
    }

    public String getFolderName() {
        return folderName;
    }

    public AssetModel getAsset() {
        return asset;
    }

    public String getRenditionName() {
        return renditionName;
    }

    public String getResponseContentType() {
        return responseContentType;
    }

    public Set<String> getZipEntryFileNames() {
        return zipEntryFileNames;
    }
}
