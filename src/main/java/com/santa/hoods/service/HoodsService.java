package com.santa.hoods.service;

import com.santa.hoods.model.Hood;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface HoodsService {

    /**
     * This Method will construct the combination of weight boxes for hood
     * @param hood it contains input request
     * @return a List of weights combination
     */
    public List<ArrayList<Integer>>  doCapacityHood(Hood hood);
}
