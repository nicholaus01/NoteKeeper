package com.creeds_code.notekeeper

object DataManager {
    val courses = HashMap<String,CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses(){
        var course = CourseInfo("android_intents","Android Programming with Intents")
        courses.set(course.courseId,course)

        course = CourseInfo("android_async","Android Async Programming and Services")
        courses.set(course.courseId,course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId,course)

        course = CourseInfo("java_core", "Java Fundamentals: The core Platform")
        courses.set(course.courseId,course)

    }

    private fun initializeNotes(){
        var course = CourseInfo("android_intents","Android Programming with Intents")
        var note = NoteInfo(course,course.title,course.courseId)
        notes.add(note)

        course = CourseInfo("android_async","Android Async Programming and Services")
        note = NoteInfo(course,course.title,course.courseId)
        notes.add(note)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        note = NoteInfo(course,course.title,course.courseId)
        notes.add(note)

        course = CourseInfo("java_core", "Java Fundamentals: The core Platform")
        note = NoteInfo(course,course.title,course.courseId)
        notes.add(note)


    }
}