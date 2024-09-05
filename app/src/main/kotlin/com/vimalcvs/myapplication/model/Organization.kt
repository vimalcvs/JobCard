package com.vimalcvs.myapplication.model


data class Organization(
    val id: Int,
    val title: String,
    val img: String,
    val jobType: String,
    val salary: String,
    val company: String,
    val location: String,
    val application: String,
    val vacancies: String,
    val hiringType: String,
    val experience: String,
    val description: String,
    val requirements: List<String>,
    val skills: List<String>,
)

val organizations = listOf(
    Organization(
        id = 1,
        title = "Android Developer",
        img = "https://avatars.githubusercontent.com/u/4256344?v=4",
        jobType = "Full-time",
        salary = "₹80,000 - ₹120,000",
        company = "Tech Solutions Ltd.",
        location = "New York, NY",
        application = "2 Applicants",
        vacancies = "3",
        hiringType = "Permanent!",
        experience = "3+ years",
        description = "Develop and maintain Android applications, collaborate with cross-functional teams, and ship new features.",
        requirements = listOf(
            "Proficiency in Kotlin and Java",
            "Experience with Jetpack Compose",
            "Understanding of RESTful APIs"
        ),
        skills = listOf(
            "Android Development",
            "Kotlin",
            "Jetpack Compose"
        )
    ),
    Organization(
        id = 2,
        title = "Full Stack Developer",
        img = "https://avatars.githubusercontent.com/u/425666",
        jobType = "Full-time",
        salary = "₹100,000 - ₹140,000",
        company = "Innovatech Inc.",
        location = "San Francisco, CA",
        application = "5 Applicants",
        vacancies = "2",
        hiringType = "Permanent!",
        experience = "4+ years",
        description = "Work on both frontend and backend applications using modern frameworks like React and Node.js.",
        requirements = listOf(
            "Experience with React and Node.js",
            "Strong understanding of microservices",
            "Familiarity with Docker and Kubernetes"
        ),
        skills = listOf(
            "Full Stack Development",
            "React",
            "Node.js"
        )
    ),
    Organization(
        id = 3,
        title = "Data Scientist",
        img = "https://avatars.githubusercontent.com/u/425633",
        jobType = "Full-time",
        salary = "₹90,000 - ₹130,000",
        company = "Data Insights Co.",
        location = "Chicago, IL",
        application = "2 day ago",
        vacancies = "4",
        hiringType = "Permanent!",
        experience = "2+ years",
        description = "Analyze data and build machine learning models to drive business decisions.",
        requirements = listOf(
            "Proficiency in Python and R",
            "Experience with data visualization tools",
            "Strong knowledge of statistical analysis"
        ),
        skills = listOf(
            "Data Analysis",
            "Machine Learning",
            "Python"
        )
    ),
    Organization(
        id = 4,
        title = "UI/UX Designer",
        img = "https://avatars.githubusercontent.com/u/425639",
        jobType = "Contract",
        salary = "₹60,000 - ₹90,000",
        company = "Creative Minds Studio",
        location = "Los Angeles, CA",
        application = "Submit",
        vacancies = "1",
        hiringType = "Contractual",
        experience = "5+ years",
        description = "Design user interfaces and experiences for web and mobile applications.",
        requirements = listOf(
            "Proficiency in Adobe XD and Figma",
            "Experience with user research",
            "Strong portfolio"
        ),
        skills = listOf(
            "UI Design",
            "UX Design",
            "Prototyping"
        )
    ),
    Organization(
        id = 5,
        title = "Project Manager",
        img = "https://avatars.githubusercontent.com/u/425630",
        jobType = "Full-time",
        salary = "₹110,000 - ₹150,000",
        company = "Enterprise Solutions Corp.",
        location = "Austin, TX",
        application = "5 day ago",
        vacancies = "1",
        hiringType = "Permanent!",
        experience = "7+ years",
        description = "Lead and manage projects, ensuring timely delivery and within budget.",
        requirements = listOf(
            "Experience with Agile methodologies",
            "Strong leadership skills",
            "PMP certification"
        ),
        skills = listOf(
            "Project Management",
            "Agile",
            "Leadership"
        )
    ),
    Organization(
        id = 5,
        title = "Project Manager",
        img = "https://avatars.githubusercontent.com/u/425630",
        jobType = "Full-time",
        salary = "₹110,000 - ₹150,000",
        company = "Enterprise Solutions Corp.",
        location = "Austin, TX",
        application = "Apply Online",
        vacancies = "1",
        hiringType = "Permanent!",
        experience = "7+ years",
        description = "Lead and manage projects, ensuring timely delivery and within budget.",
        requirements = listOf(
            "Experience with Agile methodologies",
            "Strong leadership skills",
            "PMP certification"
        ),
        skills = listOf(
            "Project Management",
            "Agile",
            "Leadership"
        )
    ),
    Organization(
        id = 5,
        title = "Project Manager",
        img = "https://avatars.githubusercontent.com/u/425630",
        jobType = "Full-time",
        salary = "₹110,000 - ₹150,000",
        company = "Enterprise Solutions Corp.",
        location = "Austin, TX",
        application = "2 day ago",
        vacancies = "1",
        hiringType = "Permanent!",
        experience = "7+ years",
        description = "Lead and manage projects, ensuring timely delivery and within budget.",
        requirements = listOf(
            "Experience with Agile methodologies",
            "Strong leadership skills",
            "PMP certification"
        ),
        skills = listOf(
            "Project Management",
            "Agile",
            "Leadership"
        )
    ),
    Organization(
        id = 5,
        title = "Project Manager",
        img = "https://avatars.githubusercontent.com/u/425630",
        jobType = "Full-time",
        salary = "₹110,000 - ₹150,000",
        company = "Enterprise Solutions Corp.",
        location = "Austin, TX",
        application = "Apply Online",
        vacancies = "1",
        hiringType = "Permanent!",
        experience = "7+ years",
        description = "Lead and manage projects, ensuring timely delivery and within budget.",
        requirements = listOf(
            "Experience with Agile methodologies",
            "Strong leadership skills",
            "PMP certification"
        ),
        skills = listOf(
            "Project Management",
            "Agile",
            "Leadership"
        )
    ),
    Organization(
        id = 5,
        title = "Project Manager",
        img = "https://avatars.githubusercontent.com/u/425630",
        jobType = "Full-time",
        salary = "₹110,000 - ₹150,000",
        company = "Enterprise Solutions Corp.",
        location = "Austin, TX",
        application = "Apply Online",
        vacancies = "1",
        hiringType = "Permanent!",
        experience = "7+ years",
        description = "Lead and manage projects, ensuring timely delivery and within budget.",
        requirements = listOf(
            "Experience with Agile methodologies",
            "Strong leadership skills",
            "PMP certification"
        ),
        skills = listOf(
            "Project Management",
            "Agile",
            "Leadership"
        )
    ),
    Organization(
        id = 5,
        title = "Project Manager",
        img = "https://avatars.githubusercontent.com/u/425630",
        jobType = "Full-time",
        salary = "₹110,000 - ₹150,000",
        company = "Enterprise Solutions Corp.",
        location = "Austin, TX",
        application = "Apply Online",
        vacancies = "1",
        hiringType = "Permanent!",
        experience = "7+ years",
        description = "Lead and manage projects, ensuring timely delivery and within budget.",
        requirements = listOf(
            "Experience with Agile methodologies",
            "Strong leadership skills",
            "PMP certification"
        ),
        skills = listOf(
            "Project Management",
            "Agile",
            "Leadership"
        )
    ),
    Organization(
        id = 5,
        title = "Project Manager",
        img = "https://avatars.githubusercontent.com/u/425630",
        jobType = "Full-time",
        salary = "₹110,000 - ₹150,000",
        company = "Enterprise Solutions Corp.",
        location = "Austin, TX",
        application = "Apply Online",
        vacancies = "1",
        hiringType = "Permanent!",
        experience = "7+ years",
        description = "Lead and manage projects, ensuring timely delivery and within budget.",
        requirements = listOf(
            "Experience with Agile methodologies",
            "Strong leadership skills",
            "PMP certification"
        ),
        skills = listOf(
            "Project Management",
            "Agile",
            "Leadership"
        )
    ), Organization(
        id = 5,
        title = "Project Manager",
        img = "https://avatars.githubusercontent.com/u/425630",
        jobType = "Full-time",
        salary = "₹110,000 - ₹150,000",
        company = "Enterprise Solutions Corp.",
        location = "Austin, TX",
        application = "Apply Online",
        vacancies = "1",
        hiringType = "Permanent!",
        experience = "7+ years",
        description = "Lead and manage projects, ensuring timely delivery and within budget.",
        requirements = listOf(
            "Experience with Agile methodologies",
            "Strong leadership skills",
            "PMP certification"
        ),
        skills = listOf(
            "Project Management",
            "Agile",
            "Leadership"
        )
    ),
    Organization(
        id = 5,
        title = "Project Manager",
        img = "https://avatars.githubusercontent.com/u/425630",
        jobType = "Full-time",
        salary = "₹110,000 - ₹150,000",
        company = "Enterprise Solutions Corp.",
        location = "Austin, TX",
        application = "Apply Online",
        vacancies = "1",
        hiringType = "Permanent!",
        experience = "7+ years",
        description = "Lead and manage projects, ensuring timely delivery and within budget.",
        requirements = listOf(
            "Experience with Agile methodologies",
            "Strong leadership skills",
            "PMP certification"
        ),
        skills = listOf(
            "Project Management",
            "Agile",
            "Leadership"
        )
    ),
    Organization(
        id = 5,
        title = "Project Manager",
        img = "https://avatars.githubusercontent.com/u/425630",
        jobType = "Full-time",
        salary = "₹110,000 - ₹150,000",
        company = "Enterprise Solutions Corp.",
        location = "Austin, TX",
        application = "Apply Online",
        vacancies = "1",
        hiringType = "Permanent!",
        experience = "7+ years",
        description = "Lead and manage projects, ensuring timely delivery and within budget.",
        requirements = listOf(
            "Experience with Agile methodologies",
            "Strong leadership skills",
            "PMP certification"
        ),
        skills = listOf(
            "Project Management",
            "Agile",
            "Leadership"
        )
    ), Organization(
        id = 5,
        title = "Project Manager",
        img = "https://avatars.githubusercontent.com/u/425630",
        jobType = "Full-time",
        salary = "₹110,000 - ₹150,000",
        company = "Enterprise Solutions Corp.",
        location = "Austin, TX",
        application = "Apply Online",
        vacancies = "1",
        hiringType = "Permanent!",
        experience = "7+ years",
        description = "Lead and manage projects, ensuring timely delivery and within budget.",
        requirements = listOf(
            "Experience with Agile methodologies",
            "Strong leadership skills",
            "PMP certification"
        ),
        skills = listOf(
            "Project Management",
            "Agile",
            "Leadership"
        )
    )

)
 
