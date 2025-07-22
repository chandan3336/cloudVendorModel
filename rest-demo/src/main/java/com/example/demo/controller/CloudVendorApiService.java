package com.example.demo.controller;

import com.example.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorApiService {

    private CloudVendor cloudvendor = new CloudVendor();

    @GetMapping("{vendorName}")
    public CloudVendor getCloudVendor(@PathVariable String vendorName) {
        return cloudvendor;
    }

    @PostMapping()
    public String createCloudVendor(@RequestBody CloudVendor cloudvendor) {
        this.cloudvendor = cloudvendor;
        return "Cloud vendor created successfully!";
    }
    @PutMapping()
    public String updateCloudVendor(@RequestBody CloudVendor cloudvendor) {
        this.cloudvendor = cloudvendor;
        return "Cloud vendor updated successfully!";
    }
    @DeleteMapping("{vendorId}")
    public String DeleteCloudVendor(@PathVariable String vendorId) {
        this.cloudvendor = null;
        return "Cloud vendor Deleted successfully!";
    }
}