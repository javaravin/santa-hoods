package com.santa.hoods.service.impl;

import com.santa.hoods.exception.InvalidRequest;
import com.santa.hoods.model.Hood;
import com.santa.hoods.service.HoodsService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HoodsServiceImpl implements HoodsService {



    @Override public List<ArrayList<Integer>>  doCapacityHood(Hood hood) {
       isValidRequest(hood);
        return combinationSum(hood.present_weights(), hood.hood_capacity());
    }

    private void isValidRequest(Hood hood){

        if(Objects.isNull(hood)){
            throw new InvalidRequest("Input request must be valid");
        }

        if(Objects.isNull(hood.hood_capacity()) || hood.hood_capacity()<=0){
            throw new InvalidRequest("hood_capacity value must be valid");
        }

        if((Objects.isNull(hood.present_weights()) || hood.present_weights().isEmpty())){
            throw new InvalidRequest("present_weights value must be valid");
        }

    }


    private ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> arr, int sum) {
        ArrayList<ArrayList<Integer>> ans
            = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
        Collections.sort(arr);

        findNumbers(ans, arr, sum, 0, temp);
        return ans;
    }

    void findNumbers(ArrayList<ArrayList<Integer>> ans,
        ArrayList<Integer> arr, int sum, int index,
        ArrayList<Integer> temp) {

        if (sum == 0) {

            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < arr.size(); i++) {
            if ((sum - arr.get(i)) >= 0) {
                temp.add(arr.get(i));

                findNumbers(ans, arr, sum - arr.get(i), i,
                    temp);
               temp.remove(arr.get(i));
            }
        }
    }

}
