import com.example.gym4jim.classes.Exercise
import com.example.gym4jim.R

val allExercises = listOf(
    Exercise(
        id = "benchpress",
        name = "Bench press",
        image_files = listOf(R.drawable.benchpress_photo, R.drawable.benchpress_photo_2),
        video_file = R.raw.benchpress_video,
        description = "The bench press builds strength and size in your chest, shoulders, and triceps, while also improving overall upper-body power and posture. It's a staple lift for anyone looking to push heavy weight and is often seen as a true test of raw strength—hence the classic gym question: \"How much do you bench?\" ",
        execution = "Lie flat with feet on the ground, shoulder blades tight, and core engaged. Grip the bar just wider than shoulder-width, lower it slowly to your lower chest with elbows at a 45° angle, then press it back up with control. Keep your whole body tight—benching is more than just pushing with your arms.",
        jims_tip = "Press till you make it to the press!!",
        category = "Gym"
    ),
    Exercise(
        id = "deadlift",
        name = "Deadlift",
        image_files = listOf(R.drawable.deadlift_photo, R.drawable.deadlift_photo_2),
        video_file = R.raw.deadlift_video,
        description = "The deadlift is a total-body powerhouse. It targets your glutes, hamstrings, lower back, and core while improving posture and grip strength. It’s one of the most functional lifts, mimicking the simple act of picking something up off the ground—but heavier.",
        execution = "Stand with your feet hip-width apart, bar over the mid-foot. Grip just outside your knees, flatten your back, brace your core. Drive through your heels, extend your hips and knees simultaneously, and stand tall. Reverse the motion with control.",
        jims_tip = "Pick it up like your future depends on it—'cause it does.",
        category = "Gym"
    ),
    Exercise(
        id = "legpress",
        name = "Leg Press",
        image_files = listOf(R.drawable.legpress_photo, R.drawable.legpress_photo_2),
        video_file = R.raw.legpress_video,
        description = "The leg press isolates your quads, hamstrings, and glutes without putting strain on your back. It's perfect for building raw leg strength in a safe and controlled movement pattern.",
        execution = "Sit in the machine with your back flat and feet shoulder-width on the platform. Unlock the safety bars and lower the weight until your knees form a 90° angle. Push through your heels to return to the start position. Don't lock your knees.",
        jims_tip = "Legs win fights. Press them like you mean it.",
        category = "Gym"
    ),
    Exercise(
        id = "squat",
        name = "Squat",
        image_files = listOf(R.drawable.squat_photo, R.drawable.squat_photo_2),
        video_file = R.raw.squat_video,
        description = "The squat is the king of compound movements. It builds strength in the legs, glutes, core, and back. It also enhances balance, mobility, and athleticism like no other single exercise.",
        execution = "Stand with feet shoulder-width apart, toes slightly turned out. Keep your chest up, core braced, and lower your hips back and down. Drive through your heels to return to standing. Keep knees tracking over your toes.",
        jims_tip = "Squat deep. You’re not dodging responsibility here.",
        category = "Gym"
    ),
    Exercise(
        id = "dips",
        name = "Dips",
        image_files = listOf(R.drawable.dips_photo, R.drawable.dips_photo_2),
        video_file = R.raw.dips_video,
        description = "Dips are a brutal but effective upper-body workout. They hammer the chest, triceps, and shoulders while building real pushing strength. No machines, just gravity and grit.",
        execution = "Grip the parallel bars, arms locked. Lower your body slowly by bending your elbows until your shoulders are just below your elbows. Press back up explosively. Keep your body upright for triceps focus, or lean forward for chest activation.",
        jims_tip = "If it burns, it works. Keep going.",
        category = "Calisthenics"
    ),
    Exercise(
        id = "plank",
        name = "Plank",
        image_files = listOf(R.drawable.plank_photo, R.drawable.plank_photo_2),
        video_file = R.raw.plank_video,
        description = "The plank is deceptively simple but incredibly effective. It builds core stability, improves posture, and strengthens your entire midsection without any movement at all.",
        execution = "Place forearms on the floor, elbows under shoulders. Extend legs back, keeping your body in a straight line. Engage your core, glutes, and quads. Don’t let your hips sag or rise. Hold steady.",
        jims_tip = "Stillness is strength. Shake it off and hold it in.",
        category = "Calisthenics"
    ),
    Exercise(
        id = "pullup",
        name = "Pull-up",
        image_files = listOf(R.drawable.pullup_photo, R.drawable.pullup_photo_2),
        video_file = R.raw.pullup_video,
        description = "The pull-up is a badge of honor. It challenges your upper body with bodyweight resistance, especially the back, biceps, and shoulders. Master it, and you've earned real strength.",
        execution = "Hang from a pull-up bar with a grip just outside shoulder-width. Engage your lats and pull your chin over the bar. Lower slowly. No swinging, no shortcuts—just controlled power.",
        jims_tip = "Pull yourself up. No one else will.",
        category = "Calisthenics"
    ),
    Exercise(
        id = "pushup",
        name = "Push-up",
        image_files = listOf(R.drawable.pushup_photo, R.drawable.pushup_photo_2),
        video_file = R.raw.pushup_video,
        description = "Push-ups are the most iconic bodyweight exercise. They build chest, shoulders, triceps, and core, and they require nothing but your own determination.",
        execution = "Place hands slightly wider than shoulders. Lower your chest toward the ground while keeping your elbows at about a 45° angle. Push back up explosively. Keep your body straight throughout.",
        jims_tip = "No excuses, just reps. Drop and give me 10.",
        category = "Calisthenics"
    ),
    Exercise(
        id = "biking",
        name = "Biking",
        image_files = listOf(R.drawable.biking_photo, R.drawable.biking_photo_2),
        video_file = R.raw.biking_video,
        description = "Biking is a low-impact cardio workout that strengthens the legs, improves cardiovascular health, and burns serious calories. It's great for endurance and joint-friendly fat loss.",
        execution = "Adjust the seat height so your knee is slightly bent at the bottom of the pedal stroke. Maintain steady rhythm, engage your core, and keep your back upright. Pace yourself—but don’t coast too long.",
        jims_tip = "Spin it till your legs scream. Then do one more mile.",
        category = "Cardio"
    ),
    Exercise(
        id = "hiking",
        name = "Hiking",
        image_files = listOf(R.drawable.hiking_photo, R.drawable.hiking_photo_2),
        video_file = R.raw.hiking_video,
        description = "Hiking blends cardio with nature therapy. It strengthens your legs and lungs while giving your mind a break from the digital chaos. Hills, trails, or mountains—it all counts.",
        execution = "Wear proper shoes and pack water. Maintain a steady pace, keep your spine neutral, and engage your glutes during inclines. Use trekking poles for stability if needed.",
        jims_tip = "Touch grass. But with intensity.",
        category = "Cardio"
    ),
    Exercise(
        id = "jogging",
        name = "Jogging",
        image_files = listOf(R.drawable.jogging_photo, R.drawable.jogging_photo_2),
        video_file = R.raw.jogging_video,
        description = "Jogging is a classic endurance builder. It boosts heart health, burns fat, and clears your head. It’s steady, rhythmic, and sustainable—your gateway to long-term fitness.",
        execution = "Keep an upright posture, arms bent at 90°, and shoulders relaxed. Land mid-foot and push off smoothly. Focus on breathing rhythm: in through the nose, out through the mouth.",
        jims_tip = "One step at a time beats sitting every time.",
        category = "Cardio"
    ),
    Exercise(
        id = "swimming",
        name = "Swimming",
        image_files = listOf(R.drawable.swimming_photo, R.drawable.swimming_photo_2),
        video_file = R.raw.swimming_video,
        description = "Swimming is a full-body cardio blast. It builds strength, endurance, and lung capacity, all while being joint-friendly. Plus, it’s one of the few exercises where breathing is a skill.",
        execution = "Choose your stroke, maintain streamline form, and coordinate breathing with your strokes. Focus on technique over speed. Keep hips near the surface for efficiency.",
        jims_tip = "Don’t drown. Dominate.",
        category = "Cardio"
    )
)