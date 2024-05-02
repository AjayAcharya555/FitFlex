package aj.ajcoder.fitflex

object Constants {

    fun defaultExerciseList() : ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.jumpingjack,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val pushUp  = ExerciseModel(
            2,
            "PushUps",
            R.drawable.pushups,
            false,
            false
        )
        exerciseList.add(pushUp)

        val abdominalCrunch = ExerciseModel(
            3,
            "Abdominal Crunch",
            R.drawable.abdominalcrunch,
            false,
            false
        )
        exerciseList.add(abdominalCrunch)

        val wallsit = ExerciseModel(
            4,
            "WallSit",
            R.drawable.wallsit,
            false,
            false
        )
        exerciseList.add(wallsit)

        val sideplank = ExerciseModel(
            5,
            "SidePlank",
            R.drawable.sideplank,
            false,
            false
        )
        exerciseList.add(sideplank)

        val squat = ExerciseModel(
            6,
            "Squat",
            R.drawable.squat,
            false,
            false

        )
        exerciseList.add(squat)
        val lunge = ExerciseModel(
            7,
            "Lunge",
            R.drawable.lunge,
            false,
            false

        )
        exerciseList.add(lunge)

        val kneepushup =ExerciseModel(
            8,
            "Knee Pushup",
            R.drawable.kneepushup,
            false,
            false
        )
        exerciseList.add(kneepushup)
        val plankkicks =ExerciseModel(
            9,
            "Plank Kicks",
            R.drawable.plankkicks,
            false,
            false
        )
        exerciseList.add(plankkicks)

        val cobrapose = ExerciseModel(
            10,
            "Cobra Pose",
            R.drawable.cobrapose,
            false,
            false
        )
        exerciseList.add(cobrapose)

        val bodycrunch = ExerciseModel(
            11,
            "Body Crunch",
            R.drawable.bodycrunch,
            false,
            false
        )
        exerciseList.add(bodycrunch)

        val benchsitup = ExerciseModel(
            12,
            "BenchSitUps",
            R.drawable.benchsitup,
            false,
            false
        )
        exerciseList.add(benchsitup)








































        return exerciseList
    }
}