package com.sps.eval.service;

import com.sps.eval.api.OrganizationApiDelegate;
import com.sps.eval.model.Organization;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class OrganizationApiDelegateImpl implements OrganizationApiDelegate {

    @Override
    public ResponseEntity<Organization> getById(@PathVariable String id) {

        Organization org = new Organization();
        org.setName("Hard-coded name");


        return new ResponseEntity<>(org, HttpStatus.OK);
    }


}
