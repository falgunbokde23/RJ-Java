package com.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import com.blog.entity.Comment;
import com.blog.entity.User;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

	private Integer postId;
	
	
	@Size(min = 2, message = "Title must be of 2 characters !!")
	private String title;

	
	@Size(min = 10, message = "description must be of 10 characters !!")
	private String description;

	private UserDto user;

	private Set<CommentDto> comments = new HashSet<>();

}
