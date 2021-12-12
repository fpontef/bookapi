package com.nandotech.bookapi.utils;

import com.nandotech.bookapi.entity.Tag;
import com.nandotech.bookapi.dto.request.TagDTO;


public class TagUtils {
    private static final String NAME = "PHP";
    private static final long TAG_ID = 1L;

    public static TagDTO createFakeDTO() {
        return TagDTO.builder()
                .name(NAME)
                .build();
    }

    public static Tag createFakeEntity() {
        return Tag.builder()
                .id(TAG_ID)
                .name(NAME)
                .build();
    }
}
