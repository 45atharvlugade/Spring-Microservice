package com.arl.service;

import com.arl.entities.Insurance;

public interface IInsuranceService {

    // Save insurance details
    String registerInsurance(Insurance insurance);

    // Get insurance by ID
    Insurance getInsurance();
}