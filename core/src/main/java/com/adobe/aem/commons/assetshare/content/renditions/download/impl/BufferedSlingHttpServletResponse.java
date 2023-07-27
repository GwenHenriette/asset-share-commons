package com.adobe.aem.commons.assetshare.content.renditions.download.impl;

import org.apache.sling.api.SlingHttpServletResponse;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class BufferedSlingHttpServletResponse {
    public BufferedSlingHttpServletResponse(SlingHttpServletResponse wrappedResponse, StringWriter writer, ByteArrayOutputStream outputStream) {
    }

    protected Object getContentType() {
        return null;
    }
}
