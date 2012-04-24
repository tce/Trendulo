// =================================================================================================
// Copyright 2012 Jared Winick
// -------------------------------------------------------------------------------------------------
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this work except in compliance with the License.
// You may obtain a copy of the License in the LICENSE file, or at:
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// =================================================================================================


package trendulo.web.model;

import java.util.List;

public class Trends {

	public class Trend {
		private String ngram;
		private int score;
		public Trend() {}
		public Trend( String ngram, int score) {
			this.ngram = ngram;
			this.score = score;
		}
		public String getNgram() {
			return ngram;
		}
		public void setNgram(String ngram) {
			this.ngram = ngram;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
	}
	private String dateString;
	private List<Trend> trends;
	public String getDateString() {
		return dateString;
	}
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
	public List<Trend> getTrends() {
		return trends;
	}
	public void setTrends(List<Trend> trends) {
		this.trends = trends;
	}
}
