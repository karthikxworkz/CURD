package Education.runner;

import Education.implementations.Studyingimpl;

public class StudyRunner {
	public static void main(String[] args) {
		Studyingimpl si = new Studyingimpl();
		si.student();
		si.rollno();
		si.classname();
		si.teacher();
	}

}
