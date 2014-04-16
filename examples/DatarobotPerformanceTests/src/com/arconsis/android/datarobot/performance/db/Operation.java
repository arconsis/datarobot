package com.arconsis.android.datarobot.performance.db;

import com.arconsis.android.datarobot.entity.AutoIncrement;
import com.arconsis.android.datarobot.entity.Column;
import com.arconsis.android.datarobot.entity.Entity;
import com.arconsis.android.datarobot.entity.PrimaryKey;

@Entity
public class Operation {

	@Column
	@PrimaryKey
	@AutoIncrement
	private Integer _id;
	@Column
	private String type;
	@Column
	private long duration;

	public Operation() {
		// no-args
	}

	public Operation(final String type, final long duration) {
		this.type = type;
		this.duration = duration;
	}

	public Integer getId() {
		return _id;
	}

	public void setId(final Integer id) {
		this._id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(final long duration) {
		this.duration = duration;
	}

}
