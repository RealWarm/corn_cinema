package com.acorn.model;

import java.util.Date;
import java.util.List;

import com.acorn.domain.ViewVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {

	private String movie_num;  //pk
	private String title; //영화 제목
	private String story;	//줄거리
	private String actor;	//출연진
	private String director;	//감독
	private String opening_day;	//영화 개봉일
	private String closing_day;   //영화 종영일 
	private Date registration_time; //영화 등록 시간
	private Date modification_time;
	private String film_rate;	//관람등급
	private String running_time;	//상영시간
	private double avg_score;	// 영화별 평점
	private String movie_genre;  //영화 장르

	private List<ViewDTO> viewdto;  //movie_view table join

	public List<ViewDTO> setList(List<ViewDTO> viewdto) {
		return this.viewdto = viewdto;
	}
	
	public void addViewvo(ViewDTO dto) {
		viewdto.add(dto);
	}
	
}


