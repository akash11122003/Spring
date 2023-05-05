package com.hakmg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hakmg.repository.DoctorRepository;
import com.hakmg.repository.HAKMGRepository;

@Service
public class HAKMGService {
@Autowired
HAKMGRepository harepo;

@Autowired
DoctorRepository drepo;
}
