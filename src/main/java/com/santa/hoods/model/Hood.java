package com.santa.hoods.model;

import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;

public record Hood(@NonNull Integer hood_capacity, @NonNull  ArrayList<Integer> present_weights) {

}
