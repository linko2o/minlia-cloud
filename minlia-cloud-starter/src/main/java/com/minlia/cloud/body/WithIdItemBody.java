package com.minlia.cloud.body;

import lombok.Data;

import java.util.List;

/**
 * Created by will on 6/20/17.
 */
@Data
public class WithIdItemBody {
    private List<WithIdBody> items;
}
