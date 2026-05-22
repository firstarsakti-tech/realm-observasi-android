package com.realmobservasi.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.realmobservasi.app.ui.theme.RealmObservasiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RealmObservasiTheme {
                RealmObservasiApp()
            }
        }
    }
}

data class Skill(
    val title: String,
    val desc: String,
    val progress: String,
    val task: String
)

@Composable
fun RealmObservasiApp() {
    val skills = listOf(
        Skill(
            title = "Melihat Bentuk",
            desc = "Mengenali bentuk dasar dan struktur objek.",
            progress = "1/3",
            task = "Foto 5 objek dan identifikasi bentuk dasarnya."
        ),
        Skill(
            title = "Melihat Warna",
            desc = "Memahami warna, harmoni, dan mood.",
            progress = "0/3",
            task = "Cari 5 kombinasi warna menarik di sekitarmu."
        ),
        Skill(
            title = "Melihat Cahaya",
            desc = "Memahami cahaya, bayangan, dan suasana.",
            progress = "0/3",
            task = "Foto objek yang sama pada pencahayaan berbeda."
        ),
        Skill(
            title = "Melihat Pola",
            desc = "Menemukan ritme dan pola visual.",
            progress = "0/3",
            task = "Temukan pola alami atau buatan manusia."
        ),
        Skill(
            title = "Melihat Makna",
            desc = "Menghubungkan simbol dan konteks.",
            progress = "0/3",
            task = "Catat simbol visual yang sering kamu lihat hari ini."
        )
    )

    val gradientBrush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF07111f),
            Color(0xFF10261b)
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(gradientBrush)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeaderCard()

            Spacer(modifier = Modifier.height(16.dp))

            RealmObjectiveCard()

            Spacer(modifier = Modifier.height(16.dp))

            MentorTipsCard()

            Spacer(modifier = Modifier.height(16.dp))

            skills.forEachIndexed { index, skill ->
                SkillCard(index + 1, skill)
                Spacer(modifier = Modifier.height(12.dp))
            }

            SkillAwarenessCard()

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Prototype mobile app — Realm Observasi Level 1",
                fontSize = 10.sp,
                color = Color(0xFF999999),
                modifier = Modifier.padding(bottom = 32.dp)
            )
        }
    }
}

@Composable
fun HeaderCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .background(
                color = Color(0xFF13263d),
                shape = RoundedCornerShape(24.dp)
            )
            .padding(16.dp)
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Start),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .background(Color(0xFF1b4d2e), RoundedCornerShape(50.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "👁️", fontSize = 32.sp)
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column {
                    Text(
                        text = "Realm Observasi",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        text = "Level 1 — Early Awareness",
                        fontSize = 12.sp,
                        color = Color(0xFF86efac)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "EXP Observasi", fontSize = 12.sp, color = Color.White)
                    Text(text = "20 / 100", fontSize = 12.sp, color = Color.White)
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(12.dp)
                        .background(Color(0xFF1a1a1a), RoundedCornerShape(6.dp))
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(0.2f)
                            .background(Color(0xFF86efac), RoundedCornerShape(6.dp))
                    )
                }
            }
        }
    }
}

@Composable
fun RealmObjectiveCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .background(
                color = Color(0xFF182f22),
                shape = RoundedCornerShape(24.dp)
            )
            .padding(16.dp)
    ) {
        Column {
            Text(
                text = "🎯 Tujuan Realm",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Belajar melihat dunia secara sadar. Realm ini melatih kepekaan visual, pengamatan detail, dan kemampuan menemukan makna di sekitar.",
                fontSize = 12.sp,
                color = Color(0xFFdcfce7),
                lineHeight = 16.sp
            )
        }
    }
}

@Composable
fun MentorTipsCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .background(
                color = Color(0xFF2a2418),
                shape = RoundedCornerShape(24.dp)
            )
            .padding(16.dp)
    ) {
        Column {
            Text(
                text = "💡 Tips Mentor",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Desainer hebat bukan yang paling jago menggambar, tapi yang paling sadar melihat dunia.",
                fontSize = 12.sp,
                color = Color(0xFFfef3c7),
                lineHeight = 16.sp
            )
        }
    }
}

@Composable
fun SkillCard(index: Int, skill: Skill) {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .background(
                color = Color(0xFF101d2b),
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp)
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "$index. ${skill.title}",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF86efac)
                    )
                    Text(
                        text = skill.desc,
                        fontSize = 12.sp,
                        color = Color(0xFFd1d5db),
                        modifier = Modifier.padding(top = 4.dp)
                    )
                }

                Box(
                    modifier = Modifier
                        .background(Color(0xFF1b4d2e), RoundedCornerShape(50.dp))
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = skill.progress,
                        fontSize = 10.sp,
                        color = Color(0xFF86efac)
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF0a0a0a), RoundedCornerShape(12.dp))
                    .padding(12.dp)
            ) {
                Column {
                    Text(
                        text = "QUEST",
                        fontSize = 10.sp,
                        color = Color(0xFF4ade80),
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Text(
                        text = skill.task,
                        fontSize = 12.sp,
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF22c55e),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "Mulai Quest",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

@Composable
fun SkillAwarenessCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .background(
                color = Color(0xFF151515),
                shape = RoundedCornerShape(24.dp)
            )
            .padding(16.dp)
    ) {
        Column {
            Text(
                text = "🏆 Skill Awareness",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            ProgressItem("Noticing", 10, Color(0xFF86efac))
            Spacer(modifier = Modifier.height(12.dp))

            ProgressItem("Sensitivity", 5, Color(0xFFfacc15))
            Spacer(modifier = Modifier.height(12.dp))

            ProgressItem("Pattern Recognition", 2, Color(0xFF60a5fa))
        }
    }
}

@Composable
fun ProgressItem(label: String, percentage: Int, color: Color) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = label, fontSize = 12.sp, color = Color.White)
            Text(text = "$percentage%", fontSize = 12.sp, color = Color.White)
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(8.dp)
                .background(Color(0xFF2a2a2a), RoundedCornerShape(4.dp))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(percentage / 100f)
                    .background(color, RoundedCornerShape(4.dp))
            )
        }
    }
}