package com.pmt.courseapi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Teacher extends User {

	private String phone;

	private int experiences;

}
